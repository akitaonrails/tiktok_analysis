package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveHostWidgetLoadConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("p0_delay")
    public long p0Delay;

    @C09CT("p1_delay")
    public long p1Delay = 500;

    @C09CT("p2_delay")
    public long p2Delay = 800;

    @C09CT("local_delay")
    public long localDelay = 800;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveHostWidgetLoadConfig_OptTypeAdapter();
    }
}
