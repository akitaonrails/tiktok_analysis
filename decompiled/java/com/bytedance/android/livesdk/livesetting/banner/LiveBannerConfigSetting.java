package com.bytedance.android.livesdk.livesetting.banner;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "tiktok_live_banner_config")
public final class LiveBannerConfigSetting {
    public static final LiveBannerConfigSetting INSTANCE = new LiveBannerConfigSetting();
    public static final BannerConfig DEFAULT = new BannerConfig(Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 0, 0, 0, 0, 0);

    public static final class BannerConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("anchor_interval")
        public long anchorInterval;

        @C09CT("first_banner_interval_anchor")
        public long firstAnchorInterval;

        @C09CT("first_banner_interval")
        public long firstNormalInterVal;

        @C09CT("min_carousel_interval_anchor")
        public long minCarouselIntervalAnchor;

        @C09CT("normal_interval")
        public long normalInterval;

        @C09CT("total_carousel_interval_anchor")
        public long totalCarouselIntervalAnchor;

        @C09CT("total_new_carousel_count")
        public long totalNewCarouselCount;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveBannerConfigSetting_BannerConfig_OptTypeAdapter();
        }

        public BannerConfig() {
            this(Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 0L, 0L, 0L, 0L, 0L);
        }

        public BannerConfig(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.normalInterval = j;
            this.anchorInterval = j2;
            this.firstAnchorInterval = j3;
            this.firstNormalInterVal = j4;
            this.totalCarouselIntervalAnchor = j5;
            this.totalNewCarouselCount = j6;
            this.minCarouselIntervalAnchor = j7;
        }
    }

    public final BannerConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BannerConfig bannerConfig = DEFAULT;
        BannerConfig bannerConfig2 = (BannerConfig) settingsManager.getValueSafely("tiktok_live_banner_config", bannerConfig);
        return bannerConfig2 != null ? bannerConfig2 : bannerConfig;
    }
}
