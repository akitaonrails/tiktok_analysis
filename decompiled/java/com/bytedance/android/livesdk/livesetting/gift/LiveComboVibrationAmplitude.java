package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_gift_combo_vibration_amplitude")
public final class LiveComboVibrationAmplitude {
    public static final int DEFAULT = 100;
    public static final LiveComboVibrationAmplitude INSTANCE = new LiveComboVibrationAmplitude();

    public final int getValue() {
        int intValue = SettingsManager.INSTANCE.getIntValue("live_gift_combo_vibration_amplitude", DEFAULT);
        if (intValue < 0) {
            return 0;
        }
        if (intValue > 255) {
            return 255;
        }
        return intValue;
    }
}
