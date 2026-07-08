package com.ss.android.ugc.aweme.relation.feed;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class NewUserRecCardProtect {

    @C09CT("cold_start_count_limit")
    public int coldStartCountLimit;

    @C09CT("cold_start_hour_limit")
    public int coldStartHourLimit;

    @C09CT("strategy")
    public int strategy;

    public NewUserRecCardProtect() {
        this(1, 3, 24);
    }

    public NewUserRecCardProtect(int i, int i2, int i3) {
        this.strategy = i;
        this.coldStartCountLimit = i2;
        this.coldStartHourLimit = i3;
    }
}
