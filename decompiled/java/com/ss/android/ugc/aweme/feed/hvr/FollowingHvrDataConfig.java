package com.ss.android.ugc.aweme.feed.hvr;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class FollowingHvrDataConfig {

    @C09CT("expire_time")
    public final int expireTime;

    @C09CT("hvr_limit")
    public final int hvrLimit;

    @C09CT("init_delay_time")
    public final int initDelay;

    @C09CT("skip_hvr_check")
    public final boolean skipHvrCheck;

    public FollowingHvrDataConfig() {
        this(3, 86400, 20, false);
    }

    public FollowingHvrDataConfig(int i, int i2, int i3, boolean z) {
        this.initDelay = i;
        this.expireTime = i2;
        this.hvrLimit = i3;
        this.skipHvrCheck = z;
    }
}
