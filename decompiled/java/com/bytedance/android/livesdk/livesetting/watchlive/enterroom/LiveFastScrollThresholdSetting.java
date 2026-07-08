package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_android_fast_normal_threshold")
public final class LiveFastScrollThresholdSetting {
    public static final LiveFastScrollThresholdSetting INSTANCE = new LiveFastScrollThresholdSetting();
    public static final double DEFAULT = 0.5d;

    public final double getSettingValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_android_fast_normal_threshold", DEFAULT);
    }

    public final double getDEFAULT() {
        return DEFAULT;
    }
}
