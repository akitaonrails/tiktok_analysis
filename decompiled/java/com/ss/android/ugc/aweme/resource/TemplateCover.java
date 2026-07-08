package com.ss.android.ugc.aweme.resource;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TemplateCover {

    @C09CT("height")
    public final String height;

    @C09CT("large")
    public final String large;

    @C09CT("medium")
    public final String medium;

    @C09CT("png_large")
    public final String pngLarge;

    @C09CT("png_medium")
    public final String pngMedium;

    @C09CT("png_small")
    public final String pngSmall;

    @C09CT("small")
    public final String small;

    @C09CT("url")
    public final String url;

    @C09CT("width")
    public final String width;

    public TemplateCover() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public TemplateCover(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.large = str;
        this.medium = str2;
        this.small = str3;
        this.pngLarge = str4;
        this.pngMedium = str5;
        this.pngSmall = str6;
        this.url = str7;
        this.width = str8;
        this.height = str9;
    }
}
