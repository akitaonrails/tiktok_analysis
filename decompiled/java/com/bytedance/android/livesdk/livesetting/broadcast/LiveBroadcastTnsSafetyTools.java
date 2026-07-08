package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_new_creator_onboarding_safety_tools_for_tns")
public final class LiveBroadcastTnsSafetyTools {
    public static final LiveBroadcastTnsSafetyTools INSTANCE = new LiveBroadcastTnsSafetyTools();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_new_creator_onboarding_safety_tools_for_tns", DEFAULT);

    public static final boolean enableSolutionA() {
        return (value & 1) != 0;
    }

    public static final boolean enableSolutionB() {
        return (value & 2) != 0;
    }
}
