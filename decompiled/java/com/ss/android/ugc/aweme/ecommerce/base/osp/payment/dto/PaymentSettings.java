package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentSettings {

    @C09CT("display_disable_methods")
    public Boolean displayDisableMethods;

    @C09CT("enable_venmo_native")
    public Boolean enableVenmoNative;

    @C09CT("pay_button")
    public PaymentButtonConfig payButton;

    @C09CT("select_button")
    public PaymentButtonConfig selectButton;

    @C09CT("user_status")
    public UserStatus userStatus;

    @C09CT("view_all_bottom_key")
    public String viewAllBottomKey;

    @C09CT("view_all_icon_num")
    public Integer viewAllIconNum;

    @C09CT("view_all_top_key")
    public String viewAllTopKey;

    @C09CT("view_all_type")
    public Integer viewAllType;

    public PaymentSettings() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public PaymentSettings(Boolean bool, Integer num, PaymentButtonConfig paymentButtonConfig, PaymentButtonConfig paymentButtonConfig2, String str, String str2, Integer num2, UserStatus userStatus, Boolean bool2) {
        this.displayDisableMethods = bool;
        this.viewAllType = num;
        this.selectButton = paymentButtonConfig;
        this.payButton = paymentButtonConfig2;
        this.viewAllBottomKey = str;
        this.viewAllTopKey = str2;
        this.viewAllIconNum = num2;
        this.userStatus = userStatus;
        this.enableVenmoNative = bool2;
    }
}
