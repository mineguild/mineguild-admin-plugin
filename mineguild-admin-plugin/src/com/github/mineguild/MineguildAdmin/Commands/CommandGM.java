package com.github.mineguild.MineguildAdmin.Commands;

import org.bukkit.ChatColor;
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
		if(p instanceof Player){
			if(args.length == 0){
				target = p;
			}
			else if(args.length == 1){
				
				
				try{
					target = (Player) p.getServer().getPlayer(args[0]);
					if(!target.isOnline()){
						throw new NullPointerException();
					}
				} catch(NullPointerException e){
					p.sendMessage("Der Spieler " + args[0] + " ist nicht online/existiert nicht!");
					return false;
				}
			}
			
			
			if(target.getGameMode() == GameMode.SURVIVAL)
				target.setGameMode(GameMode.CREATIVE);
			else if(target.getGameMode() == GameMode.CREATIVE)
				target.setGameMode(GameMode.SURVIVAL);
			return true;
		}
		else{
			p.sendMessage(ChatColor.RED + "Dieses Kommando kannst du noch nicht von der Konsole aus ausführen!");
		}
		return false;
	}
}
