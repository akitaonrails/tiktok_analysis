package com.bytedance.android.livesdk.model.message;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BillboardProductConfig {

    @C09CT("product_id")
    public long productId;

    @C09CT("product_image_url")
    public String productImageUrl = "";

    @C09CT("product_name")
    public String productName = "";

    @C09CT("product_price")
    public BillboardProductPrice productPrice;

    @C09CT("shop_bag_index")
    public long shopBagIndex;
}
