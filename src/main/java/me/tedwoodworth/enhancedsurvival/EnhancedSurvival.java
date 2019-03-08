package me.tedwoodworth.enhancedsurvival;

import me.tedwoodworth.enhancedsurvival.sleep.SleepManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class EnhancedSurvival extends JavaPlugin {

    @Override
    public void onEnable() {
        // Code run when the plugin is enabled.

        System.out.println("Hello, world!");

        // Register the events in the Listeners class.
        Bukkit.getPluginManager().registerEvents(new Listeners(), this);


        SleepManager sleepManager=new SleepManager(this);
    sleepManager.setup();
    }

    @Override
    public void onDisable() {
        // Code run when the plugin is disabled.

        System.out.println("Goodbye, world!");
    }
}
