package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_moment_quick_comment_watchlive")
public final class LiveGameMomentQuickCommentWatchliveSetting {
    public static final LiveGameMomentQuickCommentWatchliveSetting INSTANCE = new LiveGameMomentQuickCommentWatchliveSetting();
    public static final GameMomentWatchLiveConfig DEFAULT = new GameMomentWatchLiveConfig();

    public static final class GameMomentWatchLiveConfig {
        public static final TypeAdapter ADAPTER = new LiveGameMomentQuickCommentWatchliveSetting_GameMomentWatchLiveConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("ttlive_game_quick_commnet_landscape_adapter")
        public int gameQuickCommentLandscapeAdapter = 1;

        @C09CT("live_game_quick_comment_tray_duration_setting")
        public long gameQuickCommentTrayDuration = Mp4ScreenVideoLoadTimeout.CONTROL;

        @C09CT("live_game_comment_quick_comment_duration")
        public long gameMomentQuickCommentDuration = 10000;

        @C09CT("ttlive_landscape_access_layer_change")
        public boolean landscapeAccessLayerChange = true;
    }

    private final GameMomentWatchLiveConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameMomentWatchLiveConfig gameMomentWatchLiveConfig = DEFAULT;
        GameMomentWatchLiveConfig gameMomentWatchLiveConfig2 = (GameMomentWatchLiveConfig) settingsManager.getValueSafely("live_game_moment_quick_comment_watchlive", gameMomentWatchLiveConfig);
        return gameMomentWatchLiveConfig2 != null ? gameMomentWatchLiveConfig2 : gameMomentWatchLiveConfig;
    }

    public final long getCommentQuickCommentDuration() {
        return getValue().gameMomentQuickCommentDuration;
    }

    public final long getQuickCommentTrayDuration() {
        return getValue().gameQuickCommentTrayDuration;
    }

    public final boolean isLandscapeAccessLayerChange() {
        return getValue().landscapeAccessLayerChange;
    }

    public final boolean quiciCommentLandscapeEnable() {
        return getValue().gameQuickCommentLandscapeAdapter == 1;
    }
}
