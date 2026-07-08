package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class SellingView {

    @C09CT("selling_items")
    public final List<SellingItem> sellingItems;

    public SellingView() {
        this(null);
    }

    public SellingView(List<SellingItem> list) {
        this.sellingItems = list;
    }
}
