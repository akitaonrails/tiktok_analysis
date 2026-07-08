package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class EnterOptConfig {
    public static final TypeAdapter ADAPTER = new EnterOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_feed_api_priority")
    public boolean enableFeedApiHighPriority;

    @C09CT("enable_feed_aip_opt")
    public boolean enableFeedApiOpt;

    @C09CT("enable_main_thread_head")
    public boolean enableMainFirstOpt;

    @C09CT("enable_retry")
    public boolean enableRetry;

    @C09CT("enable_room_enter_cpu_boost")
    public boolean enableRoomEnterCpuBoost;

    @C09CT("enable_room_enter_priority")
    public boolean enableRoomEnterHighPriority;

    @C09CT("enable_thr_high_priority")
    public boolean enableThrHighPriority;

    @C09CT("room_enter_bind_big_core")
    public boolean roomEnterBindBigCore;

    @C09CT("room_enter_cpu_boost_debounce_ms")
    public int roomEnterCpuBoostDebounceMs;

    @C09CT("room_enter_cpu_boost_timeout_ms")
    public int roomEnterCpuBoostTimeoutMs;

    public EnterOptConfig() {
        this(false, false, false, false, false, false, false, true, 2000, LivePreCreateNextRoomPlayer.ENABLE);
    }

    public EnterOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, int i2) {
        this.enableThrHighPriority = z;
        this.enableMainFirstOpt = z2;
        this.enableRetry = z3;
        this.enableFeedApiOpt = z4;
        this.enableRoomEnterHighPriority = z5;
        this.enableFeedApiHighPriority = z6;
        this.enableRoomEnterCpuBoost = z7;
        this.roomEnterBindBigCore = z8;
        this.roomEnterCpuBoostTimeoutMs = i;
        this.roomEnterCpuBoostDebounceMs = i2;
    }
}
