package com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class SeriesBannerCustomizedInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("button_type")
    public final SeriesBottomBannerButtonType buttonType;

    @C09CT("is_limited_free")
    public final boolean isLimitedFree;

    @C09CT("is_schema_encoded")
    public final boolean isSchemaEncoded;

    @C09CT("next_episode_video_id")
    public final String nextEpisodeVideoId;

    @C09CT("video_type")
    public final SeriesVideoType videoType;

    public SeriesBannerCustomizedInfo() {
        this(false, SeriesBottomBannerButtonType.DEFAULT, null, false, null);
    }

    public final boolean isLimitedFree() {
        return this.isLimitedFree;
    }

    public final boolean isSchemaEncoded() {
        return this.isSchemaEncoded;
    }

    public SeriesBannerCustomizedInfo(boolean z, SeriesBottomBannerButtonType seriesBottomBannerButtonType, SeriesVideoType seriesVideoType, boolean z2, String str) {
        this.isSchemaEncoded = z;
        this.buttonType = seriesBottomBannerButtonType;
        this.videoType = seriesVideoType;
        this.isLimitedFree = z2;
        this.nextEpisodeVideoId = str;
    }
}
