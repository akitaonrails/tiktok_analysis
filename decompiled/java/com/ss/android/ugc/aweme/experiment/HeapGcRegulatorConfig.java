package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class HeapGcRegulatorConfig {

    @C09CT("alpha_high")
    public float alphaHigh;

    @C09CT("alpha_low")
    public float alphaLow;

    @C09CT("enable")
    public boolean enable;

    @C09CT("ratio_high")
    public float ratioHigh;

    @C09CT("ratio_low")
    public float ratioLow;

    public HeapGcRegulatorConfig() {
        this(false, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void setAlphaHigh(float f) {
        this.alphaHigh = f;
    }

    public final void setAlphaLow(float f) {
        this.alphaLow = f;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setRatioHigh(float f) {
        this.ratioHigh = f;
    }

    public final void setRatioLow(float f) {
        this.ratioLow = f;
    }

    public HeapGcRegulatorConfig(boolean z, float f, float f2, float f3, float f4) {
        this.enable = z;
        this.ratioHigh = f;
        this.alphaHigh = f2;
        this.ratioLow = f3;
        this.alphaLow = f4;
    }
}
