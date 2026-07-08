package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_top_live_enable_landing_by_feature")
public final class MultiTopLiveEnableLandingByFeatureSetting {
    public static final boolean DEFAULT = false;
    public static final MultiTopLiveEnableLandingByFeatureSetting INSTANCE = new MultiTopLiveEnableLandingByFeatureSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_top_live_enable_landing_by_feature", DEFAULT);
    }
}
