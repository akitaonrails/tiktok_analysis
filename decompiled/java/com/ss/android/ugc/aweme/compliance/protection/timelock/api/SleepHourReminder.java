package com.ss.android.ugc.aweme.compliance.protection.timelock.api;

import X.C09CT;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourConfigSettings;

/* JADX INFO: loaded from: classes.dex */
public final class SleepHourReminder {

    @C09CT("sleep_time_settings")
    public final SleepHourConfigSettings sleepHourConfigSettings;

    @C09CT("user_real_timestamp")
    public final Integer userTimeStamp;

    public SleepHourReminder(SleepHourConfigSettings sleepHourConfigSettings, Integer num) {
        this.sleepHourConfigSettings = sleepHourConfigSettings;
        this.userTimeStamp = num;
    }
}
