package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "mt_live_pb_dynamic_preload_config")
public final class LivePBDynamicPreloadConfigSetting {
    public static final int DEFAULT = 0;
    public static final LivePBDynamicPreloadConfigSetting INSTANCE = new LivePBDynamicPreloadConfigSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("mt_live_pb_dynamic_preload_config", DEFAULT);
    }
}
