package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes35.dex */
@SettingsKey("live_gift_video_player_perf_opt")
public final class LiveGiftVideoPlayerPerfOptSetting {
    public static final LiveGiftVideoRenderOptConfig DEFAULT;
    public static final LiveGiftVideoPlayerPerfOptSetting INSTANCE = new LiveGiftVideoPlayerPerfOptSetting();
    public static final LiveGiftVideoRenderOptConfig config;

    static {
        LiveGiftVideoRenderOptConfig liveGiftVideoRenderOptConfig = new LiveGiftVideoRenderOptConfig(false, false, false, false, false, false, false, false, 2, 5, 60, 30, 1, 1.5f, LSPassThroughRecordSizeConfig.DEFAULT, 10000, false);
        DEFAULT = liveGiftVideoRenderOptConfig;
        LiveGiftVideoRenderOptConfig liveGiftVideoRenderOptConfig2 = (LiveGiftVideoRenderOptConfig) SettingsManager.INSTANCE.getValueSafely(LiveGiftVideoPlayerPerfOptSetting.class);
        if (liveGiftVideoRenderOptConfig2 != null) {
            liveGiftVideoRenderOptConfig = liveGiftVideoRenderOptConfig2;
        }
        config = liveGiftVideoRenderOptConfig;
    }

    public final int configCacheSize() {
        return config.configCacheSize;
    }

    public final int configCacheTrimSize() {
        return config.configCacheTrimSize;
    }

    public final boolean isEnable() {
        return config.isEnable;
    }

    public final boolean isEnableConfig() {
        LiveGiftVideoRenderOptConfig liveGiftVideoRenderOptConfig = config;
        return liveGiftVideoRenderOptConfig.isEnable && liveGiftVideoRenderOptConfig.isEnableConfig;
    }

    public final boolean isEnableDownloadOpt() {
        LiveGiftVideoRenderOptConfig liveGiftVideoRenderOptConfig = config;
        return liveGiftVideoRenderOptConfig.isEnable && liveGiftVideoRenderOptConfig.isEnableDownloadOpt;
    }

    public final boolean isEnableMulti() {
        LiveGiftVideoRenderOptConfig liveGiftVideoRenderOptConfig = config;
        return liveGiftVideoRenderOptConfig.isEnable && liveGiftVideoRenderOptConfig.isEnableMultiOpt;
    }

    public final boolean isEnablePreloadConfig() {
        LiveGiftVideoRenderOptConfig liveGiftVideoRenderOptConfig = config;
        return liveGiftVideoRenderOptConfig.isEnable && liveGiftVideoRenderOptConfig.isEnablePreloadConfig;
    }

    public final boolean isEnablePreloadPlayer() {
        LiveGiftVideoRenderOptConfig liveGiftVideoRenderOptConfig = config;
        return liveGiftVideoRenderOptConfig.isEnable && liveGiftVideoRenderOptConfig.isEnablePreloadPlayer;
    }

    public final boolean isEnableReorder() {
        LiveGiftVideoRenderOptConfig liveGiftVideoRenderOptConfig = config;
        return liveGiftVideoRenderOptConfig.isEnable && liveGiftVideoRenderOptConfig.isEnableReorder;
    }

    public final boolean isEnableReplay() {
        LiveGiftVideoRenderOptConfig liveGiftVideoRenderOptConfig = config;
        return liveGiftVideoRenderOptConfig.isEnable && liveGiftVideoRenderOptConfig.isEnableReplay;
    }

    public final int playerAliveDuration() {
        return config.playerAliveDuration;
    }

    public final int playerCacheExpiredTime() {
        return config.playerCacheExpiredTime;
    }

    public final int playerCacheSize() {
        return config.playerCacheSize;
    }

    public final int playerPreloadDuration() {
        return config.playerPreloadDuration;
    }

    public final int playerPreloadSize() {
        return config.playerPreloadSize;
    }

    public final float playerPreloadThreshold() {
        return config.playerPreloadThreshold;
    }

    public final boolean useConcurrentMap() {
        return config.useConcurrentMap;
    }

    public final LiveGiftVideoRenderOptConfig getDEFAULT() {
        return DEFAULT;
    }

    public static final class LiveGiftVideoRenderOptConfig {
        public static final TypeAdapter ADAPTER = new LiveGiftVideoPlayerPerfOptSetting_LiveGiftVideoRenderOptConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("config_cache_size")
        public int configCacheSize;

        @C09CT("config_trim_size")
        public int configCacheTrimSize;

        @C09CT("is_enable")
        public boolean isEnable;

        @C09CT("is_config")
        public boolean isEnableConfig;

        @C09CT("is_download_opt")
        public boolean isEnableDownloadOpt;

        @C09CT("is_multi_opt")
        public boolean isEnableMultiOpt;

        @C09CT("is_preload_config")
        public boolean isEnablePreloadConfig;

        @C09CT("is_preload_player")
        public boolean isEnablePreloadPlayer;

        @C09CT("is_reorder")
        public boolean isEnableReorder;

        @C09CT("is_replay")
        public boolean isEnableReplay;

        @C09CT("player_alive_duration")
        public int playerAliveDuration;

        @C09CT("player_cache_expired_time")
        public int playerCacheExpiredTime;

        @C09CT("player_cache_size")
        public int playerCacheSize;

        @C09CT("player_preload_duration")
        public int playerPreloadDuration;

        @C09CT("player_preload_size")
        public int playerPreloadSize;

        @C09CT("player_preload_threshold")
        public float playerPreloadThreshold;

        @C09CT("use_concurrent_map")
        public boolean useConcurrentMap;

        public LiveGiftVideoRenderOptConfig() {
            this(false, false, false, false, false, false, false, false, 2, 5, 60, 30, 1, 1.5f, LSPassThroughRecordSizeConfig.DEFAULT, 10000, false);
        }

        public LiveGiftVideoRenderOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, int i2, int i3, int i4, int i5, float f, int i6, int i7, boolean z9) {
            this.isEnable = z;
            this.isEnableReplay = z2;
            this.isEnablePreloadConfig = z3;
            this.isEnablePreloadPlayer = z4;
            this.isEnableReorder = z5;
            this.isEnableMultiOpt = z6;
            this.isEnableConfig = z7;
            this.isEnableDownloadOpt = z8;
            this.playerCacheSize = i;
            this.playerCacheExpiredTime = i2;
            this.configCacheSize = i3;
            this.configCacheTrimSize = i4;
            this.playerPreloadSize = i5;
            this.playerPreloadThreshold = f;
            this.playerPreloadDuration = i6;
            this.playerAliveDuration = i7;
            this.useConcurrentMap = z9;
        }
    }
}
