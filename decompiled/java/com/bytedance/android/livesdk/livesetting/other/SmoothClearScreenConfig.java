package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class SmoothClearScreenConfig {
    public static final TypeAdapter ADAPTER = new SmoothClearScreenConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("optimize_animation")
    public boolean optimizeAnimation;

    @C09CT("smooth_gesture")
    public boolean smoothGesture;

    public SmoothClearScreenConfig() {
        this(false, false);
    }

    public SmoothClearScreenConfig(boolean z, boolean z2) {
        this.smoothGesture = z;
        this.optimizeAnimation = z2;
    }
}
