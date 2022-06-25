package io.github.vaatik.craftablesaddles;

import org.bukkit.plugin.java.JavaPlugin;

public class CraftableSaddles extends JavaPlugin {
    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        getLogger().info("CraftableSaddles 1.0.0 for Minecraft Spigot 1.19 enabled");
        CraftableSaddlesRecipe saddleRecipe = new CraftableSaddlesRecipe(this);
    }

    @Override
    public void onDisable() {
        getLogger().info("CraftableSaddles 1.0.0 for Minecraft Spigot 1.19 disabled");
    }
}