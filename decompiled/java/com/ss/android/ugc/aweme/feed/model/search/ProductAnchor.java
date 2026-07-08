package com.ss.android.ugc.aweme.feed.model.search;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.EnhancedProduct;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ProductAnchor {
    public final EnhancedProduct enhancedProduct;
    public final UrlModel iconUrlModel;
    public final List<Product> productList;

    public ProductAnchor() {
        this(null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductAnchor(iconUrlModel=");
        sbLIZ.append(this.iconUrlModel);
        sbLIZ.append(", productList=");
        sbLIZ.append(this.productList);
        sbLIZ.append(", enhancedProduct=");
        sbLIZ.append(this.enhancedProduct);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProductAnchor(UrlModel urlModel, List<Product> list, EnhancedProduct enhancedProduct) {
        this.iconUrlModel = urlModel;
        this.productList = list;
        this.enhancedProduct = enhancedProduct;
    }
}
