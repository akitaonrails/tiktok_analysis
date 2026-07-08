package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_ranking_gecko_drawable_loading_setting")
public final class LiveRankingGeckoDrawableLoadingSetting {
    public static final LiveRankingGeckoDrawableLoadingSetting INSTANCE = new LiveRankingGeckoDrawableLoadingSetting();
    public static final Config DEFAULT = new Config(true, true);

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_ranking_gecko_drawable_loading_setting", config);
        return config2 != null ? config2 : config;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveRankingGeckoDrawableLoadingSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("async_loading_opt")
        public boolean asyncLoadingOpt;

        @C09CT("handle_null_drawable_opt")
        public boolean handleNullDrawableOpt;

        public Config() {
            this(true, true);
        }

        public Config(boolean z, boolean z2) {
            this.asyncLoadingOpt = z;
            this.handleNullDrawableOpt = z2;
        }
    }
}
