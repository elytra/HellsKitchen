package com.elytradev.hellskitchen.block;

import com.elytradev.hellskitchen.item.ModItems;
import com.elytradev.hellskitchen.item.ItemOreDict;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;

public class BlockSaltOre extends BlockBase implements ItemOreDict {

    private String oreName;

    public BlockSaltOre(String name, String oreName) {
        super(Material.ROCK, name);

        this.oreName = oreName;

        setHardness(3f);
        setResistance(5f);
    }

    @Override
    public BlockSaltOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
        return ModItems.SALT;
    }

    @Override
    public int quantityDropped(Random random) {
        return 1 + random.nextInt(3);
    }
}
