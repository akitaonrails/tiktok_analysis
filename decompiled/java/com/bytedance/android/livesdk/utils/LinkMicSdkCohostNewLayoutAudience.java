package com.bytedance.android.livesdk.utils;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_audience_new_layout")
public final class LinkMicSdkCohostNewLayoutAudience {
    public static final boolean DEFAULT = false;
    public static final LinkMicSdkCohostNewLayoutAudience INSTANCE = new LinkMicSdkCohostNewLayoutAudience();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_audience_new_layout", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
