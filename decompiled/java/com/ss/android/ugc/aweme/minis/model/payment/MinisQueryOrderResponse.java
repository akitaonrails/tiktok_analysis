package com.ss.android.ugc.aweme.minis.model.payment;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisQueryOrderResponse extends BaseResponse {

    @C09CT("trade_order_id")
    public final String tradeOrderId = "";

    @C09CT("trade_order")
    public final MinisTradeOrderInfo tradeOrderInfo = new MinisTradeOrderInfo("", TradeOrderStatus.NONE, 0, "", "", "", "", 0, 0);
}
