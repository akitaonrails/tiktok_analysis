package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "ttlh_adaptive_for_dual_device_config")
public final class TTLHAdaptiveForDualDeviceConfigSetting {
    public static final String DEFAULT = "";
    public static final TTLHAdaptiveForDualDeviceConfigSetting INSTANCE = new TTLHAdaptiveForDualDeviceConfigSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("ttlh_adaptive_for_dual_device_config", DEFAULT);
    }
}
