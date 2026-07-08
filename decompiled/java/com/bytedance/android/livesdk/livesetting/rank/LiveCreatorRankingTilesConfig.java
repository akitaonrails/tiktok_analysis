package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_creator_league_ranking_integration_with_tiles_config")
public final class LiveCreatorRankingTilesConfig {
    public static final Config DEFAULT;
    public static final LiveCreatorRankingTilesConfig INSTANCE = new LiveCreatorRankingTilesConfig();
    public static Config value;

    static {
        Config config = new Config(false, C1697810uHb.LJIILJJIL(16), "aweme://roma_redirect/?spark_page=ranking_tiles_redeem_popup");
        DEFAULT = config;
        Config config2 = (Config) SettingsManager.INSTANCE.getValueSafely("live_creator_league_ranking_integration_with_tiles_config", config);
        if (config2 != null) {
            config = config2;
        }
        value = config;
    }

    public final String getRankingTilesPageSchema() {
        return value.rankingTilesPageSchema;
    }

    public final boolean checkIfCreatorTilesAvailable(int i) {
        return value.availableRankTypeList.contains(Integer.valueOf(i));
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveCreatorRankingTilesConfig_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("available_rank_type_list")
        public List<Integer> availableRankTypeList;

        @C09CT("overall_opt")
        public boolean overallOpt;

        @C09CT("ranking_tiles_page_schema")
        public String rankingTilesPageSchema;

        public Config() {
            this(false, new ArrayList(), "");
        }

        public Config(boolean z, List<Integer> list, String str) {
            this.overallOpt = z;
            this.availableRankTypeList = list;
            this.rankingTilesPageSchema = str;
        }
    }
}
