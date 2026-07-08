package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentBillSummaryType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentPrice {

    @C09CT("combination_payment_methods_codes")
    public final List<String> combinationPaymentMethodsCodes;

    @C09CT("payment_bill_summary_type")
    public final PaymentBillSummaryType paymentBillSummaryType;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_price_version_id")
    public final String paymentPriceVersionId;

    @C09CT("payment_summary")
    public final Summary paymentSummary;

    @C09CT("payment_unit_id")
    public final String paymentUnitId;

    @C09CT("payment_price")
    public final Price price;

    public PaymentPrice(String str, Price price, Summary summary, List<String> list, PaymentBillSummaryType paymentBillSummaryType, String str2, String str3) {
        this.paymentMethodId = str;
        this.price = price;
        this.paymentSummary = summary;
        this.combinationPaymentMethodsCodes = list;
        this.paymentBillSummaryType = paymentBillSummaryType;
        this.paymentUnitId = str2;
        this.paymentPriceVersionId = str3;
    }
}
