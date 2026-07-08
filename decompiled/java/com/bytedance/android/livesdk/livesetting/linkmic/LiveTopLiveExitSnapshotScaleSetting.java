package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_toplive_exit_snapshot_scale")
public final class LiveTopLiveExitSnapshotScaleSetting {
    public static final float DEFAULT = 0.5f;
    public static final LiveTopLiveExitSnapshotScaleSetting INSTANCE = new LiveTopLiveExitSnapshotScaleSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("live_toplive_exit_snapshot_scale", DEFAULT);
    }
}
