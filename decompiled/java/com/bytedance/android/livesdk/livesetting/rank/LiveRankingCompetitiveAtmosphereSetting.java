package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ranking_competitive_atmosphere_setting")
public final class LiveRankingCompetitiveAtmosphereSetting {
    public static final Config DEFAULT;
    public static final LiveRankingCompetitiveAtmosphereSetting INSTANCE = new LiveRankingCompetitiveAtmosphereSetting();
    public static Config value;

    static {
        Config config = new Config(false, true);
        DEFAULT = config;
        Config config2 = (Config) SettingsManager.INSTANCE.getValueSafely("live_ranking_competitive_atmosphere_setting", config);
        if (config2 != null) {
            config = config2;
        }
        value = config;
    }

    public final boolean getRankingEntrancePositionOpt() {
        Config config = value;
        return config.overallOpt && config.rankingEntrancePositionOpt;
    }

    public final boolean getValue() {
        return value.overallOpt;
    }

    public final boolean horizontalChainRegisterOpt() {
        return value.rankingEntrancePositionOpt;
    }

    public final void setValue(boolean z) {
        value.overallOpt = z;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveRankingCompetitiveAtmosphereSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("overall_opt")
        public boolean overallOpt;

        @C09CT("ranking_entrance_position_opt")
        public boolean rankingEntrancePositionOpt;

        public Config() {
            this(false, false);
        }

        public Config(boolean z, boolean z2) {
            this.overallOpt = z;
            this.rankingEntrancePositionOpt = z2;
        }
    }
}
