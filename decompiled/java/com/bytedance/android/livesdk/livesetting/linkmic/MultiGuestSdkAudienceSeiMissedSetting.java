package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_audience_sei_missed")
public final class MultiGuestSdkAudienceSeiMissedSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestSdkAudienceSeiMissedSetting INSTANCE = new MultiGuestSdkAudienceSeiMissedSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_sdk_audience_sei_missed", DEFAULT);
    }
}
