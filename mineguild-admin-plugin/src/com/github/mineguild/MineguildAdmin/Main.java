package com.github.mineguild.MineguildAdmin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.util.Vector;

public class Main extends org.bukkit.plugin.java.JavaPlugin {

	
//Calling MGACommandExecutor as Executor
private MGACommandExecutor CMDEXE;
@Override
//Enabling Plugin
public void onEnable(){
	//Getting Plugin Description
	PluginDescriptionFile pdffile = this.getDescription();
	
	//Interpreting CMDEXE
	CMDEXE = new MGACommandExecutor (null);
	
	if(this.getConfig().get("spawn.vector") == null)
		this.getConfig().set("spawn.vector", 0);
	if(this.getConfig().get("spawn.pitch") == null)
		this.getConfig().set("spawn.pitch", 0);
	if(this.getConfig().get("spawn.yaw") == null)
		this.getConfig().set("spawn.yaw", 0);
	
	//Sending commands to MGACommandExecutor
	getCommand("gm").setExecutor(CMDEXE);
	getCommand("heal").setExecutor(CMDEXE);
	getCommand("check").setExecutor(CMDEXE);
	getCommand("feed").setExecutor(CMDEXE);
	getCommand("spawn").setExecutor(CMDEXE);
	getCommand("setspawn").setExecutor(CMDEXE);
	getCommand("i").setExecutor(CMDEXE);
	
	getConfig().options().copyDefaults(true);
	//Send message to console
	getLogger().info("MineguildAdmin V" + pdffile.getVersion() + " has been enabled!");
}
//Disabling Plugin
public void onDisable(){
	//Getting Plugin description file
	PluginDescriptionFile pdffile = this.getDescription();
	getLogger().info("MineguildAdmin V" + pdffile.getVersion() + " has been disabled!");
}



public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	if(cmd.getName().equalsIgnoreCase("mga")){
		//If the args are length 0 or the args[0] isnt equal "version" it will return false
		if (args.length == 0 || !args[0].equalsIgnoreCase("version")){
			return false;
		}
		if (args[0].equalsIgnoreCase("version")) {
			PluginDescriptionFile pdffile = this.getDescription();
			String v = pdffile.getVersion();
			//Show version to sender and return true if the value of args[0] is equal to "version"
			sender.sendMessage(ChatColor.AQUA + "[MGA]" + ChatColor.WHITE + "MineguildAdmin" + ChatColor.BLUE + "V" + v);
			return true;
		}
		return false;
	}
	//Introducing /setspawn
	 if(cmd.getName().equalsIgnoreCase("setspawn")){
		 if(sender instanceof Player){
			 Player p = (Player) sender;
			 int x = p.getLocation().getBlockX();
			 int y = p.getLocation().getBlockY();
			 int z = p.getLocation().getBlockZ();
			 float pitch = p.getLocation().getPitch();
			 float yaw = p.getLocation().getYaw();
			 Vector v = p.getLocation().toVector();
			 this.getConfig().set("spawn.vector", v);
			 this.getConfig().set("spawn.pitch", pitch);
			 this.getConfig().set("spawn.yaw", yaw);
//			 p.getWorld().setSpawnLocation(x, y, z);
//			 sender.sendMessage(pre + "The spawn point was set to you location");
			 sender.sendMessage("Test" + v);
			 return true;
		 }
		 else{
			 sender.sendMessage(ChatColor.RED + "You only can use this command as player!");
			 return true;
		 }
	 }
return false;
}
}
