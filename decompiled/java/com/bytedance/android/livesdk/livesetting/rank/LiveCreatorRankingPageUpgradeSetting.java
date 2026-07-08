package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_creator_ranking_page_upgrade_setting")
public final class LiveCreatorRankingPageUpgradeSetting {
    public static final Config DEFAULT;
    public static final LiveCreatorRankingPageUpgradeSetting INSTANCE = new LiveCreatorRankingPageUpgradeSetting();
    public static Config value;

    static {
        Config config = new Config(true, C1697810uHb.LJIILJJIL(34));
        DEFAULT = config;
        Config config2 = (Config) SettingsManager.INSTANCE.getValueSafely("live_creator_ranking_page_upgrade_setting", config);
        if (config2 != null) {
            config = config2;
        }
        value = config;
    }

    public final boolean isUpgradeAvailable(int i) {
        Config config = value;
        if (config.overallOpt && config.availableRankTypeList.contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveCreatorRankingPageUpgradeSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("available_rank_type_list")
        public List<Integer> availableRankTypeList;

        @C09CT("overall_opt")
        public boolean overallOpt;

        public Config() {
            this(true, C1697810uHb.LJIILJJIL(34));
        }

        public Config(boolean z, List<Integer> list) {
            this.overallOpt = z;
            this.availableRankTypeList = list;
        }
    }
}
