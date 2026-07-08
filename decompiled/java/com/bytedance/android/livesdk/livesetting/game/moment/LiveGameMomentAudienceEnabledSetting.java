package com.bytedance.android.livesdk.livesetting.game.moment;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_moment_audience_enabled")
public final class LiveGameMomentAudienceEnabledSetting {
    public static final int DEFAULT = 1;
    public static final LiveGameMomentAudienceEnabledSetting INSTANCE = new LiveGameMomentAudienceEnabledSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_game_moment_audience_enabled", DEFAULT);
    }

    public final boolean enableClientAIMoment() {
        return getValue() == 1 && LiveGameClientaiMomentEnabledSetting.INSTANCE.getValue() == 1;
    }

    public final boolean enableCommentGiftGuide() {
        return getValue() == 1 && LiveGameMomentDetectionEnabledSetting.INSTANCE.getValue() == 1;
    }

    public final boolean enableGameMoment() {
        return getValue() == 1;
    }

    public final boolean enableSoundEffectMoment() {
        return getValue() == 1 && LiveGameSoundEffectAudienceEnabledSetting.INSTANCE.getValue() == 1;
    }
}
