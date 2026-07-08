package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_random_linkmic_oom_fix_setting")
public final class LiveCohostRandomLinkmicOOMFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCohostRandomLinkmicOOMFixSetting INSTANCE = new LiveCohostRandomLinkmicOOMFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_random_linkmic_oom_fix_setting", DEFAULT);
    }
}
