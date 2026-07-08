package com.bytedance.android.livesdk.broadcast.preview.modecontainer;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "preview_widget_load_setting")
public final class PreviewWidgetLoadSetting {
    public static final PreviewWidgetLoadSetting INSTANCE = new PreviewWidgetLoadSetting();
    public static final PreviewWidgetLoadConfig DEFAULT = new PreviewWidgetLoadConfig();

    public final PreviewWidgetLoadConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PreviewWidgetLoadConfig previewWidgetLoadConfig = DEFAULT;
        PreviewWidgetLoadConfig previewWidgetLoadConfig2 = (PreviewWidgetLoadConfig) settingsManager.getValueSafely("preview_widget_load_setting", previewWidgetLoadConfig);
        return previewWidgetLoadConfig2 != null ? previewWidgetLoadConfig2 : previewWidgetLoadConfig;
    }
}
