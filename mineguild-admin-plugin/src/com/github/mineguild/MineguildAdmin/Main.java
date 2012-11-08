package com.github.mineguild.MineguildAdmin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import com.github.mineguild.MineguildAdmin.Commands.*;

public class Main extends JavaPlugin {
	@Override
	public void onDisable() {
		System.out.println("MineguildAdmin Ver. " + this.getDescription().getVersion() + "wurde deaktiviert!");
		this.saveDefaultConfig();
	}
	@Override
	public void onEnable() {
		System.out.println("MineguildAdmin Ver. " + this.getDescription().getVersion() + " wurde aktiviert!");
		this.getConfig().options().copyDefaults(true);
		this.saveDefaultConfig();
		this.getConfig().createSection("Config.spawn");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args){
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("gm")){
			return new CommandGM(cmd, args, p).execute();
		}
		
		if(cmd.getName().equalsIgnoreCase("setspawn")){
			return new CommandSETSPAWN(cmd, args, p, this).execute();
		}
		
		return false;
		
	}
}