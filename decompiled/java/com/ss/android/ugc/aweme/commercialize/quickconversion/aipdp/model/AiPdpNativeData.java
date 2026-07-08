package com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class AiPdpNativeData implements Serializable {
    public static final int $stable = 8;
    public final List<String> imageUrls;
    public final AiPdpShopifyInfo pdpShopifyInfo;
    public final String price;
    public final AiPdpPriceInfo priceInfo;
    public final AiPdpProductInfo productInfo;
    public final String productName;
    public final AiPdpReviewInfo reviewInfo;
    public final AiPdpWebSiteInfo webSiteInfo;

    public AiPdpNativeData() {
        this(null, null, null, null, null, null, null, null);
    }

    public AiPdpNativeData(String str, String str2, List<String> list, AiPdpProductInfo aiPdpProductInfo, AiPdpPriceInfo aiPdpPriceInfo, AiPdpReviewInfo aiPdpReviewInfo, AiPdpWebSiteInfo aiPdpWebSiteInfo, AiPdpShopifyInfo aiPdpShopifyInfo) {
        this.productName = str;
        this.price = str2;
        this.imageUrls = list;
        this.productInfo = aiPdpProductInfo;
        this.priceInfo = aiPdpPriceInfo;
        this.reviewInfo = aiPdpReviewInfo;
        this.webSiteInfo = aiPdpWebSiteInfo;
        this.pdpShopifyInfo = aiPdpShopifyInfo;
    }
}
