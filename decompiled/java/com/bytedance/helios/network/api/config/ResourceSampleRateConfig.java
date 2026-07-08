package com.bytedance.helios.network.api.config;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class ResourceSampleRateConfig extends DefaultSampleRateConfig {

    @C09CT("resource_id")
    public final String resourceId;

    public ResourceSampleRateConfig() {
        this("", 0.0d, 0.01d, 1.0d, 1.0d);
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public ResourceSampleRateConfig(String str, double d, double d2, double d3, double d4) {
        super(d, d2, d3, d4);
        this.resourceId = str;
    }
}
