package com.ss.android.ugc.aweme.ecommerce.search.vision.repo;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Image {

    @C09CT("height")
    public Integer height;

    @C09CT("thumb_uri")
    public final String thumbUri;

    @C09CT("thumb_url_list")
    public List<String> thumbUrls;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public List<String> urls;

    @C09CT("width")
    public Integer width;

    public Image(Integer num, Integer num2, String str, List<String> list, String str2, List<String> list2) {
        this.width = num;
        this.height = num2;
        this.uri = str;
        this.urls = list;
        this.thumbUri = str2;
        this.thumbUrls = list2;
    }
}
