package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_bottombar_mix_flow")
public final class GameLiveBottombarMixWaterfallFlowSetting {
    public static final GameLiveBottombarMixWaterfallFlowConfig DEFAULT;
    public static final GameLiveBottombarMixWaterfallFlowSetting INSTANCE = new GameLiveBottombarMixWaterfallFlowSetting();
    public static boolean autoPlay;
    public static GameLiveBottombarMixWaterfallFlowConfig config;
    public static int refreshInterval;

    static {
        GameLiveBottombarMixWaterfallFlowConfig gameLiveBottombarMixWaterfallFlowConfig = new GameLiveBottombarMixWaterfallFlowConfig(180, true);
        DEFAULT = gameLiveBottombarMixWaterfallFlowConfig;
        GameLiveBottombarMixWaterfallFlowConfig gameLiveBottombarMixWaterfallFlowConfig2 = (GameLiveBottombarMixWaterfallFlowConfig) SettingsManager.INSTANCE.getValueSafely(GameLiveBottombarMixWaterfallFlowSetting.class);
        if (gameLiveBottombarMixWaterfallFlowConfig2 != null) {
            gameLiveBottombarMixWaterfallFlowConfig = gameLiveBottombarMixWaterfallFlowConfig2;
        }
        config = gameLiveBottombarMixWaterfallFlowConfig;
        refreshInterval = gameLiveBottombarMixWaterfallFlowConfig.refreshInterval;
        autoPlay = gameLiveBottombarMixWaterfallFlowConfig.autoPlay;
    }

    public final GameLiveBottombarMixWaterfallFlowConfig getDEFAULT() {
        return DEFAULT;
    }
}
