package com.madpcgaming.citytech;

public class Props
{
	public static final String MODID = "cityTech";
	public static final String MOD_TEXTUREPATH = "citytech";
	public static final String MOD_NAME = "City Tech";
	public static final String LOCALIZING = "CT";
	public static final String VERSION = "0.0.1-pre-alpha";
	
	public static final String MAIN_PACKAGE = "com.madpcgaming.citytech";
	public static final String CLIENT_PROXY_CLASS = MAIN_PACKAGE + ".client.ClientProxy";
	public static final String SERVER_PROXY_CLASS = MAIN_PACKAGE + ".common.CommonProxy";
	
	public static final String CHANNEL = "CTech";
	
	//dependencies
	public static final String FORGE_VERSION = "10.13.0.1207,)";
	
	public static final String DEPENDENCIES = "required-after:Forge@" + FORGE_VERSION + ";";
}
