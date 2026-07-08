package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ECImage {

    @C09CT("height")
    public final int height;

    @C09CT("url_list")
    public final String key;

    @C09CT("url")
    public final String url;

    @C09CT("key")
    public final String urlKey;

    @C09CT("width")
    public final int width;

    public ECImage(String str, int i, int i2, String str2, String str3) {
        this.key = str;
        this.width = i;
        this.height = i2;
        this.url = str2;
        this.urlKey = str3;
    }
}
