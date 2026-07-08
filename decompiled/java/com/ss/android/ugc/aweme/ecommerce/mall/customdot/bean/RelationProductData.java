package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: loaded from: classes27.dex */
public final class RelationProductData {

    @C09CT("product_feature")
    public final String productFeature;

    @C09CT("product_logo")
    public final Image productLogo;

    @C09CT("product_id")
    public final String product_id;

    @C09CT("video_timestamp")
    public final int videoTimestamp;

    public RelationProductData(String str, int i, Image image, String str2) {
        this.product_id = str;
        this.videoTimestamp = i;
        this.productLogo = image;
        this.productFeature = str2;
    }
}
