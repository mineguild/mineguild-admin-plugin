package com.github.mineguild.MineguildAdmin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Main extends org.bukkit.plugin.java.JavaPlugin {
//Enabling Plugin
public void onEnable(){
	getLogger().info("MineguildAdmin has been enabled!");
}
//Disabling Plugin
public void onDisable(){
	getLogger().info("MineguildAdmin has been disabled!");
}
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	if(cmd.getName().equalsIgnoreCase("test")){
		//Do nothing only return true
		sender.sendMessage("Du bist nett :D");
	}
	//Else return false
	return false;
}
}