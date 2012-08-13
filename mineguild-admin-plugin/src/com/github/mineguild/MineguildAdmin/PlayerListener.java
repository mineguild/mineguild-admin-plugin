package com.github.mineguild.MineguildAdmin;

//Import the needed methods
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

//PlayerListener, dont know what im doing there...
public class PlayerListener implements Listener {
	@EventHandler(priority = EventPriority.LOW) //Setting priority to low we don´t need that now
	public void onPlayerLoginEvent(PlayerLoginEvent event){
		
	}

}
