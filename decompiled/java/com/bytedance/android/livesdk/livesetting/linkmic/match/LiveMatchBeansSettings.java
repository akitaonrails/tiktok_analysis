package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_catch_beans_config")
public final class LiveMatchBeansSettings {
    public static final LiveMatchBeansSettings INSTANCE = new LiveMatchBeansSettings();
    public static final LiveMatchBeansConfigData DEFAULT = new LiveMatchBeansConfigData(false, true, 2, 3, 3, 5, 1, 3, 10, 180, 0.2f, "7401143682998473217");

    private final LiveMatchBeansConfigData getConfig() {
        return (LiveMatchBeansConfigData) SettingsManager.INSTANCE.getValueSafely("live_catch_beans_config", DEFAULT);
    }

    public final long getAudienceWaitingFinalScoreMaxDurationInSecs() {
        LiveMatchBeansConfigData config = getConfig();
        if (config != null) {
            return config.sei_result_waiting_max_duration;
        }
        return 10L;
    }

    public final float getBgmVolume() {
        LiveMatchBeansConfigData config = getConfig();
        if (config != null) {
            return config.volume;
        }
        return 0.2f;
    }

    public final String getCatchBeansResourceID() {
        String str;
        LiveMatchBeansConfigData config = getConfig();
        return (config == null || (str = config.catch_beans_resource_id) == null) ? "" : str;
    }

    public final int getFinalScoreSendMaxCounts() {
        LiveMatchBeansConfigData config = getConfig();
        if (config != null) {
            return config.final_score_send_max_counts;
        }
        return 3;
    }

    public final long getGameDurationInSecs() {
        LiveMatchBeansConfigData config = getConfig();
        if (config != null) {
            return config.game_duration;
        }
        return 180L;
    }

    public final int getScoreSyncIntervalInSecs() {
        LiveMatchBeansConfigData config = getConfig();
        if (config != null) {
            return config.score_sync_period;
        }
        return 2;
    }

    public final int getSettlementDuration() {
        LiveMatchBeansConfigData config = getConfig();
        if (config != null) {
            return config.settlement_duration;
        }
        return 5;
    }

    public final int getUpdateScoreInSeiMaxRepeatTimes() {
        LiveMatchBeansConfigData config = getConfig();
        if (config != null) {
            return config.score_message_repeat_times;
        }
        return 3;
    }

    public final long getWaitingFinalScoreMaxDurationInSecs() {
        LiveMatchBeansConfigData config = getConfig();
        if (config != null) {
            return config.final_score_message_waiting_max_duration;
        }
        return 3L;
    }

    public final boolean isAnchorEnabled() {
        LiveMatchBeansConfigData config = getConfig();
        if (config != null) {
            return config.anchor_enabled;
        }
        return false;
    }

    public final boolean isAudienceEnabled() {
        LiveMatchBeansConfigData config = getConfig();
        if (config != null) {
            return config.audience_enabled;
        }
        return false;
    }
}
