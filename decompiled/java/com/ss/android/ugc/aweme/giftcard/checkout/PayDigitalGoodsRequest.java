package com.ss.android.ugc.aweme.giftcard.checkout;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PayDigitalGoodsRequest {

    @C09CT("giftcard_notify_inputs")
    public final List<GiftcardNotifyInputInfo> giftcardNotifyInputInfo;

    @C09CT("order_id")
    public final String orderId;

    @C09CT("pay_request_payment_detailsStr")
    public final String paymentSelectedInfo;

    @C09CT("risk_info")
    public final String riskInfo;

    public PayDigitalGoodsRequest() {
        this(null, null, null, null);
    }

    public PayDigitalGoodsRequest(String str, List<GiftcardNotifyInputInfo> list, String str2, String str3) {
        this.orderId = str;
        this.giftcardNotifyInputInfo = list;
        this.paymentSelectedInfo = str2;
        this.riskInfo = str3;
    }
}
