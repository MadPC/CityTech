package com.madpcgaming.citytech.common.network;

import com.madpcgaming.citytech.Props;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class PacketHandler
{
	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Props.CHANNEL);
	
	public static void init()
	{
		
	}
}
