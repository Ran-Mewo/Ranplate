package net.examplemod;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class Platform {
    /**
     * @return true if the platform is Forge
     */
    @ExpectPlatform
    public static boolean isForge() {
        throw new AssertionError();
    }

    /**
     * @return true if the platform is Fabric
     */
    @ExpectPlatform
    public static boolean isFabric() {
        throw new AssertionError();
    }
}
