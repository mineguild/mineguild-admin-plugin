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
	getLogger().info("MineguildAdmin has been disable!");
}
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
	//Else return false
	return false;
}
}