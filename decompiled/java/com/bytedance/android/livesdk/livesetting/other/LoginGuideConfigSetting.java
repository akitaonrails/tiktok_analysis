package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.LoginGuideConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("login_guide_config")
public final class LoginGuideConfigSetting {
    public static final LoginGuideConfigSetting INSTANCE = new LoginGuideConfigSetting();
    public static final LoginGuideConfig DEFAULT = new LoginGuideConfig();

    public final LoginGuideConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LoginGuideConfig loginGuideConfig = DEFAULT;
        LoginGuideConfig loginGuideConfig2 = (LoginGuideConfig) settingsManager.getValueSafely("login_guide_config", loginGuideConfig);
        return loginGuideConfig2 != null ? loginGuideConfig2 : loginGuideConfig;
    }
}
