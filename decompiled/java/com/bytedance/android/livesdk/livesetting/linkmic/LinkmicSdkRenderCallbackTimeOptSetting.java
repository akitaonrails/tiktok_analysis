package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "linkmic_sdk_render_callback_time_opt")
public final class LinkmicSdkRenderCallbackTimeOptSetting {
    public static final int DEFAULT = 0;
    public static final LinkmicSdkRenderCallbackTimeOptSetting INSTANCE = new LinkmicSdkRenderCallbackTimeOptSetting();
    public static final int OPT = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_sdk_render_callback_time_opt", DEFAULT);
    }

    public final boolean isOpt() {
        return getValue() == 1;
    }
}
