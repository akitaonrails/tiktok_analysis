package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LikeDiggTapBehaviorConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("digg_tap_alpha_start_alpha")
    public float diggTapStartAlpha = -1.0f;

    @C09CT("digg_tap_alpha_end_alpha")
    public float diggTapEndAlpha = -1.0f;

    static {
        NormalGson.singleton();
        ADAPTER = new LikeDiggTapBehaviorConfig_OptTypeAdapter();
    }
}
