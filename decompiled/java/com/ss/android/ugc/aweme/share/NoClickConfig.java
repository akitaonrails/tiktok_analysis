package com.ss.android.ugc.aweme.share;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class NoClickConfig {

    @C09CT("hide_days")
    public final int hideDays;

    @C09CT("no_click_count")
    public final int noClickCount;

    public NoClickConfig() {
        this(-1, -1);
    }

    public NoClickConfig(int i, int i2) {
        this.noClickCount = i;
        this.hideDays = i2;
    }
}
