package com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier;

import X.C09CT;
import X.C1709570uaZ;
import X.EnumC1155630gB7;
import X.EnumC1709020uZg;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;

/* JADX INFO: loaded from: classes27.dex */
public final class SubCashierEnterParams {
    public final EnumC1155630gB7 LIZ;
    public final CashierEnterParams LIZIZ;
    public final EnumC1709020uZg LIZJ;

    @C09CT("default_checked_sub_pm_key")
    public final String defaultCheckedSubPaymentOptionKey;

    @C09CT("parent_payment_option")
    public final PaymentOption parentPaymentOption;

    @C09CT("pay_request_id")
    public final String payRequestId;

    @C09CT("payment_data")
    public final C1709570uaZ paymentData;

    @C09CT("return_previous_page")
    public final Boolean returnPreviousPage;

    public SubCashierEnterParams(EnumC1155630gB7 enumC1155630gB7, CashierEnterParams cashierEnterParams, String str, Boolean bool, C1709570uaZ c1709570uaZ, PaymentOption paymentOption, String str2, String str3, EnumC1709020uZg enumC1709020uZg) {
        this.LIZ = enumC1155630gB7;
        this.LIZIZ = cashierEnterParams;
        this.payRequestId = str;
        this.returnPreviousPage = bool;
        this.paymentData = c1709570uaZ;
        this.parentPaymentOption = paymentOption;
        this.defaultCheckedSubPaymentOptionKey = str2;
        this.LIZJ = enumC1709020uZg;
    }
}
