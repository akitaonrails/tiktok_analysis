package com.bytedance.ies.ugc.aweme.rich.model.feed.model.search;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchAdProductCarousel implements Serializable {

    @C09CT("product_list")
    public List<? extends UrlModel> productList;

    public final List<UrlModel> getProductList() {
        return this.productList;
    }

    public final void setProductList(List<? extends UrlModel> list) {
        this.productList = list;
    }
}
