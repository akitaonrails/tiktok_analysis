package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_popularity_ranking_bonus_time_config")
public final class LivePopularityRankingBonusTimeConfig {
    public static final LivePopularityRankingBonusTimeConfig INSTANCE = new LivePopularityRankingBonusTimeConfig();
    public static final Config DEFAULT = new Config(13651, 2, 15000, 3000, 2, "aweme://roma_redirect/?spark_page=anchor_ranking_gameplay&roma_group_key=spark_page_anchor_ranking_gameplay&roma_page_key=p&show_entrance=rank_sticker_set_show_page&always_show_mask=1", "aweme://roma_redirect/?roma_group_key=roma_schema_group_fans_level_main&roma_page_key=roma_schema_page_ranking_faq");

    public static final class Config {
        public static final TypeAdapter ADAPTER;

        @C09CT("fans_team_rank_faq")
        public String fansTeamRankFaq;

        @C09CT("gameplay_detail_page")
        public String gameplayDetailPage;

        @C09CT("gift_guide_bubble_display_delay_time")
        public long giftGuideBubbleDisplayDelayTimeMs;

        @C09CT("gift_guide_bubble_gift_locate_delay_time")
        public long giftGuideBubbleGiftLocateDelayTimeMs;

        @C09CT("gift_id")
        public long giftId;

        @C09CT("gift_point")
        public long giftPoint;

        @C09CT("point_multiple")
        public int pointMultiple;

        static {
            NormalGson.singleton();
            ADAPTER = new LivePopularityRankingBonusTimeConfig_Config_OptTypeAdapter();
        }

        public Config() {
            this(13651L, 2L, 15000L, 3000L, 2, "aweme://roma_redirect/?spark_page=anchor_ranking_gameplay&roma_group_key=spark_page_anchor_ranking_gameplay&roma_page_key=p&show_entrance=rank_sticker_set_show_page&always_show_mask=1", "aweme://roma_redirect/?roma_group_key=roma_schema_group_fans_level_main&roma_page_key=roma_schema_page_ranking_faq");
        }

        public Config(long j, long j2, long j3, long j4, int i, String str, String str2) {
            this.giftId = j;
            this.giftPoint = j2;
            this.giftGuideBubbleDisplayDelayTimeMs = j3;
            this.giftGuideBubbleGiftLocateDelayTimeMs = j4;
            this.pointMultiple = i;
            this.gameplayDetailPage = str;
            this.fansTeamRankFaq = str2;
        }
    }

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_popularity_ranking_bonus_time_config", config);
        return config2 != null ? config2 : config;
    }
}
