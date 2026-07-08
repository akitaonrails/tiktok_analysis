package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_landscape_auto_hide_time")
public final class GameLiveLandscapeAutoHideTimeSetting {
    public static final long DEFAULT = 5;
    public static final GameLiveLandscapeAutoHideTimeSetting INSTANCE = new GameLiveLandscapeAutoHideTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("game_live_landscape_auto_hide_time", DEFAULT) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
