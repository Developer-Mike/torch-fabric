package com.mikadev.torch.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import net.minecraft.client.gui.hud.InGameOverlayRenderer;

@Mixin(InGameOverlayRenderer.class)
public class OverlayRendererMixin {
    @ModifyArg(method = "renderFireOverlay", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/math/MatrixStack;translate(FFF)V"), index = 1)
    private static float injectY(float y) {
        return -0.5f;
    }
}
