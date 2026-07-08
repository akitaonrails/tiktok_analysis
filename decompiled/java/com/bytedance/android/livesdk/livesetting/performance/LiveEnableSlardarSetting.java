package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_enable_slardar")
public final class LiveEnableSlardarSetting {
    public static final boolean DEFAULT = true;
    public static final LiveEnableSlardarSetting INSTANCE = new LiveEnableSlardarSetting();

    private final boolean getSettingVal() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_slardar", DEFAULT);
    }

    public final boolean isDisable(String str) {
        if ((getSettingVal() || (!getSettingVal() && LiveEnableSlardarAllowList.INSTANCE.isEnable(str))) && !ScalableDowngradeSetting.disableApmLog() && !LiveInnerDowngradeAdaptExp.INSTANCE.isDisableApmLog() && !LiveHostAutoAdaptiveParams.disableApmLog()) {
            return false;
        }
        return true;
    }
}
