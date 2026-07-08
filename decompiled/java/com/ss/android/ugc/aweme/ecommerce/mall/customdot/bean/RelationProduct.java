package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.ProductCategory;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class RelationProduct {

    @C09CT("category_level")
    public final Integer category_level;

    @C09CT("related_categories")
    public final List<ProductCategory> relatedCategories;

    @C09CT("related_products")
    public final List<RelationProductData> relatedProducts;

    public RelationProduct(List<RelationProductData> list, List<ProductCategory> list2, Integer num) {
        this.relatedProducts = list;
        this.relatedCategories = list2;
        this.category_level = num;
    }
}
