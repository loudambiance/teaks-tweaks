package me.teakivy.teakstweaks.craftingtweaks.recipes;

import me.teakivy.teakstweaks.craftingtweaks.AbstractCraftingTweak;
import me.teakivy.teakstweaks.utils.Key;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

public class MoreCopperTrapdoors extends AbstractCraftingTweak {

    public MoreCopperTrapdoors() {
        super("more-copper-trapdoors", Material.COPPER_TRAPDOOR);
    }

    @Override
    public void registerRecipes() {
        Recipe removedRecipe = Bukkit.getRecipe(NamespacedKey.minecraft("copper_trapdoor"));
        addRemovedRecipe(removedRecipe);

        ShapedRecipe recipe = new ShapedRecipe(Key.get("copper_trapdoor"),
                new ItemStack(Material.COPPER_TRAPDOOR, 12));
        recipe.shape("xxx", "xxx");
        recipe.setIngredient('x', Material.COPPER_INGOT);
        addRecipe(recipe);
    }
}