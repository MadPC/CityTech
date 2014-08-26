package com.madpcgaming.citytech;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.madpcgaming.citytech.client.gui.GuiHandler;
import com.madpcgaming.citytech.common.CommonProxy;
import com.madpcgaming.citytech.common.config.ConfigHandler;
import com.madpcgaming.citytech.common.network.PacketHandler;
import com.madpcgaming.citytech.common.registry.ModBlocks;
import com.madpcgaming.citytech.common.registry.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;


/**
 * @author Daniel Sapelli
 */
@Mod(modid = Props.MODID, name = Props.MOD_NAME, version = Props.VERSION, dependencies = Props.DEPENDENCIES)
public class CityTech
{
	@Instance
	public static CityTech instance;
	@SidedProxy(clientSide = Props.CLIENT_PROXY_CLASS, serverSide = Props.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static Logger logger = LogManager.getLogger("CityTech");
	
	public static ModItems itemRegistry = ModItems.instance;
	public static ModBlocks blockRegistry = ModBlocks.instance;
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		
		proxy.preInit();
		
		itemRegistry.register();
		blockRegistry.register();
		
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		PacketHandler.init();
		
		itemRegistry.addRecipes();
		blockRegistry.addRecipes();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
