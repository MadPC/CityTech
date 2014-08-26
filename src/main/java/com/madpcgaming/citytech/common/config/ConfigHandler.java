package com.madpcgaming.citytech.common.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler
{
	public static Configuration config;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		doConfiguration();
	}
	
	public static void doConfiguration()
	{
		
	}
}
