package com.ss.android.ugc.aweme.stemfeed.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class UrlStruct {

    @C09CT("height")
    public int height;

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public String[] urlList;

    @C09CT("width")
    public int width;

    public UrlStruct() {
        this(0, 0, "", null);
    }

    public UrlStruct(int i, int i2, String str, String[] strArr) {
        this.height = i;
        this.width = i2;
        this.uri = str;
        this.urlList = strArr;
    }
}
