package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class PricingAmount {

    @C09CT("currency")
    public final String amountCurrency;

    @C09CT("amount_val")
    public final String amountVal;

    public PricingAmount(String str, String str2) {
        this.amountVal = str;
        this.amountCurrency = str2;
    }
}
