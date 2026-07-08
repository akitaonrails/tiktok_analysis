package com.ss.android.ugc.aweme.component.nativeproducttilescomponent;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ProductTile implements Serializable {
    public static final int $stable = 8;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    public ProductTile(String str, List<String> list) {
        this.uri = str;
        this.urlList = list;
    }
}
