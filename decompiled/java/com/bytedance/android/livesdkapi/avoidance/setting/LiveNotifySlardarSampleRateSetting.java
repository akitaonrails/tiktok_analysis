package com.bytedance.android.livesdkapi.avoidance.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_notify_component_slardar_sample_rate")
public final class LiveNotifySlardarSampleRateSetting {
    public static final LiveNotifySlardarSampleRateSetting INSTANCE = new LiveNotifySlardarSampleRateSetting();
    public static final double DEFAULT = 0.01d;

    public static final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_notify_component_slardar_sample_rate", DEFAULT);
    }
}
