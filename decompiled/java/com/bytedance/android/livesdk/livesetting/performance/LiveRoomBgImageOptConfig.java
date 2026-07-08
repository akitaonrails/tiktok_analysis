package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRoomBgImageOptConfig {
    public static final TypeAdapter ADAPTER = new LiveRoomBgImageOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("blur_radius")
    public float blurRadius;

    @C09CT("client_draw_blur_higher_12")
    public boolean clientDrawBlur;

    @C09CT("use_8888")
    public boolean use8888;

    @C09CT("use_blurEffect")
    public boolean useBlurEffect;

    public LiveRoomBgImageOptConfig() {
        this(false, false, false, 1.0f);
    }

    public LiveRoomBgImageOptConfig(boolean z, boolean z2, boolean z3, float f) {
        this.use8888 = z;
        this.clientDrawBlur = z2;
        this.useBlurEffect = z3;
        this.blurRadius = f;
    }
}
