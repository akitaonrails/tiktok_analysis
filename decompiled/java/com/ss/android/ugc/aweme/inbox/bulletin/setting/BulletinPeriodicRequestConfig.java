package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPeriodicRequestConfig {

    @C09CT("enable")
    public final Integer enable;

    @C09CT("sync_interval")
    public final Long syncInterval;

    @C09CT("sync_total_time")
    public final Long syncTotalTime;

    public BulletinPeriodicRequestConfig() {
        this(null, null, null);
    }

    public BulletinPeriodicRequestConfig(Integer num, Long l, Long l2) {
        this.enable = num;
        this.syncInterval = l;
        this.syncTotalTime = l2;
    }
}
