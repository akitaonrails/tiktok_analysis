package com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class EcButtonFrequency {

    @C09CT("departure_display_count_without_click")
    public final int departureDisplayCountWithoutClick;

    @C09CT("departure_interval_day")
    public final int departureIntervalDay;

    @C09CT("display_daily_max_count")
    public final int displayDailyMaxCount;

    @C09CT("display_min_timer_interval_minutes")
    public final int displayMinTimerIntervalMinutes;

    @C09CT("display_min_vv_interval_count")
    public final int displayMinVVIntervalCount;

    public EcButtonFrequency() {
        this(7, 7, 10, 30, -1);
    }

    public EcButtonFrequency(int i, int i2, int i3, int i4, int i5) {
        this.departureDisplayCountWithoutClick = i;
        this.departureIntervalDay = i2;
        this.displayDailyMaxCount = i3;
        this.displayMinTimerIntervalMinutes = i4;
        this.displayMinVVIntervalCount = i5;
    }
}
