package com.ss.android.ugc.aweme.series.feed.model;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesCenterBannerConfig {

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("sub_title_inner_color")
    public final String subTitleInnerColor;

    @C09CT("sub_title_outer_color")
    public final String subTitleOuterColor;

    @C09CT("title")
    public final String title;

    public SeriesCenterBannerConfig(String str, String str2, String str3, String str4, String str5) {
        this.imageUrl = str;
        this.title = str2;
        this.subTitle = str3;
        this.subTitleOuterColor = str4;
        this.subTitleInnerColor = str5;
    }
}
