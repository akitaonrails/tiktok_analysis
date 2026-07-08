package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_preview_config")
public final class LiveMessagePreviewSetting {
    public static final LiveMessagePreviewSetting INSTANCE = new LiveMessagePreviewSetting();
    public static final LiveMessagePreviewConfig DEFAULT = new LiveMessagePreviewConfig(true, false, 10000);

    public final LiveMessagePreviewConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMessagePreviewConfig liveMessagePreviewConfig = DEFAULT;
        LiveMessagePreviewConfig liveMessagePreviewConfig2 = (LiveMessagePreviewConfig) settingsManager.getValueSafely("live_message_preview_config", liveMessagePreviewConfig);
        return liveMessagePreviewConfig2 != null ? liveMessagePreviewConfig2 : liveMessagePreviewConfig;
    }
}
