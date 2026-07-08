package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class RTCInputQueueSettings {
    public static final TypeAdapter ADAPTER = new RTCInputQueueSettings_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("queue_size")
    public int queueSize;

    public RTCInputQueueSettings() {
        this(false, TTLSRTCInputQueueSettings.INSTANCE.getDEFAULT_QUEUE_SIZE());
    }

    public RTCInputQueueSettings(boolean z, int i) {
        this.enable = z;
        this.queueSize = i;
    }
}
