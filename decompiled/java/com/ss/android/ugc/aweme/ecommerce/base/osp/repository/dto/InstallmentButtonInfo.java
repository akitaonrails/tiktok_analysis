package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class InstallmentButtonInfo {

    @C09CT("button")
    public PlaceOrderButtonInfo button;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("installment_option_id")
    public String installmentOptionId;

    @C09CT("installment_plan_id")
    public String installmentPlanId;

    @C09CT("payment_method_code")
    public String paymentMethodId;

    @C09CT("tenure")
    public String tenure;

    @C09CT("token")
    public String token;

    public InstallmentButtonInfo() {
        this(null, null, null, null, null, null, null);
    }

    public InstallmentButtonInfo(PlaceOrderButtonInfo placeOrderButtonInfo, String str, String str2, String str3, String str4, String str5, String str6) {
        this.button = placeOrderButtonInfo;
        this.tenure = str;
        this.token = str2;
        this.installmentPlanId = str3;
        this.installmentOptionId = str4;
        this.paymentMethodId = str5;
        this.daInfo = str6;
    }
}
