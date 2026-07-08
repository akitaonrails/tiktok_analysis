package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.VolumeDetectConfig;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_volume_detect_config")
public final class LiveVolumeDetectSetting {
    public static final LiveVolumeDetectSetting INSTANCE = new LiveVolumeDetectSetting();
    public static final VolumeDetectConfig DEFAULT = new VolumeDetectConfig(3, 3, 3, 3, 3);

    public final VolumeDetectConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        VolumeDetectConfig volumeDetectConfig = DEFAULT;
        VolumeDetectConfig volumeDetectConfig2 = (VolumeDetectConfig) settingsManager.getValueSafely("live_volume_detect_config", volumeDetectConfig);
        return volumeDetectConfig2 != null ? volumeDetectConfig2 : volumeDetectConfig;
    }
}
