package com.bytedance.iap.service.mp.model;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TokenInfo {

    @C09CT("channel_order_id")
    public final String channelOrderId;

    @C09CT("channel_user_id")
    public final String channelUserId;

    @C09CT("order_id")
    public final String orderId;

    @C09CT("payment_method")
    public final String paymentMethod;

    @C09CT("product_id")
    public final String productId;

    @C09CT("token")
    public final String token;

    @C09CT("user_id")
    public final String userId;

    public TokenInfo() {
        this("", "", "", "", "", "", "");
    }

    public TokenInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.orderId = str;
        this.channelOrderId = str2;
        this.userId = str3;
        this.channelUserId = str4;
        this.productId = str5;
        this.paymentMethod = str6;
        this.token = str7;
    }
}
