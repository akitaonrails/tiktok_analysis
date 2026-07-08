package com.ss.android.ugc.aweme.experiment.pythia;

/* JADX INFO: loaded from: classes36.dex */
public final class PythiaLowDeviceConfig {
    public final float maxEffectScoce;
    public final float minEffectScoce;
    public final boolean open;

    public PythiaLowDeviceConfig() {
        this(false, 3.0f, 8.0f);
    }

    public PythiaLowDeviceConfig(boolean z, float f, float f2) {
        this.open = z;
        this.minEffectScoce = f;
        this.maxEffectScoce = f2;
    }
}
