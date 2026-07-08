package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_count_down_for_all_backup_refresh_banner_interval")
public final class LinkmicCountDownForAllBackupRefreshBannerIntervalSetting {
    public static final int DEFAULT = 3;
    public static final LinkmicCountDownForAllBackupRefreshBannerIntervalSetting INSTANCE = new LinkmicCountDownForAllBackupRefreshBannerIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_count_down_for_all_backup_refresh_banner_interval", DEFAULT);
    }
}
