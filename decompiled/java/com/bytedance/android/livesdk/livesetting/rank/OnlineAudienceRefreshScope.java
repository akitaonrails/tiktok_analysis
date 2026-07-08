package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("livesdk_room_user_count_refresh_scope")
public final class OnlineAudienceRefreshScope {
    public static final OnlineAudienceRefreshScope INSTANCE = new OnlineAudienceRefreshScope();
    public static final Config DEFAULT = new Config(10, 1);

    public static final class Config {
        public static final TypeAdapter ADAPTER;

        @C09CT("max")
        public long maxInterval;

        @C09CT("min")
        public long minInterval;

        static {
            NormalGson.singleton();
            ADAPTER = new OnlineAudienceRefreshScope_Config_OptTypeAdapter();
        }

        public Config() {
            this(5L, 1L);
        }

        public Config(long j, long j2) {
            this.maxInterval = j;
            this.minInterval = j2;
        }
    }

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("livesdk_room_user_count_refresh_scope", config);
        return config2 != null ? config2 : config;
    }
}
