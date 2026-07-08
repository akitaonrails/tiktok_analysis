package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidCollectionPaymentResponse extends BaseResponse {

    @C09CT("biz_id")
    public final String bizId;

    @C09CT("credit_balance_usd")
    public final String creditBalanceUsd;

    @C09CT("iap_payload")
    public final String iapPayload;

    @C09CT("local_currency_code")
    public final String localCurrencyCode;

    @C09CT("local_currency_price")
    public final String localCurrencyPrice;

    @C09CT("local_currency_symbol")
    public final String localCurrencySymbol;

    @C09CT("order_id")
    public final String orderId;

    @C09CT("paid_content_order_id")
    public final String paidContentOrderId;

    @C09CT("payment_method")
    public final int paymentMethod;

    @C09CT("product_price_usd")
    public final String productPriceUsd;

    @C09CT("voucher_use_status")
    public final VoucherUseStatus voucherUseStatus;

    public PaidCollectionPaymentResponse() {
        this(0, "", "", "", "", "", "", VoucherUseStatus.NO_VOUCHER_USED, "", "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidCollectionPaymentResponse)) {
            return false;
        }
        PaidCollectionPaymentResponse paidCollectionPaymentResponse = (PaidCollectionPaymentResponse) obj;
        return this.paymentMethod == paidCollectionPaymentResponse.paymentMethod && Intrinsics.LJFF(this.creditBalanceUsd, paidCollectionPaymentResponse.creditBalanceUsd) && Intrinsics.LJFF(this.localCurrencyPrice, paidCollectionPaymentResponse.localCurrencyPrice) && Intrinsics.LJFF(this.localCurrencyCode, paidCollectionPaymentResponse.localCurrencyCode) && Intrinsics.LJFF(this.localCurrencySymbol, paidCollectionPaymentResponse.localCurrencySymbol) && Intrinsics.LJFF(this.productPriceUsd, paidCollectionPaymentResponse.productPriceUsd) && Intrinsics.LJFF(this.orderId, paidCollectionPaymentResponse.orderId) && this.voucherUseStatus == paidCollectionPaymentResponse.voucherUseStatus && Intrinsics.LJFF(this.bizId, paidCollectionPaymentResponse.bizId) && Intrinsics.LJFF(this.paidContentOrderId, paidCollectionPaymentResponse.paidContentOrderId) && Intrinsics.LJFF(this.iapPayload, paidCollectionPaymentResponse.iapPayload);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.paymentMethod * 31) + this.creditBalanceUsd.hashCode()) * 31) + this.localCurrencyPrice.hashCode()) * 31) + this.localCurrencyCode.hashCode()) * 31) + this.localCurrencySymbol.hashCode()) * 31) + this.productPriceUsd.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.voucherUseStatus.hashCode()) * 31) + this.bizId.hashCode()) * 31) + this.paidContentOrderId.hashCode()) * 31;
        String str = this.iapPayload;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "PaidCollectionPaymentResponse(paymentMethod=" + this.paymentMethod + ", creditBalanceUsd=" + this.creditBalanceUsd + ", localCurrencyPrice=" + this.localCurrencyPrice + ", localCurrencyCode=" + this.localCurrencyCode + ", localCurrencySymbol=" + this.localCurrencySymbol + ", productPriceUsd=" + this.productPriceUsd + ", orderId=" + this.orderId + ", voucherUseStatus=" + this.voucherUseStatus + ", bizId=" + this.bizId + ", paidContentOrderId=" + this.paidContentOrderId + ", iapPayload=" + this.iapPayload + ')';
    }

    public PaidCollectionPaymentResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, VoucherUseStatus voucherUseStatus, String str7, String str8, String str9) {
        this.paymentMethod = i;
        this.creditBalanceUsd = str;
        this.localCurrencyPrice = str2;
        this.localCurrencyCode = str3;
        this.localCurrencySymbol = str4;
        this.productPriceUsd = str5;
        this.orderId = str6;
        this.voucherUseStatus = voucherUseStatus;
        this.bizId = str7;
        this.paidContentOrderId = str8;
        this.iapPayload = str9;
    }
}
