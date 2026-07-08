package com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class RelationProduct {

    @C09CT("category_level")
    public final Integer categoryLevel;

    @C09CT("related_categories")
    public final List<ProductCategory> relatedCategories;

    @C09CT("related_products")
    public final List<RelationProductData> relatedProducts;

    public RelationProduct() {
        this(null, null, null);
    }

    public RelationProduct(List<RelationProductData> list, List<ProductCategory> list2, Integer num) {
        this.relatedProducts = list;
        this.relatedCategories = list2;
        this.categoryLevel = num;
    }
}
