package com.github.llytho.examplemod.api.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ServiceLoader;

public interface ExampleModAPI {
    String MOD_ID = "examplemod";
    String MOD_NAME = "ExampleMod";
    Logger LOG = LogManager.getLogger(MOD_NAME);

    /**
     * Loads the implementation for a given class.
     * <p>
     * Example:
     * "com.a.b.c.IFoo.class" will try to load the implementation which is defined in
     * "resources/META-INF/services/com.a.b.c.IFoo.class".
     * The file must provide the full classpath.
     *
     * @param clazz The class which should get loaded
     * @return The implementation class
     */
    static <T> T loadService(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
            .findFirst()
            .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        ExampleModAPI.LOG.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}
