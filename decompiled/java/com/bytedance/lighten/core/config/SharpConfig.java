package com.bytedance.lighten.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class SharpConfig {

    @C09CT("adaptive")
    public boolean adaptive;

    @C09CT("algorithm")
    public int algorithm;

    @C09CT("g0")
    public float g0;

    @C09CT("lcWtThr")
    public float lcWtThr;

    @C09CT("ovrt")
    public float ovrt;

    @C09CT("thr")
    public float thr;

    @C09CT("wt")
    public float wt;

    public SharpConfig() {
        this(3, 4.0f, 3.0f, 0.3f, true, 1200.0f, 1.0f);
    }

    public final void setAdaptive(boolean z) {
        this.adaptive = z;
    }

    public final void setAlgorithm(int i) {
        this.algorithm = i;
    }

    public final void setG0(float f) {
        this.g0 = f;
    }

    public final void setLcWtThr(float f) {
        this.lcWtThr = f;
    }

    public final void setOvrt(float f) {
        this.ovrt = f;
    }

    public final void setThr(float f) {
        this.thr = f;
    }

    public final void setWt(float f) {
        this.wt = f;
    }

    public SharpConfig(int i, float f, float f2, float f3, boolean z, float f4, float f5) {
        this.algorithm = i;
        this.wt = f;
        this.thr = f2;
        this.ovrt = f3;
        this.adaptive = z;
        this.g0 = f4;
        this.lcWtThr = f5;
    }
}
