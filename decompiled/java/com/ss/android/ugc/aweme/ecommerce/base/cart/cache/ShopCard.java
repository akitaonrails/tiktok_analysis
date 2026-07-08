package com.ss.android.ugc.aweme.ecommerce.base.cart.cache;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopCard {

    @C09CT("items")
    public final List<Item> items;

    @C09CT("seller")
    public final SellerInfo seller;

    @C09CT("seller_id")
    public final String sellerId;

    public ShopCard(String str, SellerInfo sellerInfo, List<Item> list) {
        this.sellerId = str;
        this.seller = sellerInfo;
        this.items = list;
    }
}
