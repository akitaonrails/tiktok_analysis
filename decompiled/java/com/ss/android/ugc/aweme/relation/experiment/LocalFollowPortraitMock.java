package com.ss.android.ugc.aweme.relation.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class LocalFollowPortraitMock {

    @C09CT("follow_total_count_30days")
    public int followTotalCount30days;

    @C09CT("follow_total_count_3days")
    public int followTotalCount3days;

    @C09CT("is_enable")
    public int isEnable;

    public LocalFollowPortraitMock() {
        this(0, 0, 0);
    }

    public LocalFollowPortraitMock(int i, int i2, int i3) {
        this.isEnable = i;
        this.followTotalCount30days = i2;
        this.followTotalCount3days = i3;
    }
}
