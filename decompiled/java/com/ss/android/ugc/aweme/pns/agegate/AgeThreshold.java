package com.ss.android.ugc.aweme.pns.agegate;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class AgeThreshold {

    @C09CT("lower_bound")
    public final Integer lowerBound;

    @C09CT("upper_bound")
    public final Integer upperBound;

    public AgeThreshold() {
        this(13, 15);
    }

    public AgeThreshold(Integer num, Integer num2) {
        this.lowerBound = num;
        this.upperBound = num2;
    }
}
