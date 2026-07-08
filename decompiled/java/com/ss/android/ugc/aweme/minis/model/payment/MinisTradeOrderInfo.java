package com.ss.android.ugc.aweme.minis.model.payment;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisTradeOrderInfo {

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("currency")
    public final String currency;

    @C09CT("end_time")
    public final long endTime;

    @C09CT("price")
    public final String price;

    @C09CT("sku_type")
    public final int skuType;

    @C09CT("token_amount")
    public final long tokenAmount;

    @C09CT("token_type")
    public final String tokenType;

    @C09CT("trade_order_type")
    public final String tradeOderType;

    @C09CT("trade_order_status")
    public final TradeOrderStatus tradeOrderStatus;

    public MinisTradeOrderInfo() {
        this("", TradeOrderStatus.NONE, 0L, "", "", "", "", 0, 0L);
    }

    public MinisTradeOrderInfo(String str, TradeOrderStatus tradeOrderStatus, long j, String str2, String str3, String str4, String str5, int i, long j2) {
        this.tradeOderType = str;
        this.tradeOrderStatus = tradeOrderStatus;
        this.tokenAmount = j;
        this.tokenType = str2;
        this.price = str3;
        this.currency = str4;
        this.clientKey = str5;
        this.skuType = i;
        this.endTime = j2;
    }
}
