package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class SleepHourSettings {

    @C09CT("allow_usage_time")
    public final long allowedUsageTimeInSecond;

    @C09CT("delay_type")
    public final int delayType;

    @C09CT("is_first_show_prompt")
    public final boolean isFirstShownPrompt;

    @C09CT("popup_show_time")
    public final int popupShowTimes;

    public SleepHourSettings() {
        this(true, 0L, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepHourSettings)) {
            return false;
        }
        SleepHourSettings sleepHourSettings = (SleepHourSettings) obj;
        return this.isFirstShownPrompt == sleepHourSettings.isFirstShownPrompt && this.allowedUsageTimeInSecond == sleepHourSettings.allowedUsageTimeInSecond && this.popupShowTimes == sleepHourSettings.popupShowTimes && this.delayType == sleepHourSettings.delayType;
    }

    public SleepHourSettings(boolean z, long j, int i, int i2) {
        this.isFirstShownPrompt = z;
        this.allowedUsageTimeInSecond = j;
        this.popupShowTimes = i;
        this.delayType = i2;
    }

    public static SleepHourSettings LIZ(SleepHourSettings sleepHourSettings, boolean z, long j, int i, int i2, int i3) {
        int i4 = i2;
        int i5 = i;
        long j2 = j;
        boolean z2 = z;
        if ((i3 & 1) != 0) {
            z2 = sleepHourSettings.isFirstShownPrompt;
        }
        if ((i3 & 2) != 0) {
            j2 = sleepHourSettings.allowedUsageTimeInSecond;
        }
        if ((i3 & 4) != 0) {
            i5 = sleepHourSettings.popupShowTimes;
        }
        if ((i3 & 8) != 0) {
            i4 = sleepHourSettings.delayType;
        }
        return new SleepHourSettings(z2, j2, i5, i4);
    }
}
