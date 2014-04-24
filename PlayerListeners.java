package me.pvp.listeners;

import me.pvp.main.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerListeners implements Listener {
	
	Main Plugin;
	public PlayerListeners(Main instance) {
		this.Plugin = instance;
		
	}
	//when player joins
	
	@EventHandler
	public void PlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		String pname = p.getName();
		
		
		//giving the player the kit selector
		ItemStack kitselector = new ItemStack(Material.COMPASS);
		ItemMeta m = kitselector.getItemMeta();
		m.setDisplayName("" + ChatColor.GREEN + ChatColor.BOLD + "Kit Selector");
		kitselector.setItemMeta(m);
		p.getInventory().setItem(4, kitselector);
		
		
	}
		//end of player join event
	
	//when player leaves server
	
	//end of player leave
	
	@EventHandler
	public void Respawn(PlayerRespawnEvent e) {
		Player p = e.getPlayer();
		ItemStack kitselector = new ItemStack(Material.COMPASS);
		ItemMeta m = kitselector.getItemMeta();
		m.setDisplayName("" + ChatColor.GREEN + ChatColor.BOLD + "Kit Selector");
		kitselector.setItemMeta(m);
		p.getInventory().setItem(4, kitselector);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
