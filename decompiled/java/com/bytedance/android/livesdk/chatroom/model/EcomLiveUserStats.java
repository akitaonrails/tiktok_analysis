package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class EcomLiveUserStats {

    @C09CT("bid_attempts")
    public long bidAttempts;

    @C09CT("products_added_to_cart_count")
    public long productsAddedToCartCount;

    @C09CT("purchased_products_count")
    public long purchasedProductsCount;

    @C09CT("viewed_products_count")
    public long viewedProductsCount;

    @C09CT("purchased_products")
    public List<UserProfileProduct> purchasedProducts = new ArrayList();

    @C09CT("products_added_to_cart")
    public List<UserProfileProduct> productsAddedToCart = new ArrayList();

    @C09CT("viewed_products")
    public List<UserProfileProduct> viewedProducts = new ArrayList();

    @C09CT("total_spending")
    public String totalSpending = "";
}
