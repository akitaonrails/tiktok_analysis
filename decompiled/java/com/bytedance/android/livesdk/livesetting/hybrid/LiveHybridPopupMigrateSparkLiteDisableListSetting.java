package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_popup_migrate_spark_lite_disable_list")
public final class LiveHybridPopupMigrateSparkLiteDisableListSetting {
    public static final LiveHybridPopupMigrateSparkLiteDisableListSetting INSTANCE = new LiveHybridPopupMigrateSparkLiteDisableListSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_hybrid_popup_migrate_spark_lite_disable_list", DEFAULT);
    }
}
