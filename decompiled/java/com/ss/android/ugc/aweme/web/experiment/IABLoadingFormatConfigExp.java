package com.ss.android.ugc.aweme.web.experiment;

import X.C09CT;
import X.C0C64;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes17.dex */
public final class IABLoadingFormatConfigExp {
    public static final boolean LIZ;
    public static final String LIZIZ;
    public static final float LIZJ;
    public static final String LIZLLL;
    public static final long LJ;
    public static final long LJFF;
    public static final int LJI;
    public static final boolean LJII;
    public static final boolean LJIIIIZZ;

    static {
        LoadingFormatModel loadingFormatModel = (LoadingFormatModel) C0C64.LJIILLIIL().LJJII(LoadingFormatModel.class, new LoadingFormatModel(false, null, 0.0f, null, null, 2L, false, true, 0), "iab_loading_format_config_android", true);
        if (loadingFormatModel == null) {
            loadingFormatModel = new LoadingFormatModel(false, null, 0.0f, null, null, 2L, false, true, 0);
        }
        LIZ = loadingFormatModel.enableIabLoadingFormat;
        LIZIZ = loadingFormatModel.channelName;
        LIZJ = loadingFormatModel.applyAboveSplitScreen;
        LIZLLL = loadingFormatModel.cdnCacheName;
        Long l = loadingFormatModel.cdnCacheSize;
        LJ = (l != null ? l.longValue() : 200L) * 1024;
        LJFF = loadingFormatModel.supplementPullTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        Integer num = loadingFormatModel.carouselSupplementPullIndex;
        LJI = num != null ? num.intValue() : 0;
        LJII = loadingFormatModel.lowScoreDeviceFetchGecko;
        LJIIIIZZ = loadingFormatModel.enableSendDataToLynxEndLayer;
    }

    public static final class LoadingFormatModel {

        @C09CT("apply_above_split_screen")
        public final float applyAboveSplitScreen;

        @C09CT("carousel_supplement_pull_index")
        public final Integer carouselSupplementPullIndex;

        @C09CT("cdn_cache_name")
        public final String cdnCacheName;

        @C09CT("cdn_cache_size")
        public final Long cdnCacheSize;

        @C09CT("channel_name")
        public final String channelName;

        @C09CT("enable_iab_loading_format")
        public final boolean enableIabLoadingFormat;

        @C09CT("enable_send_data_to_lynx_end_layer")
        public final boolean enableSendDataToLynxEndLayer;

        @C09CT("low_score_device_fetch_gecko")
        public final boolean lowScoreDeviceFetchGecko;

        @C09CT("supplement_pull_time")
        public final long supplementPullTime;

        public LoadingFormatModel() {
            this(false, null, 0.0f, null, null, 2L, false, true, 0);
        }

        public LoadingFormatModel(boolean z, String str, float f, String str2, Long l, long j, boolean z2, boolean z3, Integer num) {
            this.enableIabLoadingFormat = z;
            this.channelName = str;
            this.applyAboveSplitScreen = f;
            this.cdnCacheName = str2;
            this.cdnCacheSize = l;
            this.supplementPullTime = j;
            this.lowScoreDeviceFetchGecko = z2;
            this.enableSendDataToLynxEndLayer = z3;
            this.carouselSupplementPullIndex = num;
        }
    }
}
