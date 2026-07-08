package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_moment_quick_comment_broadcast")
public final class LiveGameMomentQuickCommentBroadcastSetting {
    public static final LiveGameMomentQuickCommentBroadcastSetting INSTANCE = new LiveGameMomentQuickCommentBroadcastSetting();
    public static final GameMomentBroadcastConfig DEFAULT = new GameMomentBroadcastConfig();

    public static final class GameMomentBroadcastConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("ttlive_game_moment_anchor_toast")
        public int gameMomentAnchorToast = 2;

        @C09CT("ttlive_game_moment_anchor_toast_icon")
        public int gameMomentAnchorToastIcon = 3;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveGameMomentQuickCommentBroadcastSetting_GameMomentBroadcastConfig_OptTypeAdapter();
        }
    }

    private final GameMomentBroadcastConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameMomentBroadcastConfig gameMomentBroadcastConfig = DEFAULT;
        GameMomentBroadcastConfig gameMomentBroadcastConfig2 = (GameMomentBroadcastConfig) settingsManager.getValueSafely("live_game_moment_quick_comment_broadcast", gameMomentBroadcastConfig);
        return gameMomentBroadcastConfig2 != null ? gameMomentBroadcastConfig2 : gameMomentBroadcastConfig;
    }

    public final int getLeftIconStyle() {
        return getValue().gameMomentAnchorToastIcon;
    }

    public final boolean pipToastEnable() {
        return getValue().gameMomentAnchorToast != 0;
    }

    public final boolean pipToastForQuickComment() {
        return getValue().gameMomentAnchorToast == 2;
    }
}
