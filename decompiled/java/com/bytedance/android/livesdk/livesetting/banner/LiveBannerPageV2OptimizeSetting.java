package com.bytedance.android.livesdk.livesetting.banner;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_banner_page_optimize")
public final class LiveBannerPageV2OptimizeSetting {
    public static final Config DEFAULT;
    public static final LiveBannerPageV2OptimizeSetting INSTANCE = new LiveBannerPageV2OptimizeSetting();
    public static final Config value;

    static {
        Config config = new Config(false, -1, false);
        DEFAULT = config;
        value = (Config) SettingsManager.INSTANCE.getValueSafely("live_banner_page_optimize", config);
    }

    public final int cacheSize() {
        Integer num;
        Config config = value;
        if (config == null || (num = config.cacheSize) == null) {
            return -1;
        }
        return num.intValue();
    }

    public final boolean enable() {
        Config config = value;
        return config != null && config.enable;
    }

    public final boolean enableExtraHeight() {
        Config config;
        return enable() && (config = value) != null && config.enableExtraHeight;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveBannerPageV2OptimizeSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("cache_size")
        public Integer cacheSize;

        @C09CT("enable")
        public boolean enable;

        @C09CT("enable_extra_height")
        public boolean enableExtraHeight;

        public Config() {
            this(false, -1, false);
        }

        public Config(boolean z, Integer num, boolean z2) {
            this.enable = z;
            this.cacheSize = num;
            this.enableExtraHeight = z2;
        }
    }
}
