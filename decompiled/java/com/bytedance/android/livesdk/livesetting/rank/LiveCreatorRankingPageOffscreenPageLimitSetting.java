package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_sub_game_ranking_setting")
public final class LiveCreatorRankingPageOffscreenPageLimitSetting {
    public static final LiveCreatorRankingPageOffscreenPageLimitSetting INSTANCE = new LiveCreatorRankingPageOffscreenPageLimitSetting();
    public static final Config DEFAULT = new Config(true, 3);

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_sub_game_ranking_setting", config);
        return config2 != null ? config2 : config;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveCreatorRankingPageOffscreenPageLimitSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("offscreen_page_limit_config")
        public int offscreenPageLimitConfig;

        @C09CT("offscreen_page_limit_opt")
        public boolean offscreenPageLimitOpt;

        public Config() {
            this(true, 3);
        }

        public Config(boolean z, int i) {
            this.offscreenPageLimitOpt = z;
            this.offscreenPageLimitConfig = i;
        }
    }
}
