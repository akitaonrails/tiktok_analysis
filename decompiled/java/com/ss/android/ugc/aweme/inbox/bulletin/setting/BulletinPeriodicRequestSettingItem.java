package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPeriodicRequestSettingItem {

    @C09CT("bulletin_periodic_request_long_polling_interval")
    public final Long longPollingInterval;

    @C09CT("bulletin_periodic_request_short_polling_interval")
    public final Long shortPollingInterval;

    public BulletinPeriodicRequestSettingItem() {
        this(null, null);
    }

    public BulletinPeriodicRequestSettingItem(Long l, Long l2) {
        this.longPollingInterval = l;
        this.shortPollingInterval = l2;
    }
}
