package com.mikadev.torch.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import net.minecraft.client.render.LightmapTextureManager;

@Mixin(LightmapTextureManager.class)
public class LightmapRenderMixin {
    @ModifyVariable(method = "update", at = @At("STORE"), ordinal = 6)
    private float injectNightVision(float l) {
        return 1.0f;
    }

    @ModifyVariable(method = "update", at = @At("STORE"), ordinal = 4)
    private float injectDarknessImmunity(float j) {
        return 0.0f;
    }
}
