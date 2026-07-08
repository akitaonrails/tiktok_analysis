package com.ss.android.ugc.aweme.relation.usercard.config;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class AuthCardFreqParams {

    @C09CT("max_auto_hide_days")
    public final int maxAutoHideDays;

    @C09CT("max_delete_count")
    public final int maxDeleteCount;

    @C09CT("max_delete_hide_days")
    public final int maxDeleteHideDays;

    @C09CT("max_exposure_count")
    public final int maxExposureCount;

    public AuthCardFreqParams() {
        this(10, 14, 14, 3);
    }

    public AuthCardFreqParams(int i, int i2, int i3, int i4) {
        this.maxExposureCount = i;
        this.maxAutoHideDays = i2;
        this.maxDeleteHideDays = i3;
        this.maxDeleteCount = i4;
    }
}
