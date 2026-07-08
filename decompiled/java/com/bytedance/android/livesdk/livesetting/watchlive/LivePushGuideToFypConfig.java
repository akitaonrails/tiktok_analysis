package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePushGuideToFypConfig {
    public static final TypeAdapter ADAPTER = new LivePushGuideToFypConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("auto_swipe_to_next")
    public boolean autoSwipeToNext;

    @C09CT("live_room_count")
    public int liveRoomCount;

    public LivePushGuideToFypConfig() {
        this(0, false);
    }

    public LivePushGuideToFypConfig(int i, boolean z) {
        this.liveRoomCount = i;
        this.autoSwipeToNext = z;
    }
}
