package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_game_dual_device_qr_code_cache_setting")
public final class LiveDualDeviceQRCodeCacheSetting {
    public static final int DEFAULT = 0;
    public static final int GROUP_EXPERIMENT = 1;
    public static final LiveDualDeviceQRCodeCacheSetting INSTANCE = new LiveDualDeviceQRCodeCacheSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_game_dual_device_qr_code_cache_setting", DEFAULT);
    }

    public final boolean isExperimentGroup() {
        return getValue() == 1;
    }
}
