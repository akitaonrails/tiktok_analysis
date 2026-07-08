package com.ss.android.ugc.slideslip.config;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class SkipEffectSwitchMaxVelocityConfig {

    @C09CT("disable_vibration")
    public final boolean disableVibration;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("switch_effect_max_velocity")
    public final float switchEffectMaxVelocity;

    public SkipEffectSwitchMaxVelocityConfig() {
        this(false, 1.0f, false);
    }

    public SkipEffectSwitchMaxVelocityConfig(boolean z, float f, boolean z2) {
        this.enable = z;
        this.switchEffectMaxVelocity = f;
        this.disableVibration = z2;
    }
}
