package io.github.vaatik.craftablesaddles;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class CraftableSaddlesRecipe {
    private static FileConfiguration configuration;

    public CraftableSaddlesRecipe(CraftableSaddles plugin) {
        CraftableSaddlesRecipe.configuration = plugin.getConfig();
        plugin.saveConfig();

        if(CraftableSaddlesRecipe.configuration.getBoolean("enabled")) {
            ItemStack saddle = new ItemStack(Material.SADDLE);
            ItemMeta meta = saddle.getItemMeta();

            saddle.setItemMeta(meta);
            NamespacedKey key = new NamespacedKey(plugin, "saddle");
            ShapedRecipe recipe = new ShapedRecipe(key, saddle);

            recipe.shape(" W ", "LLL", "I I");
            recipe.setIngredient('W', Material.WHITE_CARPET);
            recipe.setIngredient('L', Material.LEATHER);
            recipe.setIngredient('I', Material.IRON_INGOT);
            Bukkit.addRecipe(recipe);
        }

        if(CraftableSaddlesRecipe.configuration.getBoolean("nametagEnabled")) {
            ItemStack nametag = new ItemStack(Material.NAME_TAG);
            ItemMeta meta = nametag.getItemMeta();

            nametag.setItemMeta(meta);
            NamespacedKey key = new NamespacedKey(plugin, "nametag");
            ShapedRecipe recipe = new ShapedRecipe(key, nametag);

            recipe.shape(" S ", " P ", "   ");
            recipe.setIngredient('S', Material.STRING);
            recipe.setIngredient('P', Material.PAPER);
            Bukkit.addRecipe(recipe);
        }
    }
}