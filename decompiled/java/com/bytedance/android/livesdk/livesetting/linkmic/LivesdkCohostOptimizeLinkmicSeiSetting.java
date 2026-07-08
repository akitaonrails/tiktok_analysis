package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_cohost_optimize_linkmic_sei")
public final class LivesdkCohostOptimizeLinkmicSeiSetting {
    public static final boolean DEFAULT = false;
    public static final LivesdkCohostOptimizeLinkmicSeiSetting INSTANCE = new LivesdkCohostOptimizeLinkmicSeiSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_cohost_optimize_linkmic_sei", DEFAULT);
    }
}
