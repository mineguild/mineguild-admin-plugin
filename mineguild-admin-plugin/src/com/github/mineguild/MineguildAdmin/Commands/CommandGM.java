package com.github.mineguild.MineguildAdmin.Commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class CommandGM {
	
	Command cmd;
	String[] args;
	Player p;
	Player target;
	
	
	
	public CommandGM(Command cmd, String[] args, Player p){
		this.cmd = cmd;
		this.args = args;
		this.p = p;
	}

	public boolean execute(){
		if(args.length == 0){
			target = p;
		}
		else if(args.length == 1){
			try{
				target = p.getServer().getPlayer(args[0]);
			} catch(NullPointerException e){
				p.sendMessage(args[0] + " ist nicht online!");
				return false;
			}
		}
		if(target.getGameMode() == GameMode.SURVIVAL)
			target.setGameMode(GameMode.CREATIVE);
		else if(target.getGameMode() == GameMode.CREATIVE)
			target.setGameMode(GameMode.SURVIVAL);
		return true;
	}
}
