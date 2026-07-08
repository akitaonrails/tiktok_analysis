package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_cohost_simulcast")
public final class LivesdkCohostSimulcastSetting {
    public static final boolean DEFAULT = false;
    public static final LivesdkCohostSimulcastSetting INSTANCE = new LivesdkCohostSimulcastSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_cohost_simulcast", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
