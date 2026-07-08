package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_variant_card_display_calibration")
public final class LiveVariantCardDisplayCalibrationSetting {
    public static final boolean DEFAULT = false;
    public static final LiveVariantCardDisplayCalibrationSetting INSTANCE = new LiveVariantCardDisplayCalibrationSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_variant_card_display_calibration", DEFAULT);
    }
}
