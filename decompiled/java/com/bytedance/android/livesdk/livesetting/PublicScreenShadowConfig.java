package com.bytedance.android.livesdk.livesetting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class PublicScreenShadowConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("shadow_x")
    public float shadowX;

    @C09CT("shadow_color")
    public String shadowColor = "#33000000";

    @C09CT("shadow_y")
    public float shadowY = 1.0f;

    @C09CT("shadow_height")
    public float shadowHeight = 1.0f;

    static {
        NormalGson.singleton();
        ADAPTER = new PublicScreenShadowConfig_OptTypeAdapter();
    }
}
