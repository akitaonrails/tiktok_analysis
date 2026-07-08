package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("highlight_cut_config_setting")
public final class HighLightCutConfigSetting {
    public static final HighLightCutConfigSetting INSTANCE = new HighLightCutConfigSetting();
    public static final DefaultHighLightCutConfig DEFAULT = new DefaultHighLightCutConfig();

    public final DefaultHighLightCutConfig getValue() {
        DefaultHighLightCutConfig defaultHighLightCutConfig = (DefaultHighLightCutConfig) SettingsManager.INSTANCE.getValueSafely(HighLightCutConfigSetting.class);
        return defaultHighLightCutConfig == null ? DEFAULT : defaultHighLightCutConfig;
    }
}
