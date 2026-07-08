package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentInfoItem {

    @C09CT("button")
    public final StarlingKeyValue button;

    @C09CT("status_code")
    public final String code;

    @C09CT("is_prefill")
    public final Boolean isPrefill;

    @C09CT("item_data")
    public final Map<String, String> itemData;

    @C09CT("payment_methods")
    public final Payment paymentMethods;

    @C09CT("sub_text")
    public final String subText;

    @C09CT("payment_method_title")
    public final String title;

    public PaymentInfoItem(String str, Payment payment, String str2, StarlingKeyValue starlingKeyValue, String str3, Map<String, String> map, Boolean bool) {
        this.title = str;
        this.paymentMethods = payment;
        this.subText = str2;
        this.button = starlingKeyValue;
        this.code = str3;
        this.itemData = map;
        this.isPrefill = bool;
    }
}
