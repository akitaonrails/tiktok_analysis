package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_epi_feature_migrate_to_feature_center")
public final class LiveEpiFeatureMigrateToFeatureCenterSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEpiFeatureMigrateToFeatureCenterSetting INSTANCE = new LiveEpiFeatureMigrateToFeatureCenterSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_epi_feature_migrate_to_feature_center", DEFAULT);
    }
}
