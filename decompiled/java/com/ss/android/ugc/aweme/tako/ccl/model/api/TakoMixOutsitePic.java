package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoMixOutsitePic {

    @C09CT("favicon")
    public final String icon;

    @C09CT("base_info")
    public final BaseImage image;

    @C09CT("root_url")
    public final String rootUrl;

    @C09CT("title")
    public final String title;

    @C09CT("website_url")
    public final String webUrl;

    public TakoMixOutsitePic() {
        this(null, "", "", "", "");
    }

    public TakoMixOutsitePic(BaseImage baseImage, String str, String str2, String str3, String str4) {
        this.image = baseImage;
        this.title = str;
        this.icon = str2;
        this.webUrl = str3;
        this.rootUrl = str4;
    }
}
