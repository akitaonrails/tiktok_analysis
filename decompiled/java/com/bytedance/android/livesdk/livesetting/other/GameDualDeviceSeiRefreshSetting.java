package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("game_dual_device_sei_refresh_setting")
public final class GameDualDeviceSeiRefreshSetting {
    public static final int DISABLE = 0;
    public static final GameDualDeviceSeiRefreshSetting INSTANCE = new GameDualDeviceSeiRefreshSetting();
    public static final int DEFAULT = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("game_dual_device_sei_refresh_setting", DEFAULT);
    }

    public final boolean isExperimentGroup() {
        return getValue() == DEFAULT;
    }
}
