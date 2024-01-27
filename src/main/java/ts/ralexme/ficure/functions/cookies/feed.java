package ts.ralexme.ficure.functions.cookies;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class feed implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (!(commandSender instanceof Player)) return true; //Check for player
        Player player = (Player) commandSender;

        if(command.getName().equalsIgnoreCase("feed")){
            player.setFoodLevel(40);
            commandSender.sendMessage((ChatColor.YELLOW + "[server_prefix]" + ChatColor.DARK_GRAY +
                    " -> " + ChatColor.GRAY + " You were feeded!"));

            return true;
        }

        return false;
    }
}
