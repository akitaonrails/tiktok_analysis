package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "skylight_backup_data_setting")
public final class SkylightBackupDataSetting {
    public static final SkylightBackupDataConfig DEFAULT;
    public static final SkylightBackupDataSetting INSTANCE = new SkylightBackupDataSetting();
    public static final SkylightBackupDataConfig config;

    static {
        SkylightBackupDataConfig skylightBackupDataConfig = new SkylightBackupDataConfig(2, 600000L, 0);
        DEFAULT = skylightBackupDataConfig;
        SkylightBackupDataConfig skylightBackupDataConfig2 = (SkylightBackupDataConfig) SettingsManager.INSTANCE.getValueSafely("skylight_backup_data_setting", skylightBackupDataConfig);
        if (skylightBackupDataConfig2 != null) {
            skylightBackupDataConfig = skylightBackupDataConfig2;
        }
        config = skylightBackupDataConfig;
    }

    public final long expireTime() {
        return config.expireTime;
    }

    public final int filterStrategy() {
        return config.filterStrategy;
    }

    public final int maxSize() {
        return config.maxSize;
    }

    public final SkylightBackupDataConfig getConfig() {
        return config;
    }

    public final SkylightBackupDataConfig getDEFAULT() {
        return DEFAULT;
    }
}
