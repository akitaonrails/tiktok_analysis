package com.bytedance.android.livesdk.game.common.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("show_tip_low_end_device_max")
public final class ShowTipLowEndDeviceMax {
    public static final int $stable = 0;
    public static final int DEFAULT = 6;
    public static final ShowTipLowEndDeviceMax INSTANCE = new ShowTipLowEndDeviceMax();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("show_tip_low_end_device_max", DEFAULT);
    }
}
