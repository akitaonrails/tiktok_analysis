package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_preview_dual_device_widget_setting")
public final class GamePreviewDualDeviceWidgetSetting {
    public static final int DEFAULT = 1;
    public static final GamePreviewDualDeviceWidgetSetting INSTANCE = new GamePreviewDualDeviceWidgetSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_preview_dual_device_widget_setting", DEFAULT);
    }

    public final boolean enable() {
        return getValue() == 1;
    }
}
