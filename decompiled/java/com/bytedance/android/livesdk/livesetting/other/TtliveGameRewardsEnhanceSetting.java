package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_rewards_enhance_settings")
public final class TtliveGameRewardsEnhanceSetting {
    public static final TtliveGameRewardsEnhanceSetting INSTANCE = new TtliveGameRewardsEnhanceSetting();
    public static final GameRewardsEnhanceSetting DEFAULT = new GameRewardsEnhanceSetting(false, false, "", false);

    public final GameRewardsEnhanceSetting getValue() {
        return (GameRewardsEnhanceSetting) SettingsManager.INSTANCE.getValueSafely("ttlive_game_rewards_enhance_settings", DEFAULT);
    }

    public final String dropsStickerId() {
        String dropsStickerId;
        GameRewardsEnhanceSetting value = getValue();
        return (value == null || (dropsStickerId = value.getDropsStickerId()) == null) ? "" : dropsStickerId;
    }

    public final boolean dropsStickerLocalTextClosed() {
        GameRewardsEnhanceSetting value = getValue();
        return value != null && value.getDropsStickerLocalTextClosed();
    }

    public final boolean enablePinCard() {
        GameRewardsEnhanceSetting value = getValue();
        return value != null && value.getEnablePinCard();
    }

    public final boolean enableSticker() {
        GameRewardsEnhanceSetting value = getValue();
        return value != null && value.getEnableSticker();
    }
}
