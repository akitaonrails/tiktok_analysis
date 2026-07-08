package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_audience_sei_missed_time")
public final class MultiGuestSdkAudienceSeiMissedTimeSetting {
    public static final int DEFAULT = 30000;
    public static final MultiGuestSdkAudienceSeiMissedTimeSetting INSTANCE = new MultiGuestSdkAudienceSeiMissedTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_sdk_audience_sei_missed_time", DEFAULT);
    }
}
