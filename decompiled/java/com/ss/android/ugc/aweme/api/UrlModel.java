package com.ss.android.ugc.aweme.api;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class UrlModel implements Serializable {

    @C09CT("height")
    public final Integer height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final Integer width;

    public UrlModel(String str, List<String> list, Integer num, Integer num2) {
        this.uri = str;
        this.urlList = list;
        this.width = num;
        this.height = num2;
    }
}
