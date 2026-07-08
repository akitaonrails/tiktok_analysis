package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveMessageSampleType {
    public static final TypeAdapter ADAPTER = new LiveMessageSampleType_OptTypeAdapter(NormalGson.singleton());

    @C09CT("p2p_ratio")
    public LiveMessageSampleRatio p2pRatio;

    @C09CT("room_ratio")
    public LiveMessageSampleRatio roomRatio;

    public LiveMessageSampleType() {
        this(new LiveMessageSampleRatio(0L, 0L, 0L, 1000L), new LiveMessageSampleRatio(0L, 0L, 0L, 1000L));
    }

    public final LiveMessageSampleRatio getP2pRatio() {
        return this.p2pRatio;
    }

    public final LiveMessageSampleRatio getRoomRatio() {
        return this.roomRatio;
    }

    public final void setP2pRatio(LiveMessageSampleRatio liveMessageSampleRatio) {
        this.p2pRatio = liveMessageSampleRatio;
    }

    public final void setRoomRatio(LiveMessageSampleRatio liveMessageSampleRatio) {
        this.roomRatio = liveMessageSampleRatio;
    }

    public LiveMessageSampleType(LiveMessageSampleRatio liveMessageSampleRatio, LiveMessageSampleRatio liveMessageSampleRatio2) {
        this.roomRatio = liveMessageSampleRatio;
        this.p2pRatio = liveMessageSampleRatio2;
    }
}
