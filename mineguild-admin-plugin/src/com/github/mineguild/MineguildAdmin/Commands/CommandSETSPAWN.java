package com.github.mineguild.MineguildAdmin.Commands;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.github.mineguild.MineguildAdmin.Main;

public class CommandSETSPAWN {
	
	Command cmd;
	String[] args;
	Player p;
	String cpath;
	Vector v;
	Main plugin;
	

	
	
	
	public CommandSETSPAWN(Command cmd, String[] args, Player p, Main plugin){
		this.cmd = cmd;
		this.args = args;
		this.p = p;
		this.cpath = "Config.spawn.";
		this.plugin = plugin;
	}
	
	public boolean execute(){
		if(p instanceof Player){
			v = p.getLocation().toVector();
			plugin.getConfig().createSection("Config.spawn");
			plugin.saveDefaultConfig();
			plugin.getConfig().set(cpath + "v", "test");
			plugin.saveDefaultConfig();
			return true;
		}
		else{
			p.sendMessage("Dieses Kommando kann nur als Spieler ausgeführt werden.");
			return true;
		}
	}

}

