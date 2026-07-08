package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_multiguest_optimize_linkmic_sei")
public final class LivesdkMultiguestOptimizeLinkmicSeiSetting {
    public static final boolean DEFAULT = false;
    public static final LivesdkMultiguestOptimizeLinkmicSeiSetting INSTANCE = new LivesdkMultiguestOptimizeLinkmicSeiSetting();

    public final boolean enable(int i) {
        if (i == 2) {
            return LivesdkCohostOptimizeLinkmicSeiSetting.INSTANCE.enable();
        }
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_multiguest_optimize_linkmic_sei", DEFAULT);
    }
}
