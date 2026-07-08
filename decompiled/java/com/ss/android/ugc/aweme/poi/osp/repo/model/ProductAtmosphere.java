package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ProductAtmosphere {

    @C09CT("atmosphere_expression_list")
    public final List<ProductAtmosphereExpression> atmosphereExpressionList;

    @C09CT("product_id")
    public final String productId;

    public ProductAtmosphere() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductAtmosphere)) {
            return false;
        }
        ProductAtmosphere productAtmosphere = (ProductAtmosphere) obj;
        return Intrinsics.LJFF(this.productId, productAtmosphere.productId) && Intrinsics.LJFF(this.atmosphereExpressionList, productAtmosphere.atmosphereExpressionList);
    }

    public ProductAtmosphere(String str, List<ProductAtmosphereExpression> list) {
        this.productId = str;
        this.atmosphereExpressionList = list;
    }
}
