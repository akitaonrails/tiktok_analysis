package com.bytedance.android.livesdk.setting;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_draw_list_backup_setting")
public final class LiveDrawListBackupSetting {
    public static final LiveDrawListBackupConfig DEFAULT;
    public static final LiveDrawListBackupSetting INSTANCE = new LiveDrawListBackupSetting();
    public static final LiveDrawListBackupConfig config;

    static {
        LiveDrawListBackupConfig liveDrawListBackupConfig = new LiveDrawListBackupConfig(false, false, false, 0L);
        DEFAULT = liveDrawListBackupConfig;
        LiveDrawListBackupConfig liveDrawListBackupConfig2 = (LiveDrawListBackupConfig) SettingsManager.INSTANCE.getValueSafely("live_draw_list_backup_setting", liveDrawListBackupConfig);
        if (liveDrawListBackupConfig2 != null) {
            liveDrawListBackupConfig = liveDrawListBackupConfig2;
        }
        config = liveDrawListBackupConfig;
    }

    public final long requestDelay() {
        return config.requestDelay;
    }

    public final boolean useFeedData() {
        return config.useFeedData;
    }

    public final boolean useSkylightData() {
        return config.useSkylightData;
    }

    public final LiveDrawListBackupConfig getConfig() {
        return config;
    }

    public final LiveDrawListBackupConfig getDEFAULT() {
        return DEFAULT;
    }

    public final boolean enable(String str) {
        if (config.enable && C13LQ.LJIILLIIL(str, LiveDrawListBackupEntrance.INSTANCE.getEntrance())) {
            return true;
        }
        return false;
    }
}
