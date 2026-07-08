package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentBillSummaryList {

    @C09CT("payment_bill_summary")
    public List<PaymentBillSummary> paymentBillSummary;

    public PaymentBillSummaryList() {
        this(null);
    }

    public PaymentBillSummaryList(List<PaymentBillSummary> list) {
        this.paymentBillSummary = list;
    }
}
