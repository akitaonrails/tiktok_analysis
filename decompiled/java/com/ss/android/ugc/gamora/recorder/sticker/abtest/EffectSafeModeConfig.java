package com.ss.android.ugc.gamora.recorder.sticker.abtest;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class EffectSafeModeConfig {
    public static final int $stable = 0;
    public static final EffectSafeModeConfig INSTANCE = new EffectSafeModeConfig();
    public static final boolean OFF = false;
    public static final boolean ON = true;

    public static final boolean enabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "is_effect_safemode_enabled", true, false);
    }
}
