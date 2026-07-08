package com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class AiPdpShopifyInfo implements Serializable {
    public static final int $stable = 0;
    public final boolean isShoppingShopify;
    public final String shopifyId;
    public final String shopifyPdpUrl;

    public AiPdpShopifyInfo() {
        this(null, null, false);
    }

    public final boolean isShoppingShopify() {
        return this.isShoppingShopify;
    }

    public AiPdpShopifyInfo(String str, String str2, boolean z) {
        this.shopifyId = str;
        this.shopifyPdpUrl = str2;
        this.isShoppingShopify = z;
    }
}
