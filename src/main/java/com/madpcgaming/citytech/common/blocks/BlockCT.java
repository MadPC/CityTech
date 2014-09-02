package com.madpcgaming.citytech.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Facing;
import net.minecraft.world.World;

public class BlockCT extends Block
{
	private int render;
	protected String unlocalizedName;
	protected Class<? extends TileEntity> teClass;

	protected BlockCT(String unlocalizedName, Material material, SoundType type, float hardness, int render, Class<? extends TileEntity> teClass)
	{
		super(material);
		setStepSound(type);
		setHardness(hardness);
		setBlockName(unlocalizedName);
		this.render = render;
		this.unlocalizedName = unlocalizedName;
		this.teClass = teClass;
	}
	
	public boolean hasPlacementRotation()
	{
		return true;
	}
	
	public boolean hasCustomModel()
	{
		return true;
	}
	
	@Override
	public int onBlockPlaced(World world, int x, int y, int z, int side, float hitx, float hity, float hitz, int meta)
	{
		int opp = Facing.oppositeSide[side];
		
		return hasPlacementRotation() ? opp : 0;
	}
	
	@Override
	public int getRenderType()
	{
		return render;
	}
	
	@Override
	public boolean renderAsNormalBlock()
	{
		return !hasCustomModel();
	}
	
	
	
	
}