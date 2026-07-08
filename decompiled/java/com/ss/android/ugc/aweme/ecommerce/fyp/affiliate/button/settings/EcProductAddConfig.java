package com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class EcProductAddConfig {

    @C09CT("departure_display_count_without_click")
    public final int departureDisplayCountWithoutClick;

    @C09CT("departure_interval_day")
    public final int departureIntervalDay;

    @C09CT("display_config_opt")
    public final boolean displayConfigOpt;

    @C09CT("display_daily_max_count")
    public final int displayDailyMaxCount;

    @C09CT("display_min_timer_interval_minutes")
    public final int displayMinTimerIntervalMinutes;

    public EcProductAddConfig() {
        this(false, 7, 7, 10, 30);
    }

    public EcProductAddConfig(boolean z, int i, int i2, int i3, int i4) {
        this.displayConfigOpt = z;
        this.departureDisplayCountWithoutClick = i;
        this.departureIntervalDay = i2;
        this.displayDailyMaxCount = i3;
        this.displayMinTimerIntervalMinutes = i4;
    }
}
