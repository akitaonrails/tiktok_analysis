package com.bytedance.android.livesdk.rank.api;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ranking_entrance_rise_and_fall_animation_config")
public final class LiveRankingEntranceRiseAndFallAnimationConfig {
    public static final Config DEFAULT;
    public static final LiveRankingEntranceRiseAndFallAnimationConfig INSTANCE = new LiveRankingEntranceRiseAndFallAnimationConfig();

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveRankingEntranceRiseAndFallAnimationConfig_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("ranking_rise_and_fall_config_list")
        public List<RankingRiseAndFallAnimationConfig> rankingRiseAndFallAnimationConfigList;

        public Config() {
            this(new ArrayList());
        }

        public Config(List<RankingRiseAndFallAnimationConfig> list) {
            this.rankingRiseAndFallAnimationConfigList = list;
        }
    }

    static {
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        DEFAULT = new Config(C1697810uHb.LJIIJJI(new RankingRiseAndFallAnimationConfig(RankTypeV2.LJIJJLI.type, C1697810uHb.LJIILJJIL(20, 10, 3, 1)), new RankingRiseAndFallAnimationConfig(RankTypeV2.LJIIL.type, C1697810uHb.LJIILJJIL(50, 20, 10, 3, 2, 1)), new RankingRiseAndFallAnimationConfig(RankTypeV2.LIZ.type, C1697810uHb.LJIILJJIL(50, 20, 10, 3, 2, 1))));
    }

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_ranking_entrance_rise_and_fall_animation_config", config);
        return config2 != null ? config2 : config;
    }

    public static final class RankingRiseAndFallAnimationConfig {
        public static final TypeAdapter ADAPTER = new LiveRankingEntranceRiseAndFallAnimationConfig_RankingRiseAndFallAnimationConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("rank_type")
        public int rankType;

        @C09CT("rise_animation_ranking_milestone_list")
        public List<Integer> riseAnimationRankingMilestoneList;

        public RankingRiseAndFallAnimationConfig() {
            this(-1, new ArrayList());
        }

        public RankingRiseAndFallAnimationConfig(int i, List<Integer> list) {
            this.rankType = i;
            this.riseAnimationRankingMilestoneList = list;
        }
    }
}
