package com.ss.android.ugc.aweme.setting.performance;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class DraftBoxGuideConfig {

    @C09CT("device_free_space")
    public final long deviceFreeSpace;

    @C09CT("draft_count")
    public final int draftCount;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("visit_time_interval")
    public final long visitTimeInterval;

    public DraftBoxGuideConfig() {
        this(false, 7L, 2600L, 40);
    }

    public DraftBoxGuideConfig(boolean z, long j, long j2, int i) {
        this.enable = z;
        this.visitTimeInterval = j;
        this.deviceFreeSpace = j2;
        this.draftCount = i;
    }
}
