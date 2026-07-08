package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_dual_device_pad_enable_setting")
public final class GameLiveDualDevicePadEnableSettingSetting {
    public static final boolean DEFAULT = false;
    public static final GameLiveDualDevicePadEnableSettingSetting INSTANCE = new GameLiveDualDevicePadEnableSettingSetting();

    public final boolean isPadEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("game_live_dual_device_pad_enable_setting", DEFAULT);
    }
}
