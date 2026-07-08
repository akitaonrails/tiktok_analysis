package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;

/* JADX INFO: loaded from: classes27.dex */
public final class AssembleProduct {

    @C09CT("cover")
    public final ECImage cover;

    @C09CT("product_id")
    public final String productId;

    public AssembleProduct() {
        this(null, null);
    }

    public AssembleProduct(ECImage eCImage, String str) {
        this.cover = eCImage;
        this.productId = str;
    }
}
