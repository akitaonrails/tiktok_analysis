package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class DelegatePaymentInfo {

    @C09CT("amount")
    public final String amount;

    @C09CT("currency")
    public final String currency;

    public DelegatePaymentInfo() {
        this(null, null);
    }

    public DelegatePaymentInfo(String str, String str2) {
        this.amount = str;
        this.currency = str2;
    }
}
