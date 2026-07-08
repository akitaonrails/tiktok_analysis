package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_quick_return_log")
public final class LiveQuickReturnLogSetting {
    public static final float DEFAULT = 1.0f;
    public static final LiveQuickReturnLogSetting INSTANCE = new LiveQuickReturnLogSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("live_quick_return_log", DEFAULT);
    }
}
