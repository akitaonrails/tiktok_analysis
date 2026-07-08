package com.bytedance.ies.ugc.aweme.network.interceptor;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class PnsZoneConfig {

    @C09CT("enable_remove_interceptors")
    public final boolean enableRemoveInterceptors;

    @C09CT("enable_ttnet_params")
    public final boolean enableTTNetParams;

    public PnsZoneConfig() {
        this(true, false);
    }

    public PnsZoneConfig(boolean z, boolean z2) {
        this.enableTTNetParams = z;
        this.enableRemoveInterceptors = z2;
    }
}
