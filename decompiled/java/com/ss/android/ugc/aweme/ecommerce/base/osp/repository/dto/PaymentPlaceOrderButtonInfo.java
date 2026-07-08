package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentPlaceOrderButtonInfo {

    @C09CT("installment_button")
    public List<InstallmentButtonInfo> installmentButtonList;

    @C09CT("payment_price_version_id")
    public String paymentPriceVersionId;

    public PaymentPlaceOrderButtonInfo() {
        this(null, null);
    }

    public PaymentPlaceOrderButtonInfo(String str, List<InstallmentButtonInfo> list) {
        this.paymentPriceVersionId = str;
        this.installmentButtonList = list;
    }
}
