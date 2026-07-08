package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_widget_load_settings")
public final class LiveHostWidgetLoadSettings {
    public static final LiveHostWidgetLoadSettings INSTANCE = new LiveHostWidgetLoadSettings();
    public static final LiveHostWidgetLoadConfig DEFAULT = new LiveHostWidgetLoadConfig();

    public static final LiveHostWidgetLoadConfig value() {
        LiveHostWidgetLoadConfig liveHostWidgetLoadConfig = (LiveHostWidgetLoadConfig) SettingsManager.INSTANCE.getValueSafely(LiveHostWidgetLoadSettings.class);
        return liveHostWidgetLoadConfig == null ? DEFAULT : liveHostWidgetLoadConfig;
    }
}
