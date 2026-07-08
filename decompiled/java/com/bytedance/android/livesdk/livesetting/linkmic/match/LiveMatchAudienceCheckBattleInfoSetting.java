package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("audience_battleinfo_delay_policy")
public final class LiveMatchAudienceCheckBattleInfoSetting {
    public static final LiveMatchAudienceCheckBattleInfoSetting INSTANCE = new LiveMatchAudienceCheckBattleInfoSetting();
    public static final CheckBattleInfoConfig DEFAULT = new CheckBattleInfoConfig(false, 1.5f, 1, 2, 2, 2);

    private final CheckBattleInfoConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CheckBattleInfoConfig checkBattleInfoConfig = DEFAULT;
        CheckBattleInfoConfig checkBattleInfoConfig2 = (CheckBattleInfoConfig) settingsManager.getValueSafely("audience_battleinfo_delay_policy", checkBattleInfoConfig);
        return checkBattleInfoConfig2 != null ? checkBattleInfoConfig2 : checkBattleInfoConfig;
    }

    public final int getEnterRetryCount() {
        return getConfig().retry_count_when_enter;
    }

    public final int getEnterRetryDuration() {
        return getConfig().retry_duration_when_enter;
    }

    public final int getFinishRetryCount() {
        return getConfig().retry_count_when_finish;
    }

    public final int getFinishRetryDuration() {
        return getConfig().retry_duration_when_finish;
    }

    public final boolean getSettlingCost() {
        return getConfig().avg_settling_cost;
    }

    public final float getSettlingMessageCost() {
        return getConfig().avg_settling_message_cost;
    }
}
