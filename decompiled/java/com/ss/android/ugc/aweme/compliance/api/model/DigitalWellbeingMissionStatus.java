package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class DigitalWellbeingMissionStatus {

    @C09CT("screen_time_set_task_status")
    public final Boolean screenTimeSetTaskStatus;

    @C09CT("sleep_streak_status")
    public final SleepStreakStatus sleepStreakStatus;

    public DigitalWellbeingMissionStatus() {
        this(new SleepStreakStatus(0, Boolean.FALSE, Boolean.FALSE), Boolean.FALSE);
    }

    public DigitalWellbeingMissionStatus(SleepStreakStatus sleepStreakStatus, Boolean bool) {
        this.sleepStreakStatus = sleepStreakStatus;
        this.screenTimeSetTaskStatus = bool;
    }
}
