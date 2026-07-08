package com.bytedance.android.livesdk.rank.api;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_rank_type_config")
public final class LiveRankTypeConfig {
    public static final Config DEFAULT;
    public static final LiveRankTypeConfig INSTANCE = new LiveRankTypeConfig();
    public static HashMap<Pair<Integer, Integer>, RankTypeV2> configValue;

    /* JADX INFO: loaded from: classes8.dex */
    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveRankTypeConfig_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("rank_types")
        public List<RankTypeV2> rankTypeList;

        public Config() {
            this(new ArrayList());
        }

        public Config(List<RankTypeV2> list) {
            this.rankTypeList = list;
        }
    }

    static {
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        DEFAULT = new Config(C1697810uHb.LJIIJJI(RankTypeV2.LIZ, RankTypeV2.LIZIZ, RankTypeV2.LIZJ, RankTypeV2.LIZLLL, RankTypeV2.LJII, RankTypeV2.LJ, RankTypeV2.LJFF, RankTypeV2.LJI, RankTypeV2.LJIIIIZZ, RankTypeV2.LJIIIZ, RankTypeV2.LJIIJ, RankTypeV2.LJIIJJI, RankTypeV2.LJIIL, RankTypeV2.LJIILIIL, RankTypeV2.LJIILJJIL, RankTypeV2.LJIILL, RankTypeV2.LJJ, RankTypeV2.LJJI, RankTypeV2.LJJIFFI, RankTypeV2.LJJII, RankTypeV2.LJJIII, RankTypeV2.LJJIIJ, RankTypeV2.LJIILLIIL, RankTypeV2.LJIIZILJ, RankTypeV2.LJIJ, RankTypeV2.LJIJI, RankTypeV2.LJIJJ, RankTypeV2.LJIJJLI, RankTypeV2.LJIL, RankTypeV2.LJJIIJZLJL, RankTypeV2.LJJIIZ, RankTypeV2.LJJIJ, RankTypeV2.LJJIIZI));
    }

    public final HashMap<Pair<Integer, Integer>, RankTypeV2> getValue() {
        HashMap<Pair<Integer, Integer>, RankTypeV2> map = configValue;
        if (map != null) {
            return map;
        }
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_rank_type_config", config);
        if (config2 == null) {
            config2 = config;
        }
        List<RankTypeV2> list = config2.rankTypeList;
        if (list.isEmpty()) {
            list = config.rankTypeList;
        }
        HashMap<Pair<Integer, Integer>, RankTypeV2> map2 = new HashMap<>();
        for (RankTypeV2 rankTypeV2 : list) {
            map2.put(new Pair<>(Integer.valueOf(rankTypeV2.type), Integer.valueOf(rankTypeV2.rankPhase)), rankTypeV2);
        }
        configValue = map2;
        return map2;
    }
}
