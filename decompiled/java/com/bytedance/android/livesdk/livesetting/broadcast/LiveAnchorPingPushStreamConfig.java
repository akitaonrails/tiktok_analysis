package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveAnchorPingPushStreamConfig {
    public static final TypeAdapter ADAPTER = new LiveAnchorPingPushStreamConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("ping_anchor_gap")
    public float pingAnchorGap;

    @C09CT("ping_anchor_time")
    public int pingAnchorTime;

    @C09CT("ping_stream_end_live_alert")
    public boolean pingStreamEndLiveAlert;

    @C09CT("ping_stream_try_count")
    public int pingStreamTryCount;

    public LiveAnchorPingPushStreamConfig() {
        this(0, false, 0.0f, 0);
    }

    public LiveAnchorPingPushStreamConfig(int i, boolean z, float f, int i2) {
        this.pingStreamTryCount = i;
        this.pingStreamEndLiveAlert = z;
        this.pingAnchorGap = f;
        this.pingAnchorTime = i2;
    }
}
