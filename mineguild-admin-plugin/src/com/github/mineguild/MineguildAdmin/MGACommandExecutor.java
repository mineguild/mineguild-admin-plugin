package com.github.mineguild.MineguildAdmin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MGACommandExecutor implements CommandExecutor {

	@Override
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
			if(cmd.getName().equalsIgnoreCase("version")){
				//Show version to sender and return true
				sender.sendMessage("MineguildAdmin V0.2");
				return true;
			}
			if(cmd.getName().equalsIgnoreCase("test")){
				//Show version to sender and return true
				sender.sendMessage("Test");
				return true;
			}
		return false;
	}

}
