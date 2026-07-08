package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ReceiveMsgConfig {
    public static final TypeAdapter ADAPTER;
    public static final transient ReceiveMsgConfig LIZ = new ReceiveMsgConfig(0);

    @C09CT("delay_enqueue_milliseconds")
    public int delayEnqueueSec;

    public ReceiveMsgConfig() {
        this(0);
    }

    static {
        NormalGson.singleton();
        ADAPTER = new ReceiveMsgConfig_OptTypeAdapter();
    }

    public ReceiveMsgConfig(int i) {
        this.delayEnqueueSec = i;
    }
}
