package net.havengarde.aureycore.plugin;

import net.havengarde.aureycore.actionbarengine.ActionBarEngine;
import net.havengarde.aureycore.customguis.CustomGUIManager;
import net.havengarde.aureycore.damageindicator.DamageIndicatorAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class Aureycore extends JavaPlugin {
    @Override
    public void onEnable() {
        ActionBarEngine.start(this);
        DamageIndicatorAPI.start(this);
        getServer().getPluginManager().registerEvents(new CustomGUIManager(), this);
    }

    @Override
    public void onDisable() {
        ActionBarEngine.stop(false);
        DamageIndicatorAPI.stop();
    }
}
