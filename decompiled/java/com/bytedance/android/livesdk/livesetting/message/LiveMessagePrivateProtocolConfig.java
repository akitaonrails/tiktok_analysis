package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveMessagePrivateProtocolConfig {
    public static final TypeAdapter ADAPTER = new LiveMessagePrivateProtocolConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_new_frontier_access")
    public boolean enableNewFrontierAccess;

    @C09CT("enable_private_protocol")
    public boolean enablePrivateProtocol;

    @C09CT("fallback_timeout_mills")
    public long fallbackTimeoutMills;

    public LiveMessagePrivateProtocolConfig() {
        this(false, false, 1000L);
    }

    public final boolean getEnableNewFrontierAccess() {
        return this.enableNewFrontierAccess;
    }

    public final boolean getEnablePrivateProtocol() {
        return this.enablePrivateProtocol;
    }

    public final long getFallbackTimeoutMills() {
        return this.fallbackTimeoutMills;
    }

    public final void setEnableNewFrontierAccess(boolean z) {
        this.enableNewFrontierAccess = z;
    }

    public final void setEnablePrivateProtocol(boolean z) {
        this.enablePrivateProtocol = z;
    }

    public final void setFallbackTimeoutMills(long j) {
        this.fallbackTimeoutMills = j;
    }

    public LiveMessagePrivateProtocolConfig(boolean z, boolean z2, long j) {
        this.enableNewFrontierAccess = z;
        this.enablePrivateProtocol = z2;
        this.fallbackTimeoutMills = j;
    }
}
