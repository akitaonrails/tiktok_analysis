package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class AnchorMockVideoSizeConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("width")
    public int width = 540;

    @C09CT("height")
    public int height = 960;

    static {
        NormalGson.singleton();
        ADAPTER = new AnchorMockVideoSizeConfig_OptTypeAdapter();
    }
}
