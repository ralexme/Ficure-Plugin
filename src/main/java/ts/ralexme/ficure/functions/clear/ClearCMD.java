package ts.ralexme.ficure.functions.clear;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import org.bukkit.ChatColor;

public class ClearCMD implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if(strings[0].equalsIgnoreCase("chat")){
            for(int i = 0; i < 100; i++) {
                commandSender.sendMessage("          ");
            }
            commandSender.sendMessage(ChatColor.YELLOW + "[server_prefix]" + ChatColor.DARK_GRAY +" ->" + ChatColor.GREEN + "You're chat successfully cleaned!");
            return true;
        }
        return false;
    }
}