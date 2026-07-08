package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class Image implements Serializable {

    @C09CT("height")
    public final Integer ImageHeight;

    @C09CT("width")
    public final Integer ImageWidth;

    @C09CT("mimetype")
    public final String mimetype;

    @C09CT("thumb_uri")
    public final String thumbUri;

    @C09CT("thumb_url_list")
    public final List<String> thumbUrlList;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    public final Image copy(Integer num, Integer num2, String str, String str2, List<String> list, String str3, List<String> list2) {
        return new Image(num, num2, str, str2, list, str3, list2);
    }

    public final Integer getImageHeight() {
        return this.ImageHeight;
    }

    public final Integer getImageWidth() {
        return this.ImageWidth;
    }

    public Image(Integer num, Integer num2, String str, String str2, List<String> list, String str3, List<String> list2) {
        this.ImageHeight = num;
        this.ImageWidth = num2;
        this.mimetype = str;
        this.thumbUri = str2;
        this.thumbUrlList = list;
        this.uri = str3;
        this.urlList = list2;
    }
}
