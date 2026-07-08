package com.ss.android.ugc.aweme.pipo.cashier.refund.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundMethod {

    @C09CT("dark_mode_icon_url")
    public final String darkModeIconUrl;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("invalid_reason")
    public final String invalidReason;

    @C09CT("option_name")
    public final String optionName;

    @C09CT("original_payment_method")
    public final String originalPaymentMethod;

    @C09CT("original_payment_method_id")
    public final String originalPaymentMethodId;

    @C09CT("refund_decision_type")
    public final String refundDecisionType;

    @C09CT("suffix_info_v2")
    public final String suffixInfo;

    @C09CT("target_payment_method")
    public final String targetPaymentMethod;

    @C09CT("target_payment_method_id")
    public final String targetPaymentMethodId;

    @C09CT("title")
    public final String title;

    public RefundMethod() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public RefundMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.title = str;
        this.suffixInfo = str2;
        this.invalidReason = str3;
        this.iconUrl = str4;
        this.darkModeIconUrl = str5;
        this.refundDecisionType = str6;
        this.originalPaymentMethodId = str7;
        this.originalPaymentMethod = str8;
        this.targetPaymentMethodId = str9;
        this.targetPaymentMethod = str10;
        this.optionName = str11;
    }
}
