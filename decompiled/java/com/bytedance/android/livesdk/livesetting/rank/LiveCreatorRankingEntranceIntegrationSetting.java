package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_creator_ranking_main_framework_upgrade_setting")
public final class LiveCreatorRankingEntranceIntegrationSetting {
    public static final Config DEFAULT;
    public static final LiveCreatorRankingEntranceIntegrationSetting INSTANCE = new LiveCreatorRankingEntranceIntegrationSetting();
    public static Config value;

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveCreatorRankingEntranceIntegrationSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("unified_entrance_opt")
        public boolean unifiedEntranceOpt;

        @C09CT("text_size_adapt")
        public boolean textAdapt = true;

        @C09CT("game_ranking_loop_rule_opt")
        public boolean gameRankingLoopRuleOpt = true;

        @C09CT("loop_interval_ms")
        public long loopIntervalMs = Mp4ScreenVideoLoadTimeout.CONTROL;

        @C09CT("perf_opt")
        public boolean perfOpt = true;

        @C09CT("cache_icon_res")
        public boolean perfIconCacheOpt = true;
    }

    static {
        Config config = new Config();
        DEFAULT = config;
        Config config2 = (Config) SettingsManager.INSTANCE.getValueSafely("live_creator_ranking_main_framework_upgrade_setting", config);
        if (config2 != null) {
            config = config2;
        }
        value = config;
    }

    public static final Config getValue() {
        return value;
    }
}
