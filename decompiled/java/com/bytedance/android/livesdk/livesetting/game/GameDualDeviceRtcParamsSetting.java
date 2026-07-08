package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("game_dual_device_rtc_params")
public final class GameDualDeviceRtcParamsSetting {
    public static final GameDualDeviceRtcParamsSetting INSTANCE = new GameDualDeviceRtcParamsSetting();
    public static final GameDualDeviceRtcParams DEFAULT = new GameDualDeviceRtcParams(15, 3, 6, 5, 3);

    public final GameDualDeviceRtcParams getConfig() {
        GameDualDeviceRtcParams gameDualDeviceRtcParams = (GameDualDeviceRtcParams) SettingsManager.INSTANCE.getValueSafely(GameDualDeviceRtcParamsSetting.class);
        return gameDualDeviceRtcParams == null ? DEFAULT : gameDualDeviceRtcParams;
    }
}
