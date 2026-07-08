package com.ss.android.ugc.aweme.pipo.cashier.common.pay.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PayResponseData {

    @C09CT("amount")
    public String amount;

    @C09CT("cashier_action")
    public final String cashierAction;

    @C09CT("channel_sdk_info")
    public final ChannelSdkInfo channelSdkInfo;

    @C09CT("currency")
    public String currency;

    @C09CT("error_content")
    public final String errorContent;

    @C09CT("expiration_time")
    public final String expirationTime;

    @C09CT("merchant_id")
    public String merchantId;

    @C09CT("merchant_order_id")
    public String merchantOrderId;

    @C09CT("merchant_user_id")
    public String merchantUserId;

    @C09CT("pay_id")
    public String payId;

    @C09CT("payment_reference")
    public String paymentReference;

    @C09CT("cashier_redirect_info")
    public final RedirectDetails redirectDetails;

    public PayResponseData(String str, String str2, String str3, RedirectDetails redirectDetails, ChannelSdkInfo channelSdkInfo, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.cashierAction = str;
        this.paymentReference = str2;
        this.expirationTime = str3;
        this.redirectDetails = redirectDetails;
        this.channelSdkInfo = channelSdkInfo;
        this.merchantId = str4;
        this.merchantUserId = str5;
        this.merchantOrderId = str6;
        this.payId = str7;
        this.amount = str8;
        this.currency = str9;
        this.errorContent = str10;
    }
}
