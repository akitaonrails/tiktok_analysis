package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.payment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutPipoRefreshParamsConfig {

    @C09CT("amount_in_cents")
    public final int amountInCents;

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("currency")
    public final String currency;

    @C09CT("force_filter_google_pay")
    public final boolean forceFilterGooglePay;

    @C09CT("google_pay_gateway")
    public final String googlePayGateway;

    @C09CT("google_pay_gateway_merchant_id")
    public final String googlePayGatewayMerchantId;

    @C09CT("host")
    public final String host;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("need_mock")
    public final boolean needMock;

    @C09CT("partner_platform")
    public final String partnerPlatform;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutPipoRefreshParamsConfig)) {
            return false;
        }
        CheckoutPipoRefreshParamsConfig checkoutPipoRefreshParamsConfig = (CheckoutPipoRefreshParamsConfig) obj;
        return Intrinsics.LJFF(this.host, checkoutPipoRefreshParamsConfig.host) && Intrinsics.LJFF(this.merchantId, checkoutPipoRefreshParamsConfig.merchantId) && Intrinsics.LJFF(this.countryOrRegion, checkoutPipoRefreshParamsConfig.countryOrRegion) && Intrinsics.LJFF(this.currency, checkoutPipoRefreshParamsConfig.currency) && Intrinsics.LJFF(this.partnerPlatform, checkoutPipoRefreshParamsConfig.partnerPlatform) && Intrinsics.LJFF(this.googlePayGateway, checkoutPipoRefreshParamsConfig.googlePayGateway) && Intrinsics.LJFF(this.googlePayGatewayMerchantId, checkoutPipoRefreshParamsConfig.googlePayGatewayMerchantId) && this.needMock == checkoutPipoRefreshParamsConfig.needMock && this.forceFilterGooglePay == checkoutPipoRefreshParamsConfig.forceFilterGooglePay && this.amountInCents == checkoutPipoRefreshParamsConfig.amountInCents;
    }

    public final int hashCode() {
        return (((((((((((((((((this.host.hashCode() * 31) + this.merchantId.hashCode()) * 31) + this.countryOrRegion.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.partnerPlatform.hashCode()) * 31) + this.googlePayGateway.hashCode()) * 31) + this.googlePayGatewayMerchantId.hashCode()) * 31) + C786410Ut5.Z2(this.needMock)) * 31) + C786410Ut5.Z2(this.forceFilterGooglePay)) * 31) + this.amountInCents;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutPipoRefreshParamsConfig(host=");
        sbLIZ.append(this.host);
        sbLIZ.append(", merchantId=");
        sbLIZ.append(this.merchantId);
        sbLIZ.append(", countryOrRegion=");
        sbLIZ.append(this.countryOrRegion);
        sbLIZ.append(", currency=");
        sbLIZ.append(this.currency);
        sbLIZ.append(", partnerPlatform=");
        sbLIZ.append(this.partnerPlatform);
        sbLIZ.append(", googlePayGateway=");
        sbLIZ.append(this.googlePayGateway);
        sbLIZ.append(", googlePayGatewayMerchantId=");
        sbLIZ.append(this.googlePayGatewayMerchantId);
        sbLIZ.append(", needMock=");
        sbLIZ.append(this.needMock);
        sbLIZ.append(", forceFilterGooglePay=");
        sbLIZ.append(this.forceFilterGooglePay);
        sbLIZ.append(", amountInCents=");
        sbLIZ.append(this.amountInCents);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CheckoutPipoRefreshParamsConfig() {
        this("https://fp.pipopayment.us", "11202604Z52Pf1", "US", "USD", "shopify", "shopify", "99477586196", false, true, 1);
    }

    public CheckoutPipoRefreshParamsConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, int i) {
        this.host = str;
        this.merchantId = str2;
        this.countryOrRegion = str3;
        this.currency = str4;
        this.partnerPlatform = str5;
        this.googlePayGateway = str6;
        this.googlePayGatewayMerchantId = str7;
        this.needMock = z;
        this.forceFilterGooglePay = z2;
        this.amountInCents = i;
    }
}
