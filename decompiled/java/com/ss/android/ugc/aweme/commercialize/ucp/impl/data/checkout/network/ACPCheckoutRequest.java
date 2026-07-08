package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ACPCheckoutRequest {

    @C09CT("buyer")
    public final CheckoutBuyerInput buyer;

    @C09CT("checkout_id")
    public final String checkoutId;

    @C09CT("currency")
    public final String currency;

    @C09CT("discounts")
    public final CheckoutDiscountsInput discounts;

    @C09CT("fulfillment")
    public final CheckoutFulfillmentInput fulfillment;

    @C09CT("line_items")
    public final List<CheckoutDraftLineItem> lineItems;

    @C09CT("payment")
    public final CompleteCheckoutPaymentInput payment;

    @C09CT("pipo_fp_request")
    public final ACPPipoFpRequest pipoFpRequest;

    @C09CT("risk_info")
    public final String riskInfo;

    @C09CT("seller_profile_id")
    public final String sellerProfileId;

    @C09CT("tiktok_order_id")
    public final Long tiktokOrderId;

    public ACPCheckoutRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ACPCheckoutRequest)) {
            return false;
        }
        ACPCheckoutRequest aCPCheckoutRequest = (ACPCheckoutRequest) obj;
        return Intrinsics.LJFF(this.tiktokOrderId, aCPCheckoutRequest.tiktokOrderId) && Intrinsics.LJFF(this.checkoutId, aCPCheckoutRequest.checkoutId) && Intrinsics.LJFF(this.currency, aCPCheckoutRequest.currency) && Intrinsics.LJFF(this.sellerProfileId, aCPCheckoutRequest.sellerProfileId) && Intrinsics.LJFF(this.lineItems, aCPCheckoutRequest.lineItems) && Intrinsics.LJFF(this.buyer, aCPCheckoutRequest.buyer) && Intrinsics.LJFF(this.fulfillment, aCPCheckoutRequest.fulfillment) && Intrinsics.LJFF(this.payment, aCPCheckoutRequest.payment) && Intrinsics.LJFF(this.discounts, aCPCheckoutRequest.discounts) && Intrinsics.LJFF(this.riskInfo, aCPCheckoutRequest.riskInfo) && Intrinsics.LJFF(this.pipoFpRequest, aCPCheckoutRequest.pipoFpRequest);
    }

    public final int hashCode() {
        Long l = this.tiktokOrderId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.checkoutId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sellerProfileId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<CheckoutDraftLineItem> list = this.lineItems;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        CheckoutBuyerInput checkoutBuyerInput = this.buyer;
        int iHashCode6 = (iHashCode5 + (checkoutBuyerInput == null ? 0 : checkoutBuyerInput.hashCode())) * 31;
        CheckoutFulfillmentInput checkoutFulfillmentInput = this.fulfillment;
        int iHashCode7 = (iHashCode6 + (checkoutFulfillmentInput == null ? 0 : checkoutFulfillmentInput.hashCode())) * 31;
        CompleteCheckoutPaymentInput completeCheckoutPaymentInput = this.payment;
        int iHashCode8 = (iHashCode7 + (completeCheckoutPaymentInput == null ? 0 : completeCheckoutPaymentInput.hashCode())) * 31;
        CheckoutDiscountsInput checkoutDiscountsInput = this.discounts;
        int iHashCode9 = (iHashCode8 + (checkoutDiscountsInput == null ? 0 : checkoutDiscountsInput.hashCode())) * 31;
        String str4 = this.riskInfo;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ACPPipoFpRequest aCPPipoFpRequest = this.pipoFpRequest;
        return iHashCode10 + (aCPPipoFpRequest != null ? aCPPipoFpRequest.hashCode() : 0);
    }

    public final String toString() {
        return "ACPCheckoutRequest(tiktokOrderId=" + this.tiktokOrderId + ", checkoutId=" + this.checkoutId + ", currency=" + this.currency + ", sellerProfileId=" + this.sellerProfileId + ", lineItems=" + this.lineItems + ", buyer=" + this.buyer + ", fulfillment=" + this.fulfillment + ", payment=" + this.payment + ", discounts=" + this.discounts + ", riskInfo=" + this.riskInfo + ", pipoFpRequest=" + this.pipoFpRequest + ')';
    }

    public ACPCheckoutRequest(Long l, String str, String str2, String str3, List<CheckoutDraftLineItem> list, CheckoutBuyerInput checkoutBuyerInput, CheckoutFulfillmentInput checkoutFulfillmentInput, CompleteCheckoutPaymentInput completeCheckoutPaymentInput, CheckoutDiscountsInput checkoutDiscountsInput, String str4, ACPPipoFpRequest aCPPipoFpRequest) {
        this.tiktokOrderId = l;
        this.checkoutId = str;
        this.currency = str2;
        this.sellerProfileId = str3;
        this.lineItems = list;
        this.buyer = checkoutBuyerInput;
        this.fulfillment = checkoutFulfillmentInput;
        this.payment = completeCheckoutPaymentInput;
        this.discounts = checkoutDiscountsInput;
        this.riskInfo = str4;
        this.pipoFpRequest = aCPPipoFpRequest;
    }
}
