package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_capsule_style_config")
public final class LiveCapsuleStyleConfigSetting {
    public static final LiveCapsuleStyleConfig DEFAULT;
    public static final LiveCapsuleStyleConfigSetting INSTANCE = new LiveCapsuleStyleConfigSetting();

    static {
        LiveCapsuleStyleConfig liveCapsuleStyleConfig = new LiveCapsuleStyleConfig();
        liveCapsuleStyleConfig.capsuleStyleItemConfig = LiveCapsuleStyleItemConfig.LIZ();
        liveCapsuleStyleConfig.multiStrategyCapsuleStyleConfig = LiveCapsuleStyleItemConfig.LIZ();
        DEFAULT = liveCapsuleStyleConfig;
    }

    public final LiveCapsuleStyleConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveCapsuleStyleConfig liveCapsuleStyleConfig = DEFAULT;
        LiveCapsuleStyleConfig liveCapsuleStyleConfig2 = (LiveCapsuleStyleConfig) settingsManager.getValueSafely("live_capsule_style_config", liveCapsuleStyleConfig);
        return liveCapsuleStyleConfig2 != null ? liveCapsuleStyleConfig2 : liveCapsuleStyleConfig;
    }
}
