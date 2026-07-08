package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_quick_return_opt")
public final class LiveQuickReturnOptSetting {
    public static final LiveQuickReturnOptSetting INSTANCE = new LiveQuickReturnOptSetting();
    public static final LiveQuickReturnOptSettingConfig DEFAULT = new LiveQuickReturnOptSettingConfig();

    public static final int getDelayTime() {
        return INSTANCE.getValue().delayTime;
    }

    public static final long getExpireTime() {
        return INSTANCE.getValue().expireTime;
    }

    public static final int getMockStatusCode() {
        return INSTANCE.getValue().mockStatusCode;
    }

    private final LiveQuickReturnOptSettingConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveQuickReturnOptSettingConfig liveQuickReturnOptSettingConfig = DEFAULT;
        LiveQuickReturnOptSettingConfig liveQuickReturnOptSettingConfig2 = (LiveQuickReturnOptSettingConfig) settingsManager.getValueSafely("live_quick_return_opt", liveQuickReturnOptSettingConfig);
        return liveQuickReturnOptSettingConfig2 != null ? liveQuickReturnOptSettingConfig2 : liveQuickReturnOptSettingConfig;
    }

    public static final boolean isEnabled() {
        return INSTANCE.getValue().expireTime > 0;
    }
}
