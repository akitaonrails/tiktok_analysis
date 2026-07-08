package com.ss.android.ugc.aweme.search.detail.relatedsearch.settings;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class BackgroundVideoCover implements Serializable {
    public static final int $stable = 8;

    @C09CT("height")
    public final Integer height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final Integer width;

    public BackgroundVideoCover() {
        this(null, null, null, null);
    }

    public BackgroundVideoCover(Integer num, Integer num2, String str, List<String> list) {
        this.height = num;
        this.width = num2;
        this.uri = str;
        this.urlList = list;
    }
}
