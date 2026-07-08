package com.bytedance.helios.api.config;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class CrpConfig {

    @C09CT("event_timeout_mills")
    public final long eventTimeOutMills;

    @C09CT("report_delayed_mills")
    public final long reportDelayedMills;

    public CrpConfig() {
        this(100L, 50L);
    }

    public CrpConfig(long j, long j2) {
        this.eventTimeOutMills = j;
        this.reportDelayedMills = j2;
    }
}
