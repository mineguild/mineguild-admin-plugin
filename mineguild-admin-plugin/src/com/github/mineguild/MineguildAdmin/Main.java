package com.github.mineguild.MineguildAdmin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import com.github.mineguild.MineguildAdmin.Commands.CommandGM;

public class Main extends JavaPlugin {
	@Override
	public void onDisable() {
		System.out.println("MineguildAdmin Ver. " + this.getDescription().getVersion() + "wurde deaktiviert!");
	}
	@Override
	public void onEnable() {
		System.out.println("MineguildAdmin Ver. " + this.getDescription().getVersion() + " wurde aktiviert!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args){
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("gm")){
			return new CommandGM(cmd, args, p).execute();
		}
		
		return false;
		
	}
}