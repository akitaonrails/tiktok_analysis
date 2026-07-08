package com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class CustomCpuConfig {

    @C09CT("critical_cpu_level")
    public final Double criticalCpu;

    @C09CT("mid_cpu_level")
    public final Double midCpu;

    @C09CT("minimum_cpu_level")
    public final Double minimumCpu;

    public CustomCpuConfig() {
        this(null, null, null);
    }

    public CustomCpuConfig(Double d, Double d2, Double d3) {
        this.minimumCpu = d;
        this.midCpu = d2;
        this.criticalCpu = d3;
    }
}
