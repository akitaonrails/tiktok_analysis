package com.ss.android.ugc.aweme.absetting;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class AntiMisTouchConfig {

    @C09CT("is_open")
    public final boolean isOpen;

    @C09CT("time_intercept_interval")
    public final long timeInterceptInterval;

    @C09CT("time_mis_touch_trigger")
    public final long timeMisTouchTrigger;

    @C09CT("time_mis_touch_trigger_end")
    public final long timeMisTouchTriggerEnd;

    @C09CT("time_toast_show")
    public final long timeToastShow;

    public AntiMisTouchConfig() {
        this(false, 6000L, 3000L, 3000L, -1L);
    }

    public AntiMisTouchConfig(boolean z, long j, long j2, long j3, long j4) {
        this.isOpen = z;
        this.timeMisTouchTrigger = j;
        this.timeToastShow = j2;
        this.timeInterceptInterval = j3;
        this.timeMisTouchTriggerEnd = j4;
    }
}
