package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_activity_rebuild_opt")
public final class LiveActivityRebuildOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveActivityRebuildOptSetting INSTANCE = new LiveActivityRebuildOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_activity_rebuild_opt", DEFAULT);
    }
}
