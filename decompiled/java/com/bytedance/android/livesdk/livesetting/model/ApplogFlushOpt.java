package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class ApplogFlushOpt {
    public static final TypeAdapter ADAPTER = new ApplogFlushOpt_OptTypeAdapter(NormalGson.singleton());

    @C09CT("ttlive_applog_flush_background_type")
    public int flushBackgroundType;

    @C09CT("ttlive_applog_flush_gap_duration_threshold")
    public long flushGapDuration;

    @C09CT("ttlive_applog_flush_leave_room_delay_duration_threshold")
    public long flushLeaveRoomDelayDuration;

    @C09CT("ttlive_applog_flush_leave_room_type")
    public int flushLeaveRoomType;

    @C09CT("ttlive_applog_flush_watch_room_delay_duration_threshold")
    public long flushWatchRoomDelayDuration;

    @C09CT("ttlive_applog_flush_watch_room_type")
    public int flushWatchRoomType;

    @C09CT("ttlive_applog_flush_is_opt")
    public boolean isOpt;

    @C09CT("ttlive_report_log_in_handle_thread")
    public boolean isReportOpt;
}
