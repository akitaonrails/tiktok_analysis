package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_chain_log_config")
public final class LivePublicScreenChainLogConfigSetting {
    public static final LivePublicScreenChainLogConfigSetting INSTANCE = new LivePublicScreenChainLogConfigSetting();
    public static final SettingConfig DEFAULT = new SettingConfig();

    private final SettingConfig getValue() {
        SettingConfig settingConfig = (SettingConfig) SettingsManager.INSTANCE.getValueSafely(LivePublicScreenChainLogConfigSetting.class);
        return settingConfig == null ? DEFAULT : settingConfig;
    }

    public final double countAndStatusSample() {
        if (getValue().countSimple == 0) {
            return 0.0d;
        }
        return 1.0d / ((double) getValue().countSimple);
    }

    public final double perfSample() {
        if (getValue().perfSimple == 0) {
            return 0.0d;
        }
        return 1.0d / ((double) getValue().perfSimple);
    }

    public final boolean uploadCountAndStatus() {
        return getValue().uploadCountAndStatus;
    }

    public final boolean uploadPerf() {
        return getValue().uploadPerf;
    }
}
