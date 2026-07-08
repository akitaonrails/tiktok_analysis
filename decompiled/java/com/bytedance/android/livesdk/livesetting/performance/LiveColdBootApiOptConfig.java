package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveColdBootApiOptConfig {

    @C09CT("i18nApiOptEnable")
    public final boolean i18nApiOptEnable;

    @C09CT("settingsApiForceRefreshTimeHours")
    public final long settingsApiForceRefreshTimeHours;

    @C09CT("settingsApiOptEnable")
    public final boolean settingsApiOptEnable;

    public LiveColdBootApiOptConfig() {
        this(false, false, 0L);
    }

    public LiveColdBootApiOptConfig(boolean z, boolean z2, long j) {
        this.settingsApiOptEnable = z;
        this.i18nApiOptEnable = z2;
        this.settingsApiForceRefreshTimeHours = j;
    }
}
