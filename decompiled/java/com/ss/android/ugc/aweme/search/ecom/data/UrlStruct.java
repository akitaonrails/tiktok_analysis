package com.ss.android.ugc.aweme.search.ecom.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class UrlStruct implements Serializable {

    @C09CT("url_list")
    public final List<String> urlList;

    public UrlStruct() {
        this(null);
    }

    public UrlStruct(List<String> list) {
        this.urlList = list;
    }
}
