package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("widget_custom_load_opt")
public final class WidgetCustomLoadOptSetting {
    public static final WidgetCustomLoadOptSetting INSTANCE = new WidgetCustomLoadOptSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("widget_custom_load_opt", DEFAULT);

    public final boolean enableLoadBackup() {
        return (value & 2) == 2;
    }

    public final boolean enablePreloadConfig() {
        return (value & 8) == 8;
    }

    public final boolean enableTogetherShow() {
        return (value & 1) == 1;
    }

    public final boolean enableWidgetProvider() {
        return (value & 4) == 4;
    }
}
