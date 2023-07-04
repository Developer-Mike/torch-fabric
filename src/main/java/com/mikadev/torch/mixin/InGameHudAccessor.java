package com.mikadev.torch.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.util.Identifier;

@Mixin(InGameHud.class)
public interface InGameHudAccessor {
    @Accessor("PUMPKIN_BLUR")
    Identifier getPUMPKIN_BLUR();
}
