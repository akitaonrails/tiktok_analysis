package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_popularity_ranking_perception_improvement_config")
public final class LivePopularityRankingPerceptionImprovementConfig {
    public static final LivePopularityRankingPerceptionImprovementConfig INSTANCE = new LivePopularityRankingPerceptionImprovementConfig();
    public static final Config DEFAULT = new Config(true, true, true, true, true, true, true, true);

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_popularity_ranking_perception_improvement_config", config);
        return config2 != null ? config2 : config;
    }

    /* JADX INFO: loaded from: classes28.dex */
    public static final class Config {
        public static final TypeAdapter ADAPTER = new LivePopularityRankingPerceptionImprovementConfig_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("bottom_bar_tag_icon_rtl_opt")
        public boolean bottomBarTagIconRTLOpt;

        @C09CT("bottom_bar_tag_opt")
        public boolean bottomBarTagOpt;

        @C09CT("education_panel_opt")
        public boolean educationPanelOpt;

        @C09CT("historical_achievement_notice_opt")
        public boolean historicalAchievementNoticeOpt;

        @C09CT("historical_achievement_sharing_page_opt")
        public boolean historicalAchievementSharingPageOpt;

        @C09CT("realtime_top_anim_opt")
        public boolean realtimeTopAnimOpt;

        @C09CT("rise_and_fall_anim_bg_color_opt")
        public boolean riseAndFallAnimBgColorOpt;

        @C09CT("spotlight_moment_notice_opt")
        public boolean spotlightMomentNoticeOpt;

        public Config() {
            this(true, true, true, true, true, true, true, true);
        }

        public Config(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
            this.educationPanelOpt = z;
            this.historicalAchievementNoticeOpt = z2;
            this.historicalAchievementSharingPageOpt = z3;
            this.bottomBarTagOpt = z4;
            this.bottomBarTagIconRTLOpt = z5;
            this.spotlightMomentNoticeOpt = z6;
            this.riseAndFallAnimBgColorOpt = z7;
            this.realtimeTopAnimOpt = z8;
        }
    }
}
