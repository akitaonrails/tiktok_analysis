package com.bytedance.ies.sdk.widgets;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public class LayeredElementConfig {
    public static final TypeAdapter ADAPTER = new LayeredElementConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("animation_duration")
    public long animationDuration = 300;

    @C09CT("guideline_indicator_enabled")
    public boolean guidelineIndicatorEnabled;

    public static LayeredElementConfig createDefault() {
        return new LayeredElementConfig();
    }

    public long getAnimationDuration() {
        return this.animationDuration;
    }

    public boolean isGuidelineIndicatorEnabled() {
        return this.guidelineIndicatorEnabled;
    }
}
