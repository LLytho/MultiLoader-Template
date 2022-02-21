package com.github.llytho.examplemod.mixin;

import com.github.llytho.examplemod.api.core.ExampleModAPI;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MainScreenMixin {

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {

        ExampleModAPI.LOG.info("This line is printed through MixinScreenMixin as a common mixin");
    }
}
