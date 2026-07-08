package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "short_touch_downgrade_strategy_on_lower_device")
public final class LiveShortTouchDowngradeOnLowerEndDevice {
    public static final LiveShortTouchDowngradeOnLowerEndDevice INSTANCE = new LiveShortTouchDowngradeOnLowerEndDevice();
    public static final LowerDeviceShortTouchDowngradeConfigData DEFAULT = new LowerDeviceShortTouchDowngradeConfigData(false, true, 0, false, 0);

    public final LowerDeviceShortTouchDowngradeConfigData getValue() {
        return (LowerDeviceShortTouchDowngradeConfigData) SettingsManager.INSTANCE.getValueSafely("short_touch_downgrade_strategy_on_lower_device", DEFAULT);
    }

    public final LowerDeviceShortTouchDowngradeConfigData getDEFAULT() {
        return DEFAULT;
    }
}
