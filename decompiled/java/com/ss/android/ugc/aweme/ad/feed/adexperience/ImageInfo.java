package com.ss.android.ugc.aweme.ad.feed.adexperience;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class ImageInfo implements Serializable {

    @C09CT("image_id")
    public final String imageId;

    @C09CT("product_id")
    public final String productId;

    public final String getImageId() {
        return this.imageId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public ImageInfo(String str, String str2) {
        this.productId = str;
        this.imageId = str2;
    }
}
