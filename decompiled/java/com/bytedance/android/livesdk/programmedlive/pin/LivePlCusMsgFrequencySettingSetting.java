package com.bytedance.android.livesdk.programmedlive.pin;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pl_cus_msg_frequency_setting")
public final class LivePlCusMsgFrequencySettingSetting {
    public static final boolean DEFAULT = true;
    public static final LivePlCusMsgFrequencySettingSetting INSTANCE = new LivePlCusMsgFrequencySettingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pl_cus_msg_frequency_setting", DEFAULT);
    }
}
