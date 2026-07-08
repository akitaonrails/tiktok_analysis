package com.tiktok.geckox.ng.model;

/* JADX INFO: loaded from: classes24.dex */
public final class OptimizeMultiTriggerCheckUpdateSettings {
    public final int delay;
    public final boolean enabled;
    public final int interval;
    public final SkipCacheList whitelist;

    public OptimizeMultiTriggerCheckUpdateSettings() {
        this(false, 600, 15, null);
    }

    public OptimizeMultiTriggerCheckUpdateSettings(boolean z, int i, int i2, SkipCacheList skipCacheList) {
        this.enabled = z;
        this.delay = i;
        this.interval = i2;
        this.whitelist = skipCacheList;
    }
}
