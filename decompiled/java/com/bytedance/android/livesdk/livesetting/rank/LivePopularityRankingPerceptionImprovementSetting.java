package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("team_rank_perception")
public final class LivePopularityRankingPerceptionImprovementSetting {
    public static boolean isCreator;
    public static final LivePopularityRankingPerceptionImprovementSetting INSTANCE = new LivePopularityRankingPerceptionImprovementSetting();
    public static final int DEFAULT = 0;
    public static int value = SettingsManager.INSTANCE.getIntValue("team_rank_perception", DEFAULT);

    public final boolean getValue() {
        int i = value;
        if (i != 0) {
            return isCreator || i == 2;
        }
        return false;
    }

    public final boolean bottomBarTagIconRTLOpt() {
        return getValue() && LivePopularityRankingPerceptionImprovementConfig.INSTANCE.getValue().bottomBarTagIconRTLOpt;
    }

    public final boolean bottomBarTagOpt() {
        return getValue() && LivePopularityRankingPerceptionImprovementConfig.INSTANCE.getValue().bottomBarTagOpt;
    }

    public final boolean educationPanelOpt() {
        return getValue() && LivePopularityRankingPerceptionImprovementConfig.INSTANCE.getValue().educationPanelOpt;
    }

    public final boolean historicalAchievementNoticeOpt() {
        return getValue() && LivePopularityRankingPerceptionImprovementConfig.INSTANCE.getValue().historicalAchievementNoticeOpt;
    }

    public final boolean historicalAchievementSharingPageOpt() {
        return getValue() && LivePopularityRankingPerceptionImprovementConfig.INSTANCE.getValue().historicalAchievementSharingPageOpt;
    }

    public final boolean realtimeTopAnimOpt() {
        return getValue() && LivePopularityRankingPerceptionImprovementConfig.INSTANCE.getValue().realtimeTopAnimOpt;
    }

    public final boolean riseAndFallAnimBgColorOpt() {
        return getValue() && LivePopularityRankingPerceptionImprovementConfig.INSTANCE.getValue().riseAndFallAnimBgColorOpt;
    }

    public final boolean spotlightMomentNoticeOpt() {
        return getValue() && LivePopularityRankingPerceptionImprovementConfig.INSTANCE.getValue().spotlightMomentNoticeOpt;
    }

    public final boolean isCreator() {
        return isCreator;
    }

    public final void setCreator(boolean z) {
        isCreator = z;
    }
}
