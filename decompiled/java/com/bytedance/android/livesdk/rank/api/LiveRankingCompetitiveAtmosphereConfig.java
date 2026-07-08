package com.bytedance.android.livesdk.rank.api;

import X.C09CT;
import X.C1697810uHb;
import X.EnumC1083210eIJ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ranking_competitive_atmosphere_config")
public final class LiveRankingCompetitiveAtmosphereConfig {
    public static final Config DEFAULT;
    public static final LiveRankingCompetitiveAtmosphereConfig INSTANCE = new LiveRankingCompetitiveAtmosphereConfig();

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveRankingCompetitiveAtmosphereConfig_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("ranking_settlement_countdown_config_list")
        public List<RankingCompetitiveAtmosphereConfig> rankingCompetitiveAtmosphereConfigList;

        public Config() {
            this(new ArrayList());
        }

        public Config(List<RankingCompetitiveAtmosphereConfig> list) {
            this.rankingCompetitiveAtmosphereConfigList = list;
        }
    }

    public static final class RankingCompetitiveAtmosphereConfig {
        public static final TypeAdapter ADAPTER = new LiveRankingCompetitiveAtmosphereConfig_RankingCompetitiveAtmosphereConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("highlight_opt")
        public boolean highlightOpt;

        @C09CT("rank_type")
        public int rankType;

        @C09CT("ranking_entrance_score_info_countdown")
        public int rankingEntranceActiveScoreInfoCountdown;

        @C09CT("ranking_entrance_active_update_opt")
        public boolean rankingEntranceActiveUpdateOpt;

        @C09CT("ranking_entrance_active_update_threshold")
        public int rankingEntranceActiveUpdateThreshold;

        @C09CT("ranking_entrance_highlight_countdown")
        public int rankingEntranceHighlightCountdown;

        @C09CT("ranking_entrance_highlight_threshold")
        public int rankingEntranceHighlightThreshold;

        @C09CT("ranking_entrance_score_info_opt")
        public boolean rankingEntranceScoreInfoOpt;

        @C09CT("ranking_entrance_score_info_threshold")
        public int rankingEntranceScoreInfoThreshold;

        @C09CT("scenario")
        public int scenario;

        public RankingCompetitiveAtmosphereConfig() {
            this(-1, EnumC1083210eIJ.RANKING_SETTLEMENT.getType(), false, -1, -1, false, -1, -1, false, -1);
        }

        public RankingCompetitiveAtmosphereConfig(int i, int i2, boolean z, int i3, int i4, boolean z2, int i5, int i6, boolean z3, int i7) {
            this.rankType = i;
            this.scenario = i2;
            this.highlightOpt = z;
            this.rankingEntranceHighlightCountdown = i3;
            this.rankingEntranceHighlightThreshold = i4;
            this.rankingEntranceScoreInfoOpt = z2;
            this.rankingEntranceActiveScoreInfoCountdown = i5;
            this.rankingEntranceScoreInfoThreshold = i6;
            this.rankingEntranceActiveUpdateOpt = z3;
            this.rankingEntranceActiveUpdateThreshold = i7;
        }
    }

    static {
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        RankTypeV2 rankTypeV22 = RankTypeV2.LJIIL;
        DEFAULT = new Config(C1697810uHb.LJIIJJI(new RankingCompetitiveAtmosphereConfig(rankTypeV22.type, EnumC1083210eIJ.RANKING_SETTLEMENT.getType(), true, 600, 99, true, 600, 199, true, 199), new RankingCompetitiveAtmosphereConfig(rankTypeV22.type, EnumC1083210eIJ.RANKING_MIDDAY_SPRINT_COUNTDOWN.getType(), false, 600, 99, true, 600, 199, true, 199)));
    }

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_ranking_competitive_atmosphere_config", config);
        return config2 != null ? config2 : config;
    }

    public final boolean needToActiveUpdateScoreInfo(int i, long j) {
        for (RankingCompetitiveAtmosphereConfig rankingCompetitiveAtmosphereConfig : getValue().rankingCompetitiveAtmosphereConfigList) {
            if (i == rankingCompetitiveAtmosphereConfig.rankType && rankingCompetitiveAtmosphereConfig.rankingEntranceActiveUpdateOpt && 1 <= j && j <= rankingCompetitiveAtmosphereConfig.rankingEntranceActiveUpdateThreshold) {
                return true;
            }
        }
        return false;
    }
}
