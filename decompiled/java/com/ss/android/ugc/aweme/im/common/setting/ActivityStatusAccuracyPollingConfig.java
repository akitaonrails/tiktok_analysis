package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class ActivityStatusAccuracyPollingConfig {

    @C09CT("initial_delay")
    public final long initialDelay;

    @C09CT("polling_interval")
    public final long pollingInterval;

    @C09CT("position")
    public final String position;

    public ActivityStatusAccuracyPollingConfig(String str, long j, long j2) {
        this.position = str;
        this.initialDelay = j;
        this.pollingInterval = j2;
    }
}
