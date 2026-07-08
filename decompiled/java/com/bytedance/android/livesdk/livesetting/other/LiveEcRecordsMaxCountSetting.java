package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_ec_records_max_count")
public final class LiveEcRecordsMaxCountSetting {
    public static final int DEFAULT = 0;
    public static final LiveEcRecordsMaxCountSetting INSTANCE = new LiveEcRecordsMaxCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_ec_records_max_count", DEFAULT);
    }
}
