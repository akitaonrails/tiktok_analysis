package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class DMStreakConfig {

    @C09CT("continue_msg_max_show_times")
    public final int continueMsgMaxShowTimes;

    @C09CT("enable_streak")
    public final boolean enableDMStreak;

    @C09CT("enable_inline_msg")
    public final boolean enableInlineMsg;

    @C09CT("enable_streak_btn")
    public final boolean enableStreakBtn;

    @C09CT("enable_time_zone")
    public final boolean enableTimeZone;

    @C09CT("enable_unlock_anim")
    public final boolean enableUnlockAnim;

    @C09CT("enable_update_anim")
    public final boolean enableUpdateAnim;

    @C09CT("enable_panel_width_adjust")
    public final boolean enableWidthAdjust;

    @C09CT("group_max_remind_in_app_push_times")
    public final long groupMaxRemindInAppPushTimes;

    @C09CT("max_remind_in_app_push_times")
    public final long maxRemindInAppPushTimes;

    @C09CT("pull_streak_data_delay")
    public final long pullStreakDataDelay;

    @C09CT("streak_remind_interval")
    public final int remindInterval;

    @C09CT("streak_day_period")
    public final int timeWindow;

    public DMStreakConfig() {
        this(true, true, 120, 0, 2, true, true, true, true, 0L, 1L, true, 2L);
    }

    public DMStreakConfig(boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, boolean z5, boolean z6, long j, long j2, boolean z7, long j3) {
        this.enableDMStreak = z;
        this.enableTimeZone = z2;
        this.timeWindow = i;
        this.remindInterval = i2;
        this.continueMsgMaxShowTimes = i3;
        this.enableInlineMsg = z3;
        this.enableStreakBtn = z4;
        this.enableUnlockAnim = z5;
        this.enableUpdateAnim = z6;
        this.pullStreakDataDelay = j;
        this.maxRemindInAppPushTimes = j2;
        this.enableWidthAdjust = z7;
        this.groupMaxRemindInAppPushTimes = j3;
    }
}
