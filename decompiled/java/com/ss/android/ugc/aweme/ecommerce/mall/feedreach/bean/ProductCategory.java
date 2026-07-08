package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductCategory {

    @C09CT("category_id")
    public final String categoryId;

    @C09CT("category_name")
    public final String categoryName;

    @C09CT("level")
    public final int level;

    @C09CT("text")
    public final String text;

    public ProductCategory(String str, String str2, String str3, int i) {
        this.text = str;
        this.categoryId = str2;
        this.categoryName = str3;
        this.level = i;
    }
}
