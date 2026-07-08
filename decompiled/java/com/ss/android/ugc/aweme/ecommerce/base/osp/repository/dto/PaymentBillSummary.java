package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentBillSummary {

    @C09CT("bill_summary")
    public Summary billSummary;

    @C09CT("combination_payment_methods_codes")
    public List<String> combinationPaymentMethodsCodes;

    @C09CT("payment_bill_summary_type")
    public PaymentBillSummaryType paymentBillSummaryType;

    @C09CT("payment_method_code")
    public String paymentMethodId;

    @C09CT("payment_price_version_id")
    public String paymentPriceVersionId;

    @C09CT("payment_unit_id")
    public String paymentUnitId;

    public PaymentBillSummary() {
    }

    public PaymentBillSummary(String str, Summary summary, List<String> list, PaymentBillSummaryType paymentBillSummaryType, String str2, String str3) {
        this.paymentMethodId = str;
        this.billSummary = summary;
        this.combinationPaymentMethodsCodes = list;
        this.paymentBillSummaryType = paymentBillSummaryType;
        this.paymentUnitId = str2;
        this.paymentPriceVersionId = str3;
    }
}
