package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class DelegatePaymentConstraints {

    @C09CT("payment_info")
    public final DelegatePaymentInfo paymentInfo;

    @C09CT("single_use")
    public final boolean singleUse;

    @C09CT("ttl")
    public final int ttl;

    public DelegatePaymentConstraints() {
        this(new DelegatePaymentInfo(null, null), true, 86400);
    }

    public DelegatePaymentConstraints(DelegatePaymentInfo delegatePaymentInfo, boolean z, int i) {
        this.paymentInfo = delegatePaymentInfo;
        this.singleUse = z;
        this.ttl = i;
    }
}
