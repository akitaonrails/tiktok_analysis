package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_identify_unload_widget_mock")
public final class LiveCoHostIdentifyUnloadWidgetMockSetting {
    public static final int DEFAULT = 0;
    public static final LiveCoHostIdentifyUnloadWidgetMockSetting INSTANCE = new LiveCoHostIdentifyUnloadWidgetMockSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_identify_unload_widget_mock", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
