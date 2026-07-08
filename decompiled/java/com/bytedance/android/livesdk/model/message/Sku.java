package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class Sku {

    @C09CT("cover")
    public ImageModel cover;

    @C09CT("price")
    public ProductPrice price;

    @C09CT("title")
    public String title = "";

    @C09CT("sku_id")
    public String skuId = "";
}
