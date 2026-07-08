package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "gamelive_bottombar_flow")
public final class GameliveBottombarFlowSetting {
    public static final GameLiveBottombarFlowConfig DEFAULT;
    public static final GameliveBottombarFlowSetting INSTANCE = new GameliveBottombarFlowSetting();
    public static boolean enableFlowPage;
    public static boolean enableFlowPageChoice;
    public static boolean enableGameLiveAutoPlay;
    public static boolean enableHeroLive;
    public static int fragmentCheckIntervalSecond;
    public static GameLiveBottombarFlowConfig plan;

    static {
        GameLiveBottombarFlowConfig gameLiveBottombarFlowConfig = new GameLiveBottombarFlowConfig(false, false, false, 180, true);
        DEFAULT = gameLiveBottombarFlowConfig;
        GameLiveBottombarFlowConfig gameLiveBottombarFlowConfig2 = (GameLiveBottombarFlowConfig) SettingsManager.INSTANCE.getValueSafely("gamelive_bottombar_flow", gameLiveBottombarFlowConfig);
        if (gameLiveBottombarFlowConfig2 != null) {
            gameLiveBottombarFlowConfig = gameLiveBottombarFlowConfig2;
        }
        plan = gameLiveBottombarFlowConfig;
        enableHeroLive = gameLiveBottombarFlowConfig.enableHeroLive;
        enableFlowPage = gameLiveBottombarFlowConfig.enableFlowPage;
        enableFlowPageChoice = gameLiveBottombarFlowConfig.enableFlowPageChoice;
        fragmentCheckIntervalSecond = gameLiveBottombarFlowConfig.fragmentCheckIntervalSecond;
        enableGameLiveAutoPlay = gameLiveBottombarFlowConfig.enableGameLiveAutoPlay;
    }

    public final GameLiveBottombarFlowConfig getDEFAULT() {
        return DEFAULT;
    }
}
