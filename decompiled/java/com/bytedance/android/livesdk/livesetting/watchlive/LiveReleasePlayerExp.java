package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_release_player_exp")
public final class LiveReleasePlayerExp {
    public static final boolean DEFAULT = false;
    public static final LiveReleasePlayerExp INSTANCE = new LiveReleasePlayerExp();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_release_player_exp", DEFAULT);
    }
}
