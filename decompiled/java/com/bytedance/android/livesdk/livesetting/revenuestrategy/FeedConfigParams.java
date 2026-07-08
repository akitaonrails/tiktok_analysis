package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FeedConfigParams {
    public static final TypeAdapter ADAPTER = new FeedConfigParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("animation_delay_duration")
    public long animationDelay;

    @C09CT("seconds_to_start_request_next_day_task")
    public long canRequestNextTaskInfoTime;

    @C09CT("enable_leave_room_refresh_task_info")
    public boolean enableRequestWhenLeaveRoom;

    @C09CT("first_animation_delay_duration")
    public long firstAnimationDelay;

    @C09CT("time_interval_for_request_next_task_info")
    public int refreshDelayRange;

    public FeedConfigParams() {
        this(60, false, 7200L, 3000L, 2500L);
    }

    public FeedConfigParams(int i, boolean z, long j, long j2, long j3) {
        this.refreshDelayRange = i;
        this.enableRequestWhenLeaveRoom = z;
        this.canRequestNextTaskInfoTime = j;
        this.animationDelay = j2;
        this.firstAnimationDelay = j3;
    }
}
