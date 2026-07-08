package com.bytedance.android.livesdk.rank.api;

import X.C09CT;
import X.C443120HZe;
import X.EnumC1154860g9s;
import X.EnumC1811400xEo;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.scene.Scene;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_ranking_icon_setting")
public final class RankingIconSetting {
    public static final RankingIconConfig[] DEFAULT;
    public static final RankingIconSetting INSTANCE = new RankingIconSetting();
    public static HashMap<C443120HZe<Integer, Integer, Integer>, Pair<String, String>> configValue;

    public static final class RankingIconConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("gecko_resource_channel_name")
        public String geckoResourceChannelName;

        @C09CT("gecko_resource_file_name")
        public String geckoResourceFileName;

        @C09CT("rank_group_type")
        public int rankGroupType;

        @C09CT("rank_type")
        public int rankType;

        @C09CT(Scene.SCENE_SERVICE)
        public int scene;

        static {
            NormalGson.singleton();
            ADAPTER = new RankingIconSetting_RankingIconConfig_OptTypeAdapter();
        }

        public RankingIconConfig() {
            this(-1, -1, -1, "", "");
        }

        public RankingIconConfig(int i, int i2, int i3, String str, String str2) {
            this.rankGroupType = i;
            this.rankType = i2;
            this.scene = i3;
            this.geckoResourceChannelName = str;
            this.geckoResourceFileName = str2;
        }
    }

    static {
        EnumC1811400xEo enumC1811400xEo = EnumC1811400xEo.E_COMMERCE;
        int type = enumC1811400xEo.getType();
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        RankTypeV2 rankTypeV22 = RankTypeV2.LJJIJIIJI;
        EnumC1811400xEo enumC1811400xEo2 = EnumC1811400xEo.GIFT_RANK;
        int type2 = enumC1811400xEo2.getType();
        int i = rankTypeV22.type;
        EnumC1154860g9s enumC1154860g9s = EnumC1154860g9s.LIST_FIRST_LEVEL_TAB;
        EnumC1811400xEo enumC1811400xEo3 = EnumC1811400xEo.GAME_RANK;
        int type3 = enumC1811400xEo2.getType();
        RankTypeV2 rankTypeV23 = RankTypeV2.LJIJJLI;
        int type4 = enumC1811400xEo2.getType();
        int i2 = rankTypeV22.type;
        EnumC1154860g9s enumC1154860g9s2 = EnumC1154860g9s.LIST_HISTORICAL_RANKING_ENTRANCE;
        DEFAULT = new RankingIconConfig[]{new RankingIconConfig(type, rankTypeV22.type, EnumC1154860g9s.ENTRANCE.getType(), "tiktok_live_revenue_demand_1", "ttlive_icon_ranking_entrance_ecommerce_ranking.png"), new RankingIconConfig(type2, i, enumC1154860g9s.getType(), "tiktok_live_revenue_normal_1", "ttlive_rank_tab_weekly_rank.png"), new RankingIconConfig(enumC1811400xEo3.getType(), rankTypeV22.type, enumC1154860g9s.getType(), "tiktok_live_revenue_demand_1", "ttlive_rank_tab_game_rank.png"), new RankingIconConfig(enumC1811400xEo.getType(), rankTypeV22.type, enumC1154860g9s.getType(), "tiktok_live_revenue_demand_1", "ttlive_rank_tab_ec_rank.png"), new RankingIconConfig(enumC1811400xEo2.getType(), RankTypeV2.LIZJ.type, enumC1154860g9s.getType(), "tiktok_live_revenue_demand_1", "ttlive_rank_tab_weekly_rookie_rank.png"), new RankingIconConfig(enumC1811400xEo2.getType(), RankTypeV2.LJIJJ.type, enumC1154860g9s.getType(), "tiktok_live_revenue_demand_1", "ttlive_rank_tab_weekly_rookie_rank.png"), new RankingIconConfig(type3, rankTypeV23.type, enumC1154860g9s.getType(), "tiktok_live_revenue_demand_1", "ttlive_icon_rank_tab_team_rank.png"), new RankingIconConfig(type4, i2, enumC1154860g9s2.getType(), "tiktok_live_revenue_demand_1", "ttlive_icon_last_rank.png"), new RankingIconConfig(enumC1811400xEo3.getType(), rankTypeV22.type, enumC1154860g9s2.getType(), "tiktok_live_revenue_demand_1", "ttlive_icon_game_last_rank.png"), new RankingIconConfig(enumC1811400xEo.getType(), rankTypeV22.type, enumC1154860g9s2.getType(), "tiktok_live_revenue_demand_1", "ttlive_icon_historical_ranking_entrance_ecommerce_ranking.png"), new RankingIconConfig(enumC1811400xEo2.getType(), rankTypeV23.type, enumC1154860g9s2.getType(), "tiktok_live_revenue_demand_1", "ttlive_icon_historical_team_rank.png"), new RankingIconConfig(enumC1811400xEo2.getType(), RankTypeV2.LJIL.type, enumC1154860g9s2.getType(), "tiktok_live_revenue_demand_1", "ttlive_icon_historical_ranking_entrance_creator_league_ranking.png")};
    }

    private final HashMap<C443120HZe<Integer, Integer, Integer>, Pair<String, String>> getConfigValue() {
        HashMap<C443120HZe<Integer, Integer, Integer>, Pair<String, String>> map = configValue;
        if (map != null) {
            return map;
        }
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RankingIconConfig[] rankingIconConfigArr = DEFAULT;
        RankingIconConfig[] rankingIconConfigArr2 = (RankingIconConfig[]) settingsManager.getValueSafely("live_ranking_icon_setting", rankingIconConfigArr);
        if (rankingIconConfigArr2 != null) {
            rankingIconConfigArr = rankingIconConfigArr2;
        }
        HashMap<C443120HZe<Integer, Integer, Integer>, Pair<String, String>> map2 = new HashMap<>();
        for (RankingIconConfig rankingIconConfig : rankingIconConfigArr) {
            map2.put(new C443120HZe<>(Integer.valueOf(rankingIconConfig.rankGroupType), Integer.valueOf(rankingIconConfig.rankType), Integer.valueOf(rankingIconConfig.scene)), new Pair<>(rankingIconConfig.geckoResourceChannelName, rankingIconConfig.geckoResourceFileName));
        }
        configValue = map2;
        return map2;
    }

    public final Pair<String, String> getIconGeckoResource(int i, int i2, int i3) {
        Pair<String, String> pair;
        HashMap<C443120HZe<Integer, Integer, Integer>, Pair<String, String>> configValue2 = getConfigValue();
        if (configValue2 != null && (pair = configValue2.get(new C443120HZe(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)))) != null) {
            return pair;
        }
        HashMap<C443120HZe<Integer, Integer, Integer>, Pair<String, String>> configValue3 = getConfigValue();
        if (configValue3 != null) {
            Integer numValueOf = Integer.valueOf(i);
            RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
            Pair<String, String> pair2 = configValue3.get(new C443120HZe(numValueOf, Integer.valueOf(RankTypeV2.LJJIJIIJI.type), Integer.valueOf(i3)));
            if (pair2 != null) {
                return pair2;
            }
            return null;
        }
        return null;
    }
}
