package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_widget_slardar_threshold")
public final class LiveWidgetSlardarThresholdSetting {
    public static final int DEFAULT = 5;
    public static final LiveWidgetSlardarThresholdSetting INSTANCE = new LiveWidgetSlardarThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_widget_slardar_threshold", DEFAULT);
    }
}
