package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCBankCardRule {

    @C09CT("card_brand")
    public final String cardBrand;

    @C09CT("card_brand_display_name")
    public final String cardBrandDisplayName;

    @C09CT("card_brand_regex")
    public final String cardBrandRegex;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    public CCDCBankCardRule(String str, String str2, String str3, String str4) {
        this.cardBrand = str;
        this.paymentMethodId = str2;
        this.cardBrandRegex = str3;
        this.cardBrandDisplayName = str4;
    }
}
