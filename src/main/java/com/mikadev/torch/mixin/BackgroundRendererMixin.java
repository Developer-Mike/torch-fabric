package com.mikadev.torch.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import net.minecraft.client.render.Camera;

@Mixin(BackgroundRenderer.class)
public class BackgroundRendererMixin {
    @Inject(method = "applyFog", at = @At("TAIL"))
    private static void removeFogs(Camera camera, FogType fogType, float viewDistance, boolean thickFog, float tickDelta, CallbackInfo ci) {
        RenderSystem.setShaderFogStart(0);
        RenderSystem.setShaderFogEnd(viewDistance * 10);
    }
}
