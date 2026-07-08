package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductRelation {

    @C09CT("product_list")
    public final List<RelationProduct> productList;

    @C09CT("relation_type")
    public final int relationType;

    public ProductRelation(int i, List<RelationProduct> list) {
        this.relationType = i;
        this.productList = list;
    }
}
