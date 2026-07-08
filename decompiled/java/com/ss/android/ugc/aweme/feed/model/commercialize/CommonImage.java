package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class CommonImage implements Serializable {

    @C09CT("height")
    public final Integer height;

    @C09CT("origin_uri")
    public final String originUri;

    @C09CT("uri")
    public final String uri;

    @C09CT("url")
    public final String url;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final Integer width;

    public CommonImage(String str, String str2, String str3, Integer num, Integer num2, List<String> list) {
        this.uri = str;
        this.originUri = str2;
        this.url = str3;
        this.height = num;
        this.width = num2;
        this.urlList = list;
    }
}
