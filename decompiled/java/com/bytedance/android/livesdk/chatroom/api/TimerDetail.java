package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class TimerDetail {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("antidirt_status")
    public int antidirtStatus;

    @C09CT("audit_info")
    public AuditInfo auditInfo;

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("last_pause_timestamp_s")
    public long lastPauseTimestampS;

    @C09CT("remaining_time_s")
    public long remainingTimeS;

    @C09CT("screen_h")
    public long screenH;

    @C09CT("screen_w")
    public long screenW;

    @C09CT("start_countdown_time_s")
    public long startCountdownTimeS;

    @C09CT("start_timestamp_s")
    public long startTimestampS;

    @C09CT("sticker_x")
    public long stickerX;

    @C09CT("sticker_y")
    public long stickerY;

    @C09CT("sub_count")
    public int subCount;

    @C09CT("time_increase_cap_s")
    public long timeIncreaseCapS;

    @C09CT("time_increase_per_sub_s")
    public long timeIncreasePerSubS;

    @C09CT("time_increase_reach_cap")
    public boolean timeIncreaseReachCap;

    @C09CT("timer_id")
    public long timerId;

    @C09CT("timer_status")
    public int timerStatus;

    @C09CT("timestamp_s")
    public long timestampS;

    @C09CT("total_pause_time_s")
    public long totalPauseTimeS;

    @C09CT("total_time_s")
    public long totalTimeS;

    @C09CT("anchor_side_title")
    public String anchorSideTitle = "";

    @C09CT("user_side_title")
    public String userSideTitle = "";

    /* JADX INFO: loaded from: classes.dex */
    public static final class AuditInfo {

        @C09CT("task_type")
        public int taskType;

        @C09CT("violation_id")
        public long violationId;
    }
}
