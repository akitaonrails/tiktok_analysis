package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class BroadcasterProductsData {

    @C09CT("popup_message")
    public final String popUpMessage;

    @C09CT("products")
    public final List<BroadcastProduct> products;

    @C09CT("total")
    public final Integer total;

    public BroadcasterProductsData(List<BroadcastProduct> list, Integer num, String str) {
        this.products = list;
        this.total = num;
        this.popUpMessage = str;
    }
}
