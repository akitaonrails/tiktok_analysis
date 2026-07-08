package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class CreativeTemplateAsset {

    @C09CT("height")
    public final int height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url")
    public final String url;

    @C09CT("width")
    public final int width;

    public CreativeTemplateAsset() {
        this(0, 0, "", "");
    }

    public CreativeTemplateAsset(int i, int i2, String str, String str2) {
        this.width = i;
        this.height = i2;
        this.url = str;
        this.uri = str2;
    }
}
