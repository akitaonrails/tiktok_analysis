package com.ss.android.ugc.aweme.setting.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SpeedModeUIConfig {

    @C09CT("auth_max_times_per_day")
    public final int authMaxTimesPerDay;

    @C09CT("auth_max_times_per_hour")
    public final int authMaxTimesPerHour;

    @C09CT("auth_max_times_total")
    public final int authMaxTimesTotal;

    @C09CT("auth_show_duration")
    public final int authShowDuration;

    @C09CT("auth_easy_click")
    public final boolean easyClick;

    public SpeedModeUIConfig() {
        this(5, 1, 1, 3, false);
    }

    public SpeedModeUIConfig(int i, int i2, int i3, int i4, boolean z) {
        this.authShowDuration = i;
        this.authMaxTimesPerHour = i2;
        this.authMaxTimesPerDay = i3;
        this.authMaxTimesTotal = i4;
        this.easyClick = z;
    }
}
