package com.bytedance.android.livesdk.rank.api;

import X.C09CT;
import X.C1697810uHb;
import X.EnumC1083210eIJ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ranking_entrance_settlement_countdown_config")
public final class LiveRankingEntranceSettlementCountdownConfig {
    public static final Config DEFAULT;
    public static final LiveRankingEntranceSettlementCountdownConfig INSTANCE = new LiveRankingEntranceSettlementCountdownConfig();

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveRankingEntranceSettlementCountdownConfig_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("ranking_settlement_countdown_config_list")
        public List<RankingSettlementCountdownConfig> rankingSettlementCountdownConfigList;

        public Config() {
            this(new ArrayList());
        }

        public Config(List<RankingSettlementCountdownConfig> list) {
            this.rankingSettlementCountdownConfigList = list;
        }
    }

    static {
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        int i = RankTypeV2.LIZ.type;
        EnumC1083210eIJ enumC1083210eIJ = EnumC1083210eIJ.RANKING_SETTLEMENT;
        int type = enumC1083210eIJ.getType();
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(180);
        RankAnimationType rankAnimationType = RankAnimationType.LIZ;
        RankAnimationType rankAnimationType2 = RankAnimationType.LIZIZ;
        RankTypeV2 rankTypeV22 = RankTypeV2.LJIIL;
        DEFAULT = new Config(C1697810uHb.LJIIJJI(new RankingSettlementCountdownConfig(i, type, listLJIILJJIL, 5, rankAnimationType2.type, 0), new RankingSettlementCountdownConfig(RankTypeV2.LIZIZ.type, enumC1083210eIJ.getType(), C1697810uHb.LJIILJJIL(86400), 3, rankAnimationType2.type, 0), new RankingSettlementCountdownConfig(rankTypeV22.type, enumC1083210eIJ.getType(), C1697810uHb.LJIILJJIL(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), 600, 3600), 5, rankAnimationType2.type, 0), new RankingSettlementCountdownConfig(rankTypeV22.type, EnumC1083210eIJ.RANKING_MIDDAY_SPRINT_START.getType(), C1697810uHb.LJIILJJIL(7200), 5, rankAnimationType2.type, 0), new RankingSettlementCountdownConfig(rankTypeV22.type, EnumC1083210eIJ.RANKING_MIDDAY_SPRINT_COUNTDOWN.getType(), C1697810uHb.LJIILJJIL(600, 7200), 5, rankAnimationType2.type, 0), new RankingSettlementCountdownConfig(RankTypeV2.LJIILIIL.type, enumC1083210eIJ.getType(), C1697810uHb.LJIILJJIL(86400), 3, rankAnimationType2.type, 0), new RankingSettlementCountdownConfig(RankTypeV2.LJIILJJIL.type, enumC1083210eIJ.getType(), C1697810uHb.LJIILJJIL(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), 600, 3600), 5, rankAnimationType2.type, 0), new RankingSettlementCountdownConfig(RankTypeV2.LJJII.type, enumC1083210eIJ.getType(), C1697810uHb.LJIILJJIL(86400), 3, rankAnimationType2.type, 0), new RankingSettlementCountdownConfig(RankTypeV2.LJJIII.type, enumC1083210eIJ.getType(), C1697810uHb.LJIILJJIL(86400), 3, rankAnimationType2.type, 0), new RankingSettlementCountdownConfig(RankTypeV2.LJJIIJ.type, enumC1083210eIJ.getType(), C1697810uHb.LJIILJJIL(86400), 3, rankAnimationType2.type, 0), new RankingSettlementCountdownConfig(RankTypeV2.LIZLLL.type, enumC1083210eIJ.getType(), C1697810uHb.LJIILJJIL(3600, 86400), 3, rankAnimationType2.type, 0), new RankingSettlementCountdownConfig(RankTypeV2.LJII.type, enumC1083210eIJ.getType(), C1697810uHb.LJIILJJIL(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), 600, 3600), 5, rankAnimationType2.type, 0)));
    }

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_ranking_entrance_settlement_countdown_config", config);
        return config2 != null ? config2 : config;
    }

    public static final class RankingSettlementCountdownConfig {
        public static final TypeAdapter ADAPTER = new LiveRankingEntranceSettlementCountdownConfig_RankingSettlementCountdownConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("rank_animation_type")
        public int countdownAnimationType;

        @C09CT("rank_settlement_countdown_duration")
        public int rankSettlementCountdownDuration;

        @C09CT("rank_settlement_countdown_list")
        public List<Integer> rankSettlementCountdownList;

        @C09CT("rank_type")
        public int rankType;

        @C09CT("ranking_threshold")
        public int rankingThreshold;

        @C09CT("scenario")
        public int scenario;

        public RankingSettlementCountdownConfig() {
            this(0, 0, null, 0, 0, 0, 63, null);
        }

        public RankingSettlementCountdownConfig(int i, int i2, List<Integer> list, int i3, int i4, int i5) {
            this.rankType = i;
            this.scenario = i2;
            this.rankSettlementCountdownList = list;
            this.rankSettlementCountdownDuration = i3;
            this.countdownAnimationType = i4;
            this.rankingThreshold = i5;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RankingSettlementCountdownConfig(int i, int i2, List list, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            i = (i6 & 1) != 0 ? -1 : i;
            i2 = (i6 & 2) != 0 ? EnumC1083210eIJ.RANKING_SETTLEMENT.getType() : i2;
            list = (i6 & 4) != 0 ? new ArrayList() : list;
            i3 = (i6 & 8) != 0 ? 0 : i3;
            if ((i6 & 16) != 0) {
                RankAnimationType rankAnimationType = RankAnimationType.LIZ;
                i4 = RankAnimationType.LIZIZ.type;
            }
            this(i, i2, list, i3, i4, (i6 & 32) != 0 ? 0 : i5);
        }
    }
}
