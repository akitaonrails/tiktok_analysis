package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_video_quality_opt_v2_enable")
public final class GameLiveVideoQualityOptV2EnableSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final GameLiveVideoQualityOptV2EnableSetting INSTANCE = new GameLiveVideoQualityOptV2EnableSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("game_live_video_quality_opt_v2_enable", DEFAULT);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("game_live_video_quality_opt_v2_enable", DEFAULT);
    }
}
