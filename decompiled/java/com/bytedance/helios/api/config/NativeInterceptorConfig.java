package com.bytedance.helios.api.config;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class NativeInterceptorConfig {

    @C09CT("enabled")
    public final boolean enabled;

    public NativeInterceptorConfig() {
        this(true);
    }

    public NativeInterceptorConfig(boolean z) {
        this.enabled = z;
    }
}
