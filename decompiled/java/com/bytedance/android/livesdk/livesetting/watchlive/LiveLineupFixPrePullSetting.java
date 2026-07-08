package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_lineup_fix_pre_pull")
public final class LiveLineupFixPrePullSetting {
    public static final boolean DEFAULT = true;
    public static final LiveLineupFixPrePullSetting INSTANCE = new LiveLineupFixPrePullSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_lineup_fix_pre_pull", DEFAULT);
    }
}
