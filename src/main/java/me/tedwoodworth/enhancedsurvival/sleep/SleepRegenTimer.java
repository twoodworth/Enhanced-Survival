package me.tedwoodworth.enhancedsurvival.sleep;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class SleepRegenTimer {

    private final long REGEN_DELAY = 30 * 20; // 30 seconds

    private final Plugin plugin;

    SleepRegenTimer(Plugin plugin) {
        this.plugin = plugin;
    }

    void start() {
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, this::onTimerTick, 0, REGEN_DELAY);
    }


    private void onTimerTick() {
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (p.isSleeping()) {
                p.setHealth(p.getHealth() + 1);
            }
        }
    }
}
