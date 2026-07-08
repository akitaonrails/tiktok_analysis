package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class RandomMatchConfig {
    public static final TypeAdapter ADAPTER = new RandomMatchConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_deduplication_optimize")
    public boolean enableDeduplicationOptimize;

    @C09CT("enable_enter_room_after_timeout")
    public boolean enableEnterRoomAfterTimeout;

    @C09CT("fetch_match_room_interval")
    public double fetchMatchRoomInterval;

    @C09CT("match_success_expire_time")
    public double matchSuccessExpireTime;

    @C09CT("room_match_timeout_duration")
    public double roomMatchTimeoutDuration;

    @C09CT("top_module_room_match_type")
    public int topModuleRoomMatchType;

    public RandomMatchConfig() {
        this(0, 0.0d, false, 0.0d, false, 0.0d);
    }

    public RandomMatchConfig(int i, double d, boolean z, double d2, boolean z2, double d3) {
        this.topModuleRoomMatchType = i;
        this.roomMatchTimeoutDuration = d;
        this.enableEnterRoomAfterTimeout = z;
        this.fetchMatchRoomInterval = d2;
        this.enableDeduplicationOptimize = z2;
        this.matchSuccessExpireTime = d3;
    }
}
