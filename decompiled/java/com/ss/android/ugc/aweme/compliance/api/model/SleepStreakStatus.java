package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class SleepStreakStatus {

    @C09CT("cur_week_status")
    public final Boolean currentWeekStatus;

    @C09CT("show_last_call_reminder")
    public final Boolean shouldShowLastCallForStreak;

    @C09CT("week")
    public final Integer week;

    public SleepStreakStatus() {
        this(0, Boolean.FALSE, Boolean.FALSE);
    }

    public SleepStreakStatus(Integer num, Boolean bool, Boolean bool2) {
        this.week = num;
        this.currentWeekStatus = bool;
        this.shouldShowLastCallForStreak = bool2;
    }
}
