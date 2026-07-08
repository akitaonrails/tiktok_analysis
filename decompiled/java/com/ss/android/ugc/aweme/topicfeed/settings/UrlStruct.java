package com.ss.android.ugc.aweme.topicfeed.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class UrlStruct {

    @C09CT("height")
    public final int height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final String[] urlList;

    @C09CT("width")
    public final int width;

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
