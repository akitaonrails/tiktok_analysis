package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_recharge_fallback_for_conflict_scene")
public final class LiveCohostRechargeFallbackForConflictSceneSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCohostRechargeFallbackForConflictSceneSetting INSTANCE = new LiveCohostRechargeFallbackForConflictSceneSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_recharge_fallback_for_conflict_scene", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
