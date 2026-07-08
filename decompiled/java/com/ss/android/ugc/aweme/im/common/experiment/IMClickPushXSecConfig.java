package com.ss.android.ugc.aweme.im.common.experiment;

/* JADX INFO: loaded from: classes15.dex */
public final class IMClickPushXSecConfig {
    public final boolean isEnabled;
    public final int xSec;

    public IMClickPushXSecConfig() {
        this(true, 10);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public IMClickPushXSecConfig(boolean z, int i) {
        this.isEnabled = z;
        this.xSec = i;
    }
}
