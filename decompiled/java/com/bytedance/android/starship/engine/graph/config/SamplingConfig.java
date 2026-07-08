package com.bytedance.android.starship.engine.graph.config;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class SamplingConfig {

    @C09CT("method")
    public final int method;

    @C09CT("rate")
    public final double rate;

    public SamplingConfig() {
        this(0, 0.0d);
    }

    public SamplingConfig(int i, double d) {
        this.method = i;
        this.rate = d;
    }
}
