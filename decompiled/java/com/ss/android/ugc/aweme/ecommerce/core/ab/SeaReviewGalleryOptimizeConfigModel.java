package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaReviewGalleryOptimizeConfigModel {

    @C09CT("enable_review_secondary_page_lynx")
    public final Integer enableReviewSecondaryPageLynx;

    @C09CT("ui_optimize")
    public final Integer enableUiOptimize;

    @C09CT("gallery_position")
    public final Integer galleryPosition;

    @C09CT("impression_background_color")
    public final String impressionBackgroundColor;

    @C09CT("impression_background_dark_color")
    public final String impressionBackgroundDarkColor;

    @C09CT("impression_font_color")
    public final String impressionFontColor;

    @C09CT("impression_font_dark_color")
    public final String impressionFontDarkColor;

    @C09CT("lynx_schema")
    public final String lynxSchema;

    @C09CT("review_media_thumbnail_optimize")
    public final Integer reviewMediaThumbnailOptimize;

    @C09CT("server_params")
    public final n serverParams;

    public SeaReviewGalleryOptimizeConfigModel() {
        this(0, 0, 0, null, 0, null, null, null, null, null);
    }

    public SeaReviewGalleryOptimizeConfigModel(Integer num, Integer num2, Integer num3, String str, Integer num4, n nVar, String str2, String str3, String str4, String str5) {
        this.enableUiOptimize = num;
        this.reviewMediaThumbnailOptimize = num2;
        this.galleryPosition = num3;
        this.lynxSchema = str;
        this.enableReviewSecondaryPageLynx = num4;
        this.serverParams = nVar;
        this.impressionBackgroundColor = str2;
        this.impressionBackgroundDarkColor = str3;
        this.impressionFontColor = str4;
        this.impressionFontDarkColor = str5;
    }
}
