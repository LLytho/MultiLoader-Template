package com.github.llytho.examplemod.core;

import com.github.llytho.examplemod.api.core.IPlatform;
import net.fabricmc.loader.api.FabricLoader;

public class FabricPlatformImpl implements IPlatform {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {
        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }
}
