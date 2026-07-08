package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class CBIPaymentMethodDetail implements Serializable {

    @C09CT("bind_time")
    public final String bindTime;

    @C09CT("dark_mode_icon_url")
    public final String darkModeIconUrl;

    @C09CT("display_raw_name")
    public final String displayName;

    @C09CT("google_pay_support_networks")
    public final List<String> googlePaySupportNetworks;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("is_available")
    public final Boolean isAvailable;

    @C09CT("is_primary")
    public final Boolean isPrimary;

    @C09CT("MaxPaymentAmount")
    public final String maxPaymentAmount;

    @C09CT("method_type")
    public final String methodType;

    @C09CT("MinPaymentAmount")
    public final String minPaymentAmount;

    @C09CT("model")
    public final String model;

    @C09CT("actual_payment_amount")
    public final String paymentAmount;

    @C09CT("payment_amount_display_text")
    public final String paymentAmountDisplayText;

    @C09CT("payment_currency")
    public final String paymentCurrency;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    @C09CT("payment_tips")
    public final String paymentTips;

    @C09CT("pricing_plan_id")
    public final String pricingPlanId;

    @C09CT("payment_method")
    public final String rawPaymentMethod;

    @C09CT("save_display_text")
    public final String saveDisplayText;

    @C09CT("show_info_schema")
    public final String showInfoSchema;

    public final Boolean isAvailable() {
        return this.isAvailable;
    }

    public final Boolean isPrimary() {
        return this.isPrimary;
    }

    public CBIPaymentMethodDetail(String str, Boolean bool, Boolean bool2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List<String> list, String str16, String str17, String str18) {
        this.paymentMethodToken = str;
        this.isAvailable = bool;
        this.isPrimary = bool2;
        this.showInfoSchema = str2;
        this.methodType = str3;
        this.paymentAmount = str4;
        this.paymentAmountDisplayText = str5;
        this.bindTime = str6;
        this.paymentMethodId = str7;
        this.rawPaymentMethod = str8;
        this.iconUrl = str9;
        this.darkModeIconUrl = str10;
        this.displayName = str11;
        this.model = str12;
        this.paymentTips = str13;
        this.saveDisplayText = str14;
        this.pricingPlanId = str15;
        this.googlePaySupportNetworks = list;
        this.paymentCurrency = str16;
        this.maxPaymentAmount = str17;
        this.minPaymentAmount = str18;
    }
}
