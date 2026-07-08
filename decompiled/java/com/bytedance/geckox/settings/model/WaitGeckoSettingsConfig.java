package com.bytedance.geckox.settings.model;

/* JADX INFO: loaded from: classes24.dex */
public final class WaitGeckoSettingsConfig {
    public final boolean enabled;
    public final int timeout;

    public WaitGeckoSettingsConfig() {
        this(false, 10);
    }

    public WaitGeckoSettingsConfig(boolean z, int i) {
        this.enabled = z;
        this.timeout = i;
    }
}
