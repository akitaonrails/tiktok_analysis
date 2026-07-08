package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public final class HighlightCellItem implements Serializable {
    public static final int $stable = 8;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("extra")
    public final HighLightExtra highLightExtra;

    @C09CT("product_cover_url")
    public final String productCover;

    @C09CT("product_title")
    public final String productTitle;

    @C09CT("tag")
    public final HighlightTag tag;

    @C09CT("video_info")
    public final HighlightVideoInfo videoInfo;

    public HighlightCellItem(String str, String str2, HighlightVideoInfo highlightVideoInfo, HighLightExtra highLightExtra, HighlightTag highlightTag, String str3) {
        this.productTitle = str;
        this.productCover = str2;
        this.videoInfo = highlightVideoInfo;
        this.highLightExtra = highLightExtra;
        this.tag = highlightTag;
        this.daInfo = str3;
    }
}
