package com.ss.android.ugc.profile.business.ur.edit;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileLemon8BannerFreqParams {

    @C09CT("per_time_range")
    public final Integer maxPerTimeRange;

    @C09CT("max_time")
    public final Integer maxTime;

    public ProfileLemon8BannerFreqParams() {
        this(14, 2);
    }

    public ProfileLemon8BannerFreqParams(Integer num, Integer num2) {
        this.maxPerTimeRange = num;
        this.maxTime = num2;
    }
}
