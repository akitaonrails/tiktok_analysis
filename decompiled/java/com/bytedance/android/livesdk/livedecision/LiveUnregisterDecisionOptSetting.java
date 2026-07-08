package com.bytedance.android.livesdk.livedecision;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_unregister_decision_opt")
public final class LiveUnregisterDecisionOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveUnregisterDecisionOptSetting INSTANCE = new LiveUnregisterDecisionOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_unregister_decision_opt", DEFAULT);
    }
}
