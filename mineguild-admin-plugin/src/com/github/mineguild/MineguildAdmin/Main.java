package com.github.mineguild.MineguildAdmin;


public class Main extends org.bukkit.plugin.java.JavaPlugin {
//Calling MGACommandExecutor as Executor
private MGACommandExecutor myExecutor;
@Override
//Enabling Plugin
public void onEnable(){
myExecutor = new MGACommandExecutor ();
//Sending commands to MGACommandExecutor
getCommand("test").setExecutor(myExecutor);
getCommand("version").setExecutor(myExecutor);
getLogger().info("MineguildAdmin has been enabled!");
}
//Disabling Plugin
public void onDisable(){
	getLogger().info("MineguildAdmin has been disabled!");
}
}