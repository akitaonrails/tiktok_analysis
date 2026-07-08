package com.ss.android.ugc.aweme.pipo.hybrid.llm;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class LLMWebCollectRequest {

    @C09CT("app_id")
    public final String appId;

    @C09CT("app_version")
    public final String appVersion;

    @C09CT("device_brand")
    public final String deviceBrand;

    @C09CT("font_size")
    public final String fontSize;

    @C09CT("html")
    public final String html;

    @C09CT("platform")
    public final String platform;

    @C09CT("theme")
    public final String theme;

    @C09CT("url")
    public final String url;

    @C09CT("view_height")
    public final Integer viewHeight;

    @C09CT("view_width")
    public final Integer viewWidth;

    public LLMWebCollectRequest() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public LLMWebCollectRequest(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, String str7, String str8) {
        this.html = str;
        this.fontSize = str2;
        this.url = str3;
        this.viewWidth = num;
        this.viewHeight = num2;
        this.platform = str4;
        this.deviceBrand = str5;
        this.appId = str6;
        this.appVersion = str7;
        this.theme = str8;
    }
}
