package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class PreviewGoLiveCardFrequency {

    @C09CT("departure_interval_days")
    public final int departureIntervalDays;

    @C09CT("departure_noclick_number")
    public final int departureNoClickNum;

    @C09CT("show_limit_duration")
    public final long showLimitDuration;

    public PreviewGoLiveCardFrequency() {
        this(24L, 2, 7);
    }

    public PreviewGoLiveCardFrequency(long j, int i, int i2) {
        this.showLimitDuration = j;
        this.departureNoClickNum = i;
        this.departureIntervalDays = i2;
    }
}
