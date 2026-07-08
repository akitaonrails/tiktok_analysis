package com.bytedance.android.livesdk.broadcast.preview.modecontainer;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewWidgetLoadConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("p0_delay")
    public long p0Delay = 24;

    @C09CT("p1_delay")
    public long p1Delay = 48;

    @C09CT("p2_delay")
    public long p2Delay;

    static {
        NormalGson.singleton();
        ADAPTER = new PreviewWidgetLoadConfig_OptTypeAdapter();
    }
}
