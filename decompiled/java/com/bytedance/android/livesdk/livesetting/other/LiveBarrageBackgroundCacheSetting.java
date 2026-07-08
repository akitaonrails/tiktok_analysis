package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_barrage_background_cache_config")
public final class LiveBarrageBackgroundCacheSetting {
    public static final LiveBarrageBackgroundCacheSetting INSTANCE = new LiveBarrageBackgroundCacheSetting();
    public static final Config DEFAULT = new Config(10, false, false);

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveBarrageBackgroundCacheSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("live_barrage_background_cache_enable")
        public boolean enableCache;

        @C09CT("live_barrage_background_preload_enable")
        public boolean enablePreload;

        @C09CT("live_barrage_background_cache_length")
        public int length;

        public Config() {
            this(1024, false, false);
        }

        public Config(int i, boolean z, boolean z2) {
            this.length = i;
            this.enablePreload = z;
            this.enableCache = z2;
        }
    }

    public final Config getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_barrage_background_cache_config", config);
        return config2 != null ? config2 : config;
    }
}
