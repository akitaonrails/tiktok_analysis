package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_partnership_rewards_fyp")
public final class GameLiveGameRewardsFypSetting {
    public static final GameLiveGameRewardsFypSetting INSTANCE = new GameLiveGameRewardsFypSetting();
    public static final GameRewardsFypSetting DEFAULT = new GameRewardsFypSetting(false, 10000, 3000, false);

    public final GameRewardsFypSetting getConfig() {
        GameRewardsFypSetting gameRewardsFypSetting = (GameRewardsFypSetting) SettingsManager.INSTANCE.getValueSafely(GameLiveGameRewardsFypSetting.class);
        return gameRewardsFypSetting == null ? DEFAULT : gameRewardsFypSetting;
    }
}
