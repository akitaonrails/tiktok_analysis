package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BigSaleConfig {

    @C09CT("height")
    public final Integer imageHeight;

    @C09CT("image_id")
    public final String imageId;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("width")
    public final Integer imageWidth;

    public BigSaleConfig() {
        this(null, null, 0, 0);
    }

    public BigSaleConfig(String str, String str2, Integer num, Integer num2) {
        this.imageUrl = str;
        this.imageId = str2;
        this.imageWidth = num;
        this.imageHeight = num2;
    }
}
