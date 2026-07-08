package com.ss.android.ugc.aweme.ogc.news.sticker.common;

import X.C01GW;
import X.C09CT;
import X.C1868990yjh;
import X.C452501pT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes29.dex */
public final class ArticleStickerSettingsConfig {
    public static final Config LIZ = new Config(86400000L, Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL), 1, 1, 1, 1);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1868990yjh());

    public static final class Config {

        @C09CT("enable_consuming")
        public Integer enableConsuming;

        @C09CT("enable_sticker_auto_resize")
        public Integer enableStickerAutoResize;

        @C09CT("enable_sticker_image_safe_rect")
        public Integer enableStickerImageSafeRect;

        @C09CT("enable_title_parse")
        public Integer enableTitleParse;

        @C09CT("config_cache_expire_time_ms")
        public Long expiredTimeMs;

        @C09CT("config_title_parse_timeout_time_ms")
        public Long titleParseTimeoutTimeMs;

        public Config() {
            this(86400000L, Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL), 1, 1, 1, 1);
        }

        public Config(Long l, Long l2, Integer num, Integer num2, Integer num3, Integer num4) {
            this.expiredTimeMs = l;
            this.titleParseTimeoutTimeMs = l2;
            this.enableConsuming = num;
            this.enableTitleParse = num2;
            this.enableStickerAutoResize = num3;
            this.enableStickerImageSafeRect = num4;
        }
    }

    public static Config LIZ() {
        return (Config) LIZIZ.getValue();
    }
}
