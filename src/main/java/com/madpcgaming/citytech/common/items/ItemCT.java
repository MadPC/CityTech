package com.madpcgaming.citytech.common.items;

import com.madpcgaming.citytech.Props;

import net.minecraft.item.Item;

public class ItemCT extends Item
{
	public ItemCT(String name, String textureName)
	{
		super();
		//setCreativeTab();
		setUnlocalizedName(name);
		setTextureName(Props.MODID + ":" + textureName);
	}
}
