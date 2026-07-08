package com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductRelation {

    @C09CT("product_list")
    public final List<RelationProduct> productList;

    @C09CT("relation_type")
    public final Integer relationType;

    public ProductRelation() {
        this(null, null);
    }

    public ProductRelation(Integer num, List<RelationProduct> list) {
        this.relationType = num;
        this.productList = list;
    }
}
