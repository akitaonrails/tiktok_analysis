package com.ss.android.ugc.aweme.commercialize.anchor.model;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class ProductAnchor {

    @C09CT("addition_id")
    public final String additionId;

    @C09CT("keyword")
    public final String keyword;

    @C09CT("product_id")
    public final String productId;

    @C09CT("type")
    public final int type;

    public ProductAnchor(String str, String str2, String str3, int i) {
        this.keyword = str;
        this.productId = str2;
        this.additionId = str3;
        this.type = i;
    }
}
