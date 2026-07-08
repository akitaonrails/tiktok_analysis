package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_scale_native_banner_low_score")
public final class LiveScaleNativeBannerLowScore {
    public static final float DEFAULT = 0.0f;
    public static final LiveScaleNativeBannerLowScore INSTANCE = new LiveScaleNativeBannerLowScore();

    public static final float value() {
        return SettingsManager.INSTANCE.getFloatValue("live_scale_native_banner_low_score", DEFAULT);
    }
}
