package com.ss.android.ugc.aweme.ecommerce.search.suggest.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class IconModel {

    @C09CT("height")
    public final Integer height;

    @C09CT("thumb_url_list")
    public final List<String> thumbUrlList;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final Integer width;

    public IconModel() {
        this(null, null, null, null, null);
    }

    public IconModel(String str, List<String> list, Integer num, Integer num2, List<String> list2) {
        this.uri = str;
        this.urlList = list;
        this.height = num;
        this.width = num2;
        this.thumbUrlList = list2;
    }
}
