package com.ss.android.ugc.tiktok.tools.performance.api.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumDeferLoadMoreConfig {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("fallback_ms")
    public final long fallbackMs;

    public AlbumDeferLoadMoreConfig() {
        this(false, 4000L);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getFallbackMs() {
        return this.fallbackMs;
    }

    public AlbumDeferLoadMoreConfig(boolean z, long j) {
        this.enabled = z;
        this.fallbackMs = j;
    }
}
