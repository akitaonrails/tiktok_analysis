package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class FrequencyLimit {

    @C09CT("limit")
    public int limit;

    @C09CT("window_sec")
    public int windowSec;

    public FrequencyLimit() {
        this(0, 0);
    }

    public FrequencyLimit(int i, int i2) {
        this.limit = i;
        this.windowSec = i2;
    }
}
