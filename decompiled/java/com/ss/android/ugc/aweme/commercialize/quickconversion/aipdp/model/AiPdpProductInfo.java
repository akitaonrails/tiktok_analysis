package com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class AiPdpProductInfo implements Serializable {
    public static final int $stable = 0;
    public final String addCartInfo;
    public final String addCartSelector;
    public final boolean isOneSku;
    public final boolean isShowCoupon;
    public final boolean isShowProductInsights;
    public final String language;
    public final String placeOrderText;
    public final String recommendPurchaseReason;
    public final String returnPolicy;
    public final String shopNowInfo;
    public final String shopNowSelector;
    public final String soldCount;
    public final String title;
    public final String viewMoreText;

    public AiPdpProductInfo() {
        this(null, null, null, null, null, null, false, null, null, false, false, null, null, null);
    }

    public final boolean isOneSku() {
        return this.isOneSku;
    }

    public final boolean isShowCoupon() {
        return this.isShowCoupon;
    }

    public final boolean isShowProductInsights() {
        return this.isShowProductInsights;
    }

    public AiPdpProductInfo(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, boolean z2, boolean z3, String str9, String str10, String str11) {
        this.title = str;
        this.soldCount = str2;
        this.addCartInfo = str3;
        this.shopNowInfo = str4;
        this.addCartSelector = str5;
        this.shopNowSelector = str6;
        this.isOneSku = z;
        this.recommendPurchaseReason = str7;
        this.returnPolicy = str8;
        this.isShowCoupon = z2;
        this.isShowProductInsights = z3;
        this.placeOrderText = str9;
        this.viewMoreText = str10;
        this.language = str11;
    }
}
