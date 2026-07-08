package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_cohost_unpolished_tip_brightness_threshold")
public final class MultiCoHostUnpolishedTipBrightnessThresholdSetting {
    public static final MultiCoHostUnpolishedTipBrightnessThresholdSetting INSTANCE = new MultiCoHostUnpolishedTipBrightnessThresholdSetting();
    public static final double DEFAULT = 0.1d;

    public final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_cohost_unpolished_tip_brightness_threshold", DEFAULT);
    }
}
