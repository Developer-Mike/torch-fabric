package com.mikadev.torch.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.util.Identifier;

@Mixin(InGameHud.class)
public class InGameHudRendererMixin {
    @Inject(method = "renderOverlay", at = @At("HEAD"), cancellable = true)
    private void renderSpyglassOverlay(DrawContext context, Identifier texture, float opacity, CallbackInfo ci) {
        Identifier PUMPKIN_BLUR = ((InGameHudAccessor) this).getPUMPKIN_BLUR();
        if (texture == PUMPKIN_BLUR) {
            ci.cancel();
        }
    }

    @Inject(method = "renderSpyglassOverlay", at = @At("HEAD"), cancellable = true)
    private void renderSpyglassOverlay(CallbackInfo ci) {
        ci.cancel();
    }
}