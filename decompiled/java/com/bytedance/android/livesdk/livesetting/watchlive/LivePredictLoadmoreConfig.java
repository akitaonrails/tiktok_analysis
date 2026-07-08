package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePredictLoadmoreConfig {
    public static final TypeAdapter ADAPTER = new LivePredictLoadmoreConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("left_room_threhold")
    public int leftRoomThrehold;

    @C09CT("max_wait_time")
    public long maxWaitTime;

    public LivePredictLoadmoreConfig() {
        this(false, 3, 2000L);
    }

    public LivePredictLoadmoreConfig(boolean z, int i, long j) {
        this.enable = z;
        this.leftRoomThrehold = i;
        this.maxWaitTime = j;
    }
}
