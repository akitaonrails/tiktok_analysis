package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = true, value = "smooth_clear_screen")
public final class SmoothClearScreenSetting {
    public static final SmoothClearScreenConfig DEFAULT;
    public static final SmoothClearScreenSetting INSTANCE = new SmoothClearScreenSetting();
    public static SmoothClearScreenConfig value;

    static {
        SmoothClearScreenConfig smoothClearScreenConfig = new SmoothClearScreenConfig(false, false);
        DEFAULT = smoothClearScreenConfig;
        SmoothClearScreenConfig smoothClearScreenConfig2 = (SmoothClearScreenConfig) SettingsManager.INSTANCE.getValueSafely("smooth_clear_screen", smoothClearScreenConfig);
        if (smoothClearScreenConfig2 != null) {
            smoothClearScreenConfig = smoothClearScreenConfig2;
        }
        value = smoothClearScreenConfig;
    }

    public final boolean optimizeAnimation() {
        return value.optimizeAnimation;
    }

    public final boolean smoothGesture() {
        return value.smoothGesture;
    }
}
