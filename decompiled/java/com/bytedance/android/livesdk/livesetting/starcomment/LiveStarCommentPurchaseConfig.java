package com.bytedance.android.livesdk.livesetting.starcomment;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_star_comment_client_config")
public final class LiveStarCommentPurchaseConfig {
    public static final LiveStarCommentPurchaseConfig INSTANCE = new LiveStarCommentPurchaseConfig();
    public static final Config DEFAULT = new Config(2);

    public final Config getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_star_comment_client_config", config);
        return config2 != null ? config2 : config;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER;

        @C09CT("purchase_page_refresh_time")
        public int refreshTime;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveStarCommentPurchaseConfig_Config_OptTypeAdapter();
        }

        public Config() {
            this(2);
        }

        public Config(int i) {
            this.refreshTime = i;
        }
    }
}
