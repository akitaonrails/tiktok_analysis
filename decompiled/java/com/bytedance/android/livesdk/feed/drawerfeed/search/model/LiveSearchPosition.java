package com.bytedance.android.livesdk.feed.drawerfeed.search.model;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveSearchPosition {

    @C09CT("begin")
    public int begin;

    @C09CT("end")
    public int end;

    public LiveSearchPosition() {
        this(0, 0);
    }

    public LiveSearchPosition(int i, int i2) {
        this.begin = i;
        this.end = i2;
    }
}
