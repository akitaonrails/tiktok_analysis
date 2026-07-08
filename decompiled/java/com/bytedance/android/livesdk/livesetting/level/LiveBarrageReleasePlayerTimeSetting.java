package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_barrage_release_player_time")
public final class LiveBarrageReleasePlayerTimeSetting {
    public static final long DEFAULT = 40000;
    public static final LiveBarrageReleasePlayerTimeSetting INSTANCE = new LiveBarrageReleasePlayerTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_barrage_release_player_time", DEFAULT);
    }
}
