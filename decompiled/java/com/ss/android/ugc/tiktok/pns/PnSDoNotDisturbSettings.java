package com.ss.android.ugc.tiktok.pns;

/* JADX INFO: loaded from: classes29.dex */
public final class PnSDoNotDisturbSettings {
    public final Boolean pauseNotificationEnabled;
    public final Integer pauseNotificationEndHour;
    public final Integer pauseNotificationEndMinute;
    public final Integer pauseNotificationStartHour;
    public final Integer pauseNotificationStartMinute;

    public PnSDoNotDisturbSettings() {
        this(Boolean.FALSE, 0, 0, 0, 0);
    }

    public PnSDoNotDisturbSettings(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
        this.pauseNotificationEnabled = bool;
        this.pauseNotificationStartHour = num;
        this.pauseNotificationStartMinute = num2;
        this.pauseNotificationEndHour = num3;
        this.pauseNotificationEndMinute = num4;
    }
}
