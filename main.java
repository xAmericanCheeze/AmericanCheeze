package me.gallantmo.main;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static Main plugin;
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdffile = this.getDescription();
		this.logger.info(pdffile.getName() + "has been disabled!");
		
	}
	
	@Override
	public void onEnable(){
		PluginDescriptionFile pdffile = this.getDescription();
		this.logger.info(pdffile.getName() + "Version " + pdffile.getVersion() + "has been disabled!");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("fly")) {
			boolean flying = false;
			if(flying == false){
				player.setFlying(isEnabled());
				player.sendMessage(ChatColor.GRAY + "Fly Mode Is Now Enabled");
				flying = true;
			}
			if(commandLabel.equalsIgnoreCase("fly")) {
				
				if(flying == false){
					player.setFlying(isEnabled());
					flying = true;
				}
				if(flying == true){
					
				}
`			return false;

			}
			
	}
	
}
