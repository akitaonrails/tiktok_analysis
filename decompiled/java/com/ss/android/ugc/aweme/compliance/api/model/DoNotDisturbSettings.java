package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class DoNotDisturbSettings {

    @C09CT("pause_notification_enabled")
    public final Boolean pauseNotificationEnabled;

    @C09CT("pause_end_hour")
    public final Integer pauseNotificationEndHour;

    @C09CT("pause_end_minute")
    public final Integer pauseNotificationEndMinute;

    @C09CT("pause_start_hour")
    public final Integer pauseNotificationStartHour;

    @C09CT("pause_start_minute")
    public final Integer pauseNotificationStartMinute;

    public DoNotDisturbSettings() {
        this(Boolean.FALSE, 0, 0, 0, 0);
    }

    public DoNotDisturbSettings(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
        this.pauseNotificationEnabled = bool;
        this.pauseNotificationStartHour = num;
        this.pauseNotificationStartMinute = num2;
        this.pauseNotificationEndHour = num3;
        this.pauseNotificationEndMinute = num4;
    }
}
