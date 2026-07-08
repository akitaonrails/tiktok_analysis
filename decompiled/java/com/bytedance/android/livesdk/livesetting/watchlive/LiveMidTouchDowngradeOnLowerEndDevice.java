package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "mid_touch_downgrade_strategy_on_lower_device")
public final class LiveMidTouchDowngradeOnLowerEndDevice {
    public static final LiveMidTouchDowngradeOnLowerEndDevice INSTANCE = new LiveMidTouchDowngradeOnLowerEndDevice();
    public static final LowerDeviceMidTouchDowngradeConfigData DEFAULT = new LowerDeviceMidTouchDowngradeConfigData(false, true, 0, false);

    public final LowerDeviceMidTouchDowngradeConfigData getValue() {
        return (LowerDeviceMidTouchDowngradeConfigData) SettingsManager.INSTANCE.getValueSafely("mid_touch_downgrade_strategy_on_lower_device", DEFAULT);
    }

    public final LowerDeviceMidTouchDowngradeConfigData getDEFAULT() {
        return DEFAULT;
    }
}
