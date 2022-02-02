package me.libraryaddict.disguise.commands.libsdisguises;

import java.util.List;
import me.libraryaddict.disguise.utilities.translations.LibsMsg;
import org.bukkit.command.CommandSender;

/**
 * Created by libraryaddict on 20/04/2020.
 */
public interface LDCommand {
    List<String> getTabComplete();

    boolean hasPermission(CommandSender sender);

    String getPermission();

    void onCommand(CommandSender sender, String[] args);

    LibsMsg getHelp();
}
