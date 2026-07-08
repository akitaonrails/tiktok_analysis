package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_client_gift_celebration_cache_size")
public final class FansClubCelebrationCacheSizeSetting {
    public static final FansClubCelebrationCacheSizeSetting INSTANCE = new FansClubCelebrationCacheSizeSetting();
    public static final LiveFansEntranceSizeConfig DEFAULT = new LiveFansEntranceSizeConfig(70, 10);

    public final LiveFansEntranceSizeConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveFansEntranceSizeConfig liveFansEntranceSizeConfig = DEFAULT;
        LiveFansEntranceSizeConfig liveFansEntranceSizeConfig2 = (LiveFansEntranceSizeConfig) settingsManager.getValueSafely("live_client_gift_celebration_cache_size", liveFansEntranceSizeConfig);
        return liveFansEntranceSizeConfig2 != null ? liveFansEntranceSizeConfig2 : liveFansEntranceSizeConfig;
    }

    public static final class LiveFansEntranceSizeConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("save_recently_max_size")
        public int recentlyMaxSize;

        @C09CT("save_max_size")
        public int saveMaxSize;

        static {
            NormalGson.singleton();
            ADAPTER = new FansClubCelebrationCacheSizeSetting_LiveFansEntranceSizeConfig_OptTypeAdapter();
        }

        public LiveFansEntranceSizeConfig() {
            this(0, 0);
        }

        public LiveFansEntranceSizeConfig(int i, int i2) {
            this.saveMaxSize = i;
            this.recentlyMaxSize = i2;
        }
    }
}
