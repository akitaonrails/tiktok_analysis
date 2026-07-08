package com.ss.android.ugc.aweme.poi.detail.container.background;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class CoverImg implements Serializable {

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    public CoverImg() {
        this(null, null);
    }

    public CoverImg(String str, List<String> list) {
        this.uri = str;
        this.urlList = list;
    }
}
