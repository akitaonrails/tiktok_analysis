package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_toplive_phase_3_switch")
public final class LiveSdkMultiTopLivePhase3Setting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiTopLivePhase3Setting INSTANCE = new LiveSdkMultiTopLivePhase3Setting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_toplive_phase_3_switch", DEFAULT);
    }
}
