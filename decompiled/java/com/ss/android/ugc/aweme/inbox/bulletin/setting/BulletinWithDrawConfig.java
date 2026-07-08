package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinWithDrawConfig {

    @C09CT("enable_limit")
    public final Integer enableLimit;

    @C09CT("withdraw_limit_total_time")
    public final Long withDrawLimitTotalTime;

    public BulletinWithDrawConfig() {
        this(null, null);
    }

    public BulletinWithDrawConfig(Integer num, Long l) {
        this.enableLimit = num;
        this.withDrawLimitTotalTime = l;
    }
}
