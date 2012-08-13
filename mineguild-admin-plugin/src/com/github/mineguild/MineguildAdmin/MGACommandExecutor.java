package com.github.mineguild.MineguildAdmin;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MGACommandExecutor implements CommandExecutor {

	public MGACommandExecutor(Main plugin) {
	}
	@Override
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
			if(cmd.getName().equalsIgnoreCase("mga")){
				if (args.length == 0){
					return false;
				}
				if (args[0].equalsIgnoreCase("version")) {
				//Show version to sender and return true
				sender.sendMessage("MineguildAdmin V0.3");
				return true;
				}
			}
		 if(cmd.getName().equalsIgnoreCase("gm")){
			 Player p = (Player) sender;
			 if(args.length == 0){
				 if (p.getGameMode().equals(GameMode.SURVIVAL)){
					 p.setGameMode(GameMode.CREATIVE);
					 return true;
				 }
				 if (p.getGameMode().equals(GameMode.CREATIVE)){
					 p.setGameMode(GameMode.SURVIVAL);
					 return true;
				 }
			 }
		 }
		 return false;
	}

}

