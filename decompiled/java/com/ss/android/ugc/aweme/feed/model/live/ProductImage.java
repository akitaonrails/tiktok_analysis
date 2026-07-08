package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class ProductImage implements Serializable {

    @C09CT("height")
    public final Integer height;

    @C09CT("key")
    public final String key;

    @C09CT("url")
    public final String url;

    @C09CT("width")
    public final Integer width;

    public ProductImage() {
        this(null, null, null, null);
    }

    public ProductImage(String str, Integer num, Integer num2, String str2) {
        this.key = str;
        this.width = num;
        this.height = num2;
        this.url = str2;
    }
}
