package me.pvp.main;

import me.pvp.listeners.PlayerListeners;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	private static Main instance;
	
	public void log(String string) {
		System.out.println(string);
	}
		public static Main getInstance(){
			return instance;
		}
		public void registerListeners(){
			PluginManager pm = getServer().getPluginManager();
			pm.registerEvents(new PlayerListeners(this), this);
			
		}
		public void registerCommands(){
			//Not Until Later
		}
		//when is enabled
		@Override 
		public void onEnable(){
			getLogger().info("has been enabled successfully!");
			instance = this;
			registerListeners();
			registerCommands();
		}
		
		@Override
		public void onDisable(){
			getLogger().info("has been disabled successfully!");
			instance = null;
		}
		//commands
		
		public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
			//starter command
		if (cmd.getName().equalsIgnoreCase("starter") && sender instanceof Player) {
			Player p = (Player) sender;
			p.getInventory().clear();
			ItemStack starterbow = new ItemStack(Material.BOW);
			ItemMeta m = starterbow.getItemMeta();
			m.setDisplayName("" + ChatColor.GREEN + ChatColor.BOLD + "Starter Bow");
			starterbow.setItemMeta(m);
			starterbow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
			p.getInventory().addItem(starterbow);
			p.getInventory().addItem(new ItemStack(Material.ARROW, 1));
			p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
			p.setMaxHealth(20);
			p.setHealth(20);
			p.sendMessage(ChatColor.RED + "Recived Kit " + ChatColor.DARK_PURPLE + "Starter!");
			
		}
			
			
			
			
			return false;
			
			
			
		}
	}
	

