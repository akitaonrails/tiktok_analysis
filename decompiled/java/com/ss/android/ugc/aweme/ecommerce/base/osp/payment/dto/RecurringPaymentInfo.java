package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class RecurringPaymentInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("agreement_type")
    public Integer agreementType;

    @C09CT("billing_agreement")
    public Map<Integer, String> billingAgreement;

    @C09CT("fallback_display_price")
    public String fallbackDisplayPrice;

    @C09CT("fallback_display_price_switch")
    public Boolean fallbackDisplayPriceSwitch;

    @C09CT("management_url")
    public String managementUrl;

    @C09CT("payment_description")
    public String paymentDescription;

    @C09CT("recurring_billing_label")
    public Map<Integer, String> recurringBillingLabel;

    @C09CT("token_notification_url")
    public String tokenNotificationUrl;

    public RecurringPaymentInfo() {
    }

    public RecurringPaymentInfo(Map<Integer, String> map, Map<Integer, String> map2, String str, String str2, String str3, String str4, Boolean bool, Integer num) {
        this.billingAgreement = map;
        this.recurringBillingLabel = map2;
        this.paymentDescription = str;
        this.tokenNotificationUrl = str2;
        this.managementUrl = str3;
        this.fallbackDisplayPrice = str4;
        this.fallbackDisplayPriceSwitch = bool;
        this.agreementType = num;
    }
}
