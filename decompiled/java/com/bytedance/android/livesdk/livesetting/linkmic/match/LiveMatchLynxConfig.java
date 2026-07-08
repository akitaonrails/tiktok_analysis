package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMatchLynxConfig {
    public static final TypeAdapter ADAPTER = new LiveMatchLynxConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("create_defer_enter_room_window_ms")
    public long createDeferEnterRoomWindowMs;

    @C09CT("create_delay_ms")
    public long createDelayMs;

    @C09CT("container_schema_v2")
    public String schemaV2;

    @C09CT("start_animation_enable")
    public int startAnimationEnable;

    @C09CT("use_spark_lite")
    public boolean useSparkLite;

    public LiveMatchLynxConfig() {
        this("", 1, true, 0L, 15000L);
    }

    public LiveMatchLynxConfig(String str, int i, boolean z, long j, long j2) {
        this.schemaV2 = str;
        this.startAnimationEnable = i;
        this.useSparkLite = z;
        this.createDelayMs = j;
        this.createDeferEnterRoomWindowMs = j2;
    }
}
