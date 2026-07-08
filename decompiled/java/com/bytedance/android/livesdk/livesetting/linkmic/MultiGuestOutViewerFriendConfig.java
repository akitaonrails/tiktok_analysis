package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class MultiGuestOutViewerFriendConfig {

    @C09CT("init_count")
    public long initCount;

    @C09CT("step")
    public int step;

    public MultiGuestOutViewerFriendConfig() {
        this(20, 20L);
    }

    public MultiGuestOutViewerFriendConfig(int i, long j) {
        this.step = i;
        this.initCount = j;
    }
}
