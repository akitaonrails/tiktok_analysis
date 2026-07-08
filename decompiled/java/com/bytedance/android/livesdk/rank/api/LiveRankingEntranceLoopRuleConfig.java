package com.bytedance.android.livesdk.rank.api;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import X.C20441214yg;
import X.C2188811AlT;
import X.EnumC1083200eII;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ranking_entrance_loop_rule_config")
public final class LiveRankingEntranceLoopRuleConfig {
    public static final List<LoopRuleConfig> DEFAULT;
    public static final LiveRankingEntranceLoopRuleConfig INSTANCE = new LiveRankingEntranceLoopRuleConfig();
    public static HashMap<Integer, HashMap<Integer, List<Integer>>> loopIntervalConfig;
    public static HashMap<Integer, HashMap<Integer, Integer>> loopOffsetConfig;
    public static HashMap<Integer, HashMap<Integer, Integer>> loopPriorityConfig;

    public static final class LoopRuleConfig {
        public static final TypeAdapter ADAPTER = new LiveRankingEntranceLoopRuleConfig_LoopRuleConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("loop_rule_type")
        public int loopRuleType;

        @C09CT("mandatory_ranking_type_list")
        public List<Integer> mandatoryRankingTypeList;

        @C09CT("ranking_interval_config_list")
        public List<RankingLoopIntervalConfig> rankingIntervalConfigList;

        @C09CT("ranking_priority_list")
        public List<RankingLoopPriorityConfig> rankingLoopPriorityList;

        @C09CT("ranking_offset_list")
        public List<RankingLoopOffsetConfig> rankingOffsetList;

        public LoopRuleConfig() {
            this(-1, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
        }

        public LoopRuleConfig(int i, List<Integer> list, List<RankingLoopPriorityConfig> list2, List<RankingLoopIntervalConfig> list3, List<RankingLoopOffsetConfig> list4) {
            this.loopRuleType = i;
            this.mandatoryRankingTypeList = list;
            this.rankingLoopPriorityList = list2;
            this.rankingIntervalConfigList = list3;
            this.rankingOffsetList = list4;
        }
    }

    public final boolean checkIfRankingWeightIsValid(int i) {
        return i != Integer.MAX_VALUE;
    }

    static {
        int type = EnumC1083200eII.DEFAULT.getType();
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        RankTypeV2 rankTypeV22 = RankTypeV2.LJJIIJZLJL;
        RankTypeV2 rankTypeV23 = RankTypeV2.LJIILIIL;
        RankTypeV2 rankTypeV24 = RankTypeV2.LJIILJJIL;
        RankTypeV2 rankTypeV25 = RankTypeV2.LIZLLL;
        RankTypeV2 rankTypeV26 = RankTypeV2.LJII;
        List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(rankTypeV22.type), Integer.valueOf(rankTypeV23.type), Integer.valueOf(rankTypeV24.type), Integer.valueOf(rankTypeV25.type), Integer.valueOf(rankTypeV26.type));
        RankTypeV2 rankTypeV27 = RankTypeV2.LJIILLIIL;
        RankTypeV2 rankTypeV28 = RankTypeV2.LJIILL;
        RankTypeV2 rankTypeV29 = RankTypeV2.LIZ;
        RankTypeV2 rankTypeV210 = RankTypeV2.LIZIZ;
        RankTypeV2 rankTypeV211 = RankTypeV2.LJIIL;
        RankTypeV2 rankTypeV212 = RankTypeV2.LJIJJLI;
        RankTypeV2 rankTypeV213 = RankTypeV2.LJJII;
        RankTypeV2 rankTypeV214 = RankTypeV2.LJJIII;
        RankTypeV2 rankTypeV215 = RankTypeV2.LJJIIJ;
        RankTypeV2 rankTypeV216 = RankTypeV2.LJ;
        RankTypeV2 rankTypeV217 = RankTypeV2.LJFF;
        RankTypeV2 rankTypeV218 = RankTypeV2.LJI;
        RankTypeV2 rankTypeV219 = RankTypeV2.LJIIIIZZ;
        RankTypeV2 rankTypeV220 = RankTypeV2.LJIIIZ;
        RankTypeV2 rankTypeV221 = RankTypeV2.LJIIJ;
        RankTypeV2 rankTypeV222 = RankTypeV2.LJIIJJI;
        RankTypeV2 rankTypeV223 = RankTypeV2.LJIL;
        RankTypeV2 rankTypeV224 = RankTypeV2.LJJIIZ;
        DEFAULT = C1697810uHb.LJIIJJI(new LoopRuleConfig(type, listLJIIJJI, C1697810uHb.LJIIJJI(new RankingLoopPriorityConfig(rankTypeV27.type, 100), new RankingLoopPriorityConfig(rankTypeV28.type, 150), new RankingLoopPriorityConfig(rankTypeV23.type, 160), new RankingLoopPriorityConfig(rankTypeV24.type, 160), new RankingLoopPriorityConfig(rankTypeV25.type, 160), new RankingLoopPriorityConfig(rankTypeV26.type, 160), new RankingLoopPriorityConfig(rankTypeV29.type, 180), new RankingLoopPriorityConfig(rankTypeV210.type, 180), new RankingLoopPriorityConfig(rankTypeV211.type, 180), new RankingLoopPriorityConfig(rankTypeV212.type, 220), new RankingLoopPriorityConfig(rankTypeV213.type, 230), new RankingLoopPriorityConfig(rankTypeV214.type, 230), new RankingLoopPriorityConfig(rankTypeV215.type, 230), new RankingLoopPriorityConfig(rankTypeV216.type, 230), new RankingLoopPriorityConfig(rankTypeV217.type, 230), new RankingLoopPriorityConfig(rankTypeV218.type, 230), new RankingLoopPriorityConfig(rankTypeV219.type, 230), new RankingLoopPriorityConfig(rankTypeV220.type, 230), new RankingLoopPriorityConfig(rankTypeV221.type, 230), new RankingLoopPriorityConfig(rankTypeV222.type, 230), new RankingLoopPriorityConfig(rankTypeV223.type, 255), new RankingLoopPriorityConfig(rankTypeV224.type, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)), C1697810uHb.LJIIJJI(new RankingLoopIntervalConfig(rankTypeV29.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV210.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV211.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV212.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV223.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV224.type, C1697810uHb.LJIIJJI(0, 0, 99)), new RankingLoopIntervalConfig(rankTypeV23.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV24.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV213.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV214.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV215.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV25.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV26.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV216.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV217.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV218.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV219.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV220.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV221.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV222.type, C1697810uHb.LJIIJJI(20, 40, 99))), Collections.singletonList(new RankingLoopOffsetConfig(rankTypeV223.type, 20))), new LoopRuleConfig(EnumC1083200eII.UNIFIED_ENTRANCE.getType(), C1697810uHb.LJIIJJI(Integer.valueOf(rankTypeV22.type), Integer.valueOf(rankTypeV23.type), Integer.valueOf(rankTypeV24.type), Integer.valueOf(rankTypeV25.type), Integer.valueOf(rankTypeV26.type)), C1697810uHb.LJIIJJI(new RankingLoopPriorityConfig(rankTypeV27.type, 100), new RankingLoopPriorityConfig(rankTypeV28.type, 150), new RankingLoopPriorityConfig(rankTypeV23.type, 160), new RankingLoopPriorityConfig(rankTypeV24.type, 160), new RankingLoopPriorityConfig(rankTypeV25.type, 160), new RankingLoopPriorityConfig(rankTypeV26.type, 160), new RankingLoopPriorityConfig(rankTypeV29.type, 180), new RankingLoopPriorityConfig(rankTypeV210.type, 180), new RankingLoopPriorityConfig(rankTypeV211.type, 180), new RankingLoopPriorityConfig(rankTypeV212.type, 220), new RankingLoopPriorityConfig(rankTypeV213.type, 230), new RankingLoopPriorityConfig(rankTypeV214.type, 230), new RankingLoopPriorityConfig(rankTypeV215.type, 230), new RankingLoopPriorityConfig(rankTypeV216.type, 230), new RankingLoopPriorityConfig(rankTypeV217.type, 230), new RankingLoopPriorityConfig(rankTypeV218.type, 230), new RankingLoopPriorityConfig(rankTypeV219.type, 230), new RankingLoopPriorityConfig(rankTypeV220.type, 230), new RankingLoopPriorityConfig(rankTypeV221.type, 230), new RankingLoopPriorityConfig(rankTypeV222.type, 230), new RankingLoopPriorityConfig(rankTypeV223.type, 255), new RankingLoopPriorityConfig(rankTypeV224.type, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)), C1697810uHb.LJIIJJI(new RankingLoopIntervalConfig(rankTypeV29.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV210.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV211.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV212.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV223.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV224.type, C1697810uHb.LJIIJJI(0, 0, 99)), new RankingLoopIntervalConfig(rankTypeV23.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV24.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV213.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV214.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV215.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV25.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV26.type, C1697810uHb.LJIIJJI(40, 99, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), new RankingLoopIntervalConfig(rankTypeV216.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV217.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV218.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV219.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV220.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV221.type, C1697810uHb.LJIIJJI(20, 40, 99)), new RankingLoopIntervalConfig(rankTypeV222.type, C1697810uHb.LJIIJJI(20, 40, 99))), Collections.singletonList(new RankingLoopOffsetConfig(rankTypeV223.type, 20))));
    }

    private final HashMap<Integer, HashMap<Integer, List<Integer>>> getLoopIntervalConfig() {
        HashMap<Integer, HashMap<Integer, List<Integer>>> map = loopIntervalConfig;
        if (map != null) {
            return map;
        }
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<LoopRuleConfig> list = DEFAULT;
        List<LoopRuleConfig> list2 = (List) settingsManager.getValueSafely("live_ranking_entrance_loop_rule_config", list);
        if (list2 != null) {
            list = list2;
        }
        HashMap<Integer, HashMap<Integer, List<Integer>>> map2 = new HashMap<>();
        for (LoopRuleConfig loopRuleConfig : list) {
            HashMap<Integer, List<Integer>> map3 = new HashMap<>();
            for (RankingLoopIntervalConfig rankingLoopIntervalConfig : loopRuleConfig.rankingIntervalConfigList) {
                map3.put(Integer.valueOf(rankingLoopIntervalConfig.rankType), rankingLoopIntervalConfig.nodeList);
            }
            map2.put(Integer.valueOf(loopRuleConfig.loopRuleType), map3);
        }
        loopIntervalConfig = map2;
        return map2;
    }

    private final HashMap<Integer, HashMap<Integer, Integer>> getLoopOffsetConfig() {
        HashMap<Integer, HashMap<Integer, Integer>> map = loopOffsetConfig;
        if (map != null) {
            return map;
        }
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<LoopRuleConfig> list = DEFAULT;
        List<LoopRuleConfig> list2 = (List) settingsManager.getValueSafely("live_ranking_entrance_loop_rule_config", list);
        if (list2 != null) {
            list = list2;
        }
        HashMap<Integer, HashMap<Integer, Integer>> map2 = new HashMap<>();
        for (LoopRuleConfig loopRuleConfig : list) {
            HashMap<Integer, Integer> map3 = new HashMap<>();
            for (RankingLoopOffsetConfig rankingLoopOffsetConfig : loopRuleConfig.rankingOffsetList) {
                map3.put(Integer.valueOf(rankingLoopOffsetConfig.rankType), Integer.valueOf(rankingLoopOffsetConfig.offset));
            }
            map2.put(Integer.valueOf(loopRuleConfig.loopRuleType), map3);
        }
        loopOffsetConfig = map2;
        return map2;
    }

    private final HashMap<Integer, HashMap<Integer, Integer>> getLoopPriorityConfig() {
        HashMap<Integer, HashMap<Integer, Integer>> map = loopPriorityConfig;
        if (map != null) {
            return map;
        }
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<LoopRuleConfig> list = DEFAULT;
        List<LoopRuleConfig> list2 = (List) settingsManager.getValueSafely("live_ranking_entrance_loop_rule_config", list);
        if (list2 != null) {
            list = list2;
        }
        HashMap<Integer, HashMap<Integer, Integer>> map2 = new HashMap<>();
        for (LoopRuleConfig loopRuleConfig : list) {
            HashMap<Integer, Integer> map3 = new HashMap<>();
            for (RankingLoopPriorityConfig rankingLoopPriorityConfig : loopRuleConfig.rankingLoopPriorityList) {
                map3.put(Integer.valueOf(rankingLoopPriorityConfig.rankType), Integer.valueOf(rankingLoopPriorityConfig.priority));
            }
            map2.put(Integer.valueOf(loopRuleConfig.loopRuleType), map3);
        }
        loopPriorityConfig = map2;
        return map2;
    }

    private final HashMap<Integer, List<Integer>> getMandatoryRankingTypeConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<LoopRuleConfig> list = DEFAULT;
        List<LoopRuleConfig> list2 = (List) settingsManager.getValueSafely("live_ranking_entrance_loop_rule_config", list);
        if (list2 != null) {
            list = list2;
        }
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (LoopRuleConfig loopRuleConfig : list) {
            map.put(Integer.valueOf(loopRuleConfig.loopRuleType), loopRuleConfig.mandatoryRankingTypeList);
        }
        return map;
    }

    public final List<Integer> getMandatoryRankingTypeList(EnumC1083200eII enumC1083200eII) {
        List<Integer> list;
        HashMap<Integer, List<Integer>> mandatoryRankingTypeConfig = getMandatoryRankingTypeConfig();
        if (mandatoryRankingTypeConfig == null || (list = mandatoryRankingTypeConfig.get(Integer.valueOf(enumC1083200eII.getType()))) == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    public static final class RankingLoopIntervalConfig {
        public static final TypeAdapter ADAPTER = new LiveRankingEntranceLoopRuleConfig_RankingLoopIntervalConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("node_list")
        public List<Integer> nodeList;

        @C09CT("rank_type")
        public int rankType;

        public RankingLoopIntervalConfig() {
            this(-1, new ArrayList());
        }

        public RankingLoopIntervalConfig(int i, List<Integer> list) {
            this.rankType = i;
            this.nodeList = list;
        }
    }

    public static final class RankingLoopOffsetConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("offset")
        public int offset;

        @C09CT("rank_type")
        public int rankType;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveRankingEntranceLoopRuleConfig_RankingLoopOffsetConfig_OptTypeAdapter();
        }

        public RankingLoopOffsetConfig() {
            this(-1, 0);
        }

        public RankingLoopOffsetConfig(int i, int i2) {
            this.rankType = i;
            this.offset = i2;
        }
    }

    public static final class RankingLoopPriorityConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("priority")
        public int priority;

        @C09CT("rank_type")
        public int rankType;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveRankingEntranceLoopRuleConfig_RankingLoopPriorityConfig_OptTypeAdapter();
        }

        public RankingLoopPriorityConfig() {
            this(-1, Integer.MAX_VALUE);
        }

        public RankingLoopPriorityConfig(int i, int i2) {
            this.rankType = i;
            this.priority = i2;
        }
    }

    private final int getRankingPriority(EnumC1083200eII enumC1083200eII, int i) {
        HashMap<Integer, Integer> map;
        Integer num;
        HashMap<Integer, HashMap<Integer, Integer>> loopPriorityConfig2 = getLoopPriorityConfig();
        if (loopPriorityConfig2 != null && (map = loopPriorityConfig2.get(Integer.valueOf(enumC1083200eII.getType()))) != null && (num = map.get(Integer.valueOf(i))) != null) {
            return num.intValue();
        }
        return 999;
    }

    private final int getRankingIndexPriority(EnumC1083200eII enumC1083200eII, int i, long j) {
        int iIntValue;
        HashMap<Integer, Integer> map;
        Integer num;
        if (j <= 0) {
            return 999;
        }
        HashMap<Integer, HashMap<Integer, Integer>> loopOffsetConfig2 = getLoopOffsetConfig();
        if (loopOffsetConfig2 != null && (map = loopOffsetConfig2.get(Integer.valueOf(enumC1083200eII.getType()))) != null && (num = map.get(Integer.valueOf(i))) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return iIntValue + ((int) j);
    }

    private final int getRankingIntervalPriority(EnumC1083200eII enumC1083200eII, int i, long j) {
        HashMap<Integer, List<Integer>> map;
        List<Integer> list;
        HashMap<Integer, HashMap<Integer, List<Integer>>> loopIntervalConfig2 = getLoopIntervalConfig();
        if (loopIntervalConfig2 != null && (map = loopIntervalConfig2.get(Integer.valueOf(enumC1083200eII.getType()))) != null && (list = map.get(Integer.valueOf(i))) != null) {
            int i2 = 0;
            for (Integer num : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    int iIntValue = num.intValue();
                    if (1 <= j && j <= iIntValue) {
                        return i3;
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return 9;
    }

    public final int getRankingWeight(EnumC1083200eII enumC1083200eII, int i, long j) {
        int rankingPriority = getRankingPriority(enumC1083200eII, i);
        int rankingIndexPriority = getRankingIndexPriority(enumC1083200eII, i, j);
        int rankingIntervalPriority = getRankingIntervalPriority(enumC1083200eII, i, j);
        C20441214yg.LIZIZ("Ranking Entrance Unification", "getRankingWeight");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1083200eII);
        sbLIZ.append(" - ");
        sbLIZ.append(i);
        sbLIZ.append(" - ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(rankingPriority);
        sbLIZ2.append(" - ");
        sbLIZ2.append(rankingIndexPriority);
        sbLIZ2.append(" - ");
        sbLIZ2.append(rankingIntervalPriority);
        C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ2));
        if (rankingIntervalPriority == 9) {
            return Integer.MAX_VALUE;
        }
        return rankingPriority + (rankingIndexPriority * LSPassThroughRecordSizeConfig.DEFAULT) + (rankingIntervalPriority * LSPassThroughRecordSizeConfig.DEFAULT * LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
