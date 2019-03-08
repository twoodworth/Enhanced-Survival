package me.tedwoodworth.enhancedsurvival.sleep;

import org.bukkit.plugin.Plugin;

public class SleepManager {
    private Plugin plugin;

    public SleepManager(Plugin plugin) {
        this.plugin = plugin;
    }


    public void setup() {
        SleepRegenTimer sleepRegenTimer = new SleepRegenTimer(plugin);
        sleepRegenTimer.start();
    }

}
