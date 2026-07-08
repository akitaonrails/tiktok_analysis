package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_nearby_label_experiment_version")
public final class LiveNearbyLabelExperimentVersionSetting {
    public static final String DEFAULT = "v1";
    public static final LiveNearbyLabelExperimentVersionSetting INSTANCE = new LiveNearbyLabelExperimentVersionSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_nearby_label_experiment_version", DEFAULT);
    }
}
