package com.ss.android.ugc.aweme.pipo.cashier.refund.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundArrivingTime {

    @C09CT("refund_arriving_from")
    public final Integer refundArrivingFrom;

    @C09CT("refund_arriving_to")
    public final Integer refundArrivingTo;

    public RefundArrivingTime() {
        this(null, null);
    }

    public RefundArrivingTime(Integer num, Integer num2) {
        this.refundArrivingFrom = num;
        this.refundArrivingTo = num2;
    }
}
