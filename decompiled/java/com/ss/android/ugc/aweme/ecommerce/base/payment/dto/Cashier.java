package com.ss.android.ugc.aweme.ecommerce.base.payment.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Cashier {

    @C09CT("address")
    public AddressForPay address;

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("env")
    public final String env;

    @C09CT("idc")
    public final String idc;

    @C09CT("locale")
    public final String locale;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("nonce")
    public final String nonce;

    @C09CT("notification_url")
    public final String notificationUrl;

    @C09CT("origin_key")
    public final String originKey;

    @C09CT("payment_params")
    public final PaymentParams paymentParams;

    @C09CT("pipo_host")
    public final String pipoHost;

    @C09CT("ret_code")
    public final String retCode;

    @C09CT("risk_info")
    public final String riskInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cashier)) {
            return false;
        }
        Cashier cashier = (Cashier) obj;
        return Intrinsics.LJFF(this.idc, cashier.idc) && Intrinsics.LJFF(this.merchantId, cashier.merchantId) && Intrinsics.LJFF(this.merchantUserId, cashier.merchantUserId) && Intrinsics.LJFF(this.env, cashier.env) && Intrinsics.LJFF(this.nonce, cashier.nonce) && Intrinsics.LJFF(this.originKey, cashier.originKey) && Intrinsics.LJFF(this.locale, cashier.locale) && Intrinsics.LJFF(this.notificationUrl, cashier.notificationUrl) && Intrinsics.LJFF(this.countryOrRegion, cashier.countryOrRegion) && Intrinsics.LJFF(this.paymentParams, cashier.paymentParams) && Intrinsics.LJFF(this.riskInfo, cashier.riskInfo) && Intrinsics.LJFF(this.retCode, cashier.retCode) && Intrinsics.LJFF(this.address, cashier.address) && Intrinsics.LJFF(this.pipoHost, cashier.pipoHost);
    }

    public Cashier(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, PaymentParams paymentParams, String str10, String str11, AddressForPay addressForPay, String str12) {
        this.idc = str;
        this.merchantId = str2;
        this.merchantUserId = str3;
        this.env = str4;
        this.nonce = str5;
        this.originKey = str6;
        this.locale = str7;
        this.notificationUrl = str8;
        this.countryOrRegion = str9;
        this.paymentParams = paymentParams;
        this.riskInfo = str10;
        this.retCode = str11;
        this.address = addressForPay;
        this.pipoHost = str12;
    }
}
