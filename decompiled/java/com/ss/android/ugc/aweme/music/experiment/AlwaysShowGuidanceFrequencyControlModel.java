package com.ss.android.ugc.aweme.music.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class AlwaysShowGuidanceFrequencyControlModel {

    @C09CT("active_users_alert_show_interval_days")
    public final int activeUserShowIntervalDays;

    @C09CT("active_users_alert_show_lifetime_times")
    public final int activeUserShowLimits;

    @C09CT("inactive_users_alert_show_interval_days")
    public final int inactiveUserShowIntervalDays;

    @C09CT("inactive_users_alert_show_lifetime_times")
    public final int inactiveUserShowLimits;

    public AlwaysShowGuidanceFrequencyControlModel() {
        this(3, 3, 7, 3);
    }

    public AlwaysShowGuidanceFrequencyControlModel(int i, int i2, int i3, int i4) {
        this.activeUserShowIntervalDays = i;
        this.activeUserShowLimits = i2;
        this.inactiveUserShowIntervalDays = i3;
        this.inactiveUserShowLimits = i4;
    }
}
