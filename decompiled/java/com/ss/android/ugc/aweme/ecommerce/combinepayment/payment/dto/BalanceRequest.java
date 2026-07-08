package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BalanceRequest {

    @C09CT("consultation_id")
    public final String consultationId;

    @C09CT("currency")
    public final String currency;

    @C09CT("payment_methods")
    public final List<PaymentMethodInfo> paymentMethods;

    @C09CT("sale_region")
    public final String saleRegion;

    @C09CT("summary_total_price_val")
    public final String summaryTotalPriceVal;

    public BalanceRequest(List<PaymentMethodInfo> list, String str, String str2, String str3, String str4) {
        this.paymentMethods = list;
        this.summaryTotalPriceVal = str;
        this.currency = str2;
        this.saleRegion = str3;
        this.consultationId = str4;
    }
}
