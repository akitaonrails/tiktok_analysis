package com.bytedance.helios.api.config;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class InventoryConfig {

    @C09CT("body_sample")
    public final double bodySample;

    @C09CT("cookie_sample")
    public final double cookieSample;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("header_sample")
    public final double headerSample;

    @C09CT("query_sample")
    public final double querySample;

    @C09CT("sample")
    public final double sample;

    @C09CT("specified")
    public final NetworkCondition specified;

    @C09CT("stack_sample")
    public final double stackSample;

    public InventoryConfig() {
        this(true, 0.001d, 0.0d, 1.0d, 1.0d, 0.0d, 1.0d, new NetworkCondition(null, null, null, 7, null));
    }

    public InventoryConfig(boolean z, double d, double d2, double d3, double d4, double d5, double d6, NetworkCondition networkCondition) {
        this.enabled = z;
        this.sample = d;
        this.stackSample = d2;
        this.headerSample = d3;
        this.querySample = d4;
        this.bodySample = d5;
        this.cookieSample = d6;
        this.specified = networkCondition;
    }
}
