package com.ss.android.ugc.aweme.im.service.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class MufPostFypAndFriendsTabConfig {

    @C09CT("daily_display_count_limit")
    public final int dailyDisplayCountLimit;

    @C09CT("enable_like")
    public final int enableLike;

    @C09CT("global_dismiss_days")
    public final int globalDismissDays;

    @C09CT("global_display_count_limit")
    public final int globalDisplayCountLimit;

    public MufPostFypAndFriendsTabConfig() {
        this(0, 0, 0, 0);
    }

    public MufPostFypAndFriendsTabConfig(int i, int i2, int i3, int i4) {
        this.enableLike = i;
        this.globalDisplayCountLimit = i2;
        this.globalDismissDays = i3;
        this.dailyDisplayCountLimit = i4;
    }
}
