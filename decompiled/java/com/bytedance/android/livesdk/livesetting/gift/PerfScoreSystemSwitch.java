package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_performance_scoring_system_disable")
public final class PerfScoreSystemSwitch {
    public static final boolean DEFAULT = false;
    public static final PerfScoreSystemSwitch INSTANCE = new PerfScoreSystemSwitch();

    public final boolean isDisabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_performance_scoring_system_disable", DEFAULT);
    }
}
