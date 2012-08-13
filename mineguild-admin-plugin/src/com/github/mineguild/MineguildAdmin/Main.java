package com.github.mineguild.MineguildAdmin;


public class Main extends org.bukkit.plugin.java.JavaPlugin {
private MGACommandExecutor myExecutor;
@Override
//Enabling Plugin
public void onEnable(){
myExecutor = new MGACommandExecutor ();
getCommand("test").setExecutor(myExecutor);
getLogger().info("MineguildAdmin has been enabled!");
}
//Disabling Plugin
public void onDisable(){
	getLogger().info("MineguildAdmin has been disable!");
}
}