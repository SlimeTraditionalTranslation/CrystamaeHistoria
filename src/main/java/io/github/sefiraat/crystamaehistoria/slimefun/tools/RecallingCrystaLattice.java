package io.github.sefiraat.crystamaehistoria.slimefun.tools;

import de.jeff_media.morepersistentdatatypes.DataType;
import io.github.sefiraat.crystamaehistoria.slimefun.gadgets.Waystone;
import io.github.sefiraat.crystamaehistoria.utils.GeneralUtils;
import io.github.sefiraat.crystamaehistoria.utils.Keys;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;

import javax.annotation.ParametersAreNonnullByDefault;
import java.text.MessageFormat;
import java.util.Optional;

public class RecallingCrystaLattice extends SlimefunItem {

    @ParametersAreNonnullByDefault
    public RecallingCrystaLattice(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        addItemHandler((ItemUseHandler) e -> {
            if (e.getPlayer().isSneaking()) {
                setLocation(e);
            } else {
                teleport(e);
            }
        });
    }

    private void setLocation(PlayerRightClickEvent event) {
        final Optional<Block> blockOptional = event.getClickedBlock();

        if (blockOptional.isPresent()) {
            final Block block = blockOptional.get();
            final SlimefunItem slimefunItem = BlockStorage.check(block);
            final Location location = block.getLocation();
            final Player player = event.getPlayer();

            if (slimefunItem instanceof Waystone
                && GeneralUtils.hasPermission(player, location, Interaction.PLACE_BLOCK)
            ) {
                final ItemStack itemStack = event.getItem();
                final ItemMeta itemMeta = itemStack.getItemMeta();
                final PersistentDataContainer container = itemMeta.getPersistentDataContainer();

                container.set(Keys.newKey("location"), DataType.LOCATION, location);
                itemStack.setItemMeta(itemMeta);
                player.sendMessage(
                    MessageFormat.format("{0}在聊天室輸入這個岔出的路石的名稱.", ChatColor.LIGHT_PURPLE)
                );
                ChatUtils.awaitInput(player, s -> renameItem(s, itemStack));
            }
        }
    }

    private void teleport(PlayerRightClickEvent event) {
        final ItemStack itemStack = event.getItem();
        final ItemMeta itemMeta = itemStack.getItemMeta();
        final PersistentDataContainer container = itemMeta.getPersistentDataContainer();
        final Location location = container.get(Keys.newKey("location"), DataType.LOCATION);
        final Block block = location.getBlock();
        final SlimefunItem slimefunItem = BlockStorage.check(block);

        if (slimefunItem instanceof Waystone
            && GeneralUtils.hasPermission(event.getPlayer(), location, Interaction.PLACE_BLOCK)
        ) {
            event.getPlayer().teleportAsync(location.add(1, 1, 1), PlayerTeleportEvent.TeleportCause.PLUGIN);
        } else {
            event.getPlayer().sendActionBar(
                Component.text("Waystone connection isn't functional")
                    .color(TextColor.color(200, 30, 40))
            );
        }
    }

    private void renameItem(String s, ItemStack itemStack) {
        final ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.setDisplayName(ThemeType.TOOL.getColor() + s);
        itemStack.setItemMeta(itemMeta);
    }
}
