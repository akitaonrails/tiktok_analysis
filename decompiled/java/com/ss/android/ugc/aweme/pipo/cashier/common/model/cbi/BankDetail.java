package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class BankDetail {

    @C09CT("bank_code")
    public final String bankCode;

    @C09CT("bank_name")
    public final String bankName;

    @C09CT("dark_mode_icon_url")
    public final String darkModeIconUrl;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("is_available")
    public final Boolean isAvailable;

    @C09CT("is_default")
    public final Boolean isDefault;

    @C09CT("payment_method_tips")
    public final List<PaymentMethodTips> paymentMethodTips;

    @C09CT("unavailable_raw_msg")
    public final String unavailableRawMsg;

    public BankDetail(String str, String str2, String str3, String str4, Boolean bool, String str5, List<PaymentMethodTips> list, Boolean bool2) {
        this.bankCode = str;
        this.bankName = str2;
        this.iconUrl = str3;
        this.darkModeIconUrl = str4;
        this.isAvailable = bool;
        this.unavailableRawMsg = str5;
        this.paymentMethodTips = list;
        this.isDefault = bool2;
    }
}
