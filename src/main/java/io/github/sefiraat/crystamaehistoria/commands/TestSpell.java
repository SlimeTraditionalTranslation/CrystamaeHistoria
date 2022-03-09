package io.github.sefiraat.crystamaehistoria.commands;

import io.github.mooy1.infinitylib.commands.SubCommand;
import io.github.sefiraat.crystamaehistoria.magic.CastInformation;
import io.github.sefiraat.crystamaehistoria.magic.SpellType;
import io.github.sefiraat.crystamaehistoria.magic.spells.core.Spell;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

public class TestSpell extends SubCommand {

    public TestSpell() {
        super("test-spell", "施展選定法術", true);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void execute(CommandSender sender, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length != 2) {
                return;
            }
            int power = Integer.parseInt(args[1]);
            if (power <= 5) {
                Spell spell = SpellType.getById(args[0]);
                if (spell != null) {
                    spell.castSpell(new CastInformation((Player) sender, power));
                } else {
                    player.sendMessage(ThemeType.ERROR.getColor() + "法術並不存在或非常損壞!");
                }
            }
        }
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void complete(CommandSender commandSender, String[] strings, List<String> list) {
        if (strings.length == 1) {
            for (SpellType spell : SpellType.getEnabledSpells()) {
                list.add(spell.name());
            }
        }
    }

}