package com.ss.android.ugc.aweme.feed.model.commercialize.adshopifycheckout;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class ShopifyCheckoutEntity implements Serializable {

    @C09CT("checkout_authorized_domain_list")
    public final List<String> authorizedDomainList;

    @C09CT("enable_native_checkout")
    public final boolean enableNativeCheckout;

    @C09CT("shopify_domain")
    public final String shopifyDomain;

    public final List<String> getAuthorizedDomainList() {
        return this.authorizedDomainList;
    }

    public final boolean getEnableNativeCheckout() {
        return this.enableNativeCheckout;
    }

    public final String getShopifyDomain() {
        return this.shopifyDomain;
    }
}
