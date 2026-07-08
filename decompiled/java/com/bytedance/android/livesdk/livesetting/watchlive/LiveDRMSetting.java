package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("live_drm_setting")
public final class LiveDRMSetting {
    public static final LiveDRMSetting INSTANCE = new LiveDRMSetting();
    public static final DRMConfig DEFAULT = new DRMConfig();

    public final DRMConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        DRMConfig dRMConfig = DEFAULT;
        DRMConfig dRMConfig2 = (DRMConfig) settingsManager.getValueSafely("live_drm_setting", dRMConfig);
        return dRMConfig2 != null ? dRMConfig2 : dRMConfig;
    }

    public final boolean enable() {
        return getValue().enable;
    }

    public final DRMConfig getDEFAULT() {
        return DEFAULT;
    }
}
