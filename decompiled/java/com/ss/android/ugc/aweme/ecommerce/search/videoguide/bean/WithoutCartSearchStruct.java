package com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class WithoutCartSearchStruct {

    @C09CT("extra_icon_base64")
    public final String extraIconBase64;

    @C09CT("extra_icon_rendered_height")
    public final Integer extraIconHeight;

    @C09CT("font_size")
    public final Float fontSize;

    @C09CT("component")
    public final PhotoSearchData photoSearchData;

    @C09CT("result_page")
    public final ResultPage resultPage;

    @C09CT("route_scene")
    public final Integer routeScene;

    @C09CT("schema")
    public final String schema;

    public WithoutCartSearchStruct(Float f, Integer num, String str, Integer num2, String str2, PhotoSearchData photoSearchData, ResultPage resultPage) {
        this.fontSize = f;
        this.extraIconHeight = num;
        this.extraIconBase64 = str;
        this.routeScene = num2;
        this.schema = str2;
        this.photoSearchData = photoSearchData;
        this.resultPage = resultPage;
    }
}
