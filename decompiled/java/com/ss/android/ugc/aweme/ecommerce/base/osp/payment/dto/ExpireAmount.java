package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ExpireAmount {

    @C09CT("amount")
    public String amount;

    @C09CT("currency")
    public String currency;

    @C09CT("expiry_time")
    public String expireTime;

    @C09CT("price_str")
    public String priceStr;

    public ExpireAmount() {
    }

    public ExpireAmount(String str, String str2, String str3, String str4) {
        this.currency = str;
        this.amount = str2;
        this.priceStr = str3;
        this.expireTime = str4;
    }
}
