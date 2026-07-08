package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutBuyer;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutDiscounts;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutFulfillment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutLineItem;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutOrder;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutPayment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutTotal;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.UcpMessage;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ACPCheckoutSessionPayload {

    @C09CT("buyer")
    public final CheckoutBuyer buyer;

    @C09CT("checkout_id")
    public final String checkoutId;

    @C09CT("continue_url")
    public final String continueUrl;

    @C09CT("currency")
    public final String currency;

    @C09CT("discounts")
    public final CheckoutDiscounts discounts;

    @C09CT("expires_at")
    public final String expiresAt;

    @C09CT("fulfillment")
    public final CheckoutFulfillment fulfillment;

    @C09CT("line_items")
    public final List<CheckoutLineItem> lineItems;

    @C09CT("links")
    public final List<Object> links;

    @C09CT("messages")
    public final List<UcpMessage> messages;

    @C09CT("order")
    public final CheckoutOrder order;

    @C09CT("payment")
    public final CheckoutPayment payment;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    @C09CT("totals")
    public final List<CheckoutTotal> totals;

    public ACPCheckoutSessionPayload() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ACPCheckoutSessionPayload)) {
            return false;
        }
        ACPCheckoutSessionPayload aCPCheckoutSessionPayload = (ACPCheckoutSessionPayload) obj;
        return Intrinsics.LJFF(this.checkoutId, aCPCheckoutSessionPayload.checkoutId) && Intrinsics.LJFF(this.currency, aCPCheckoutSessionPayload.currency) && Intrinsics.LJFF(this.buyer, aCPCheckoutSessionPayload.buyer) && Intrinsics.LJFF(this.lineItems, aCPCheckoutSessionPayload.lineItems) && Intrinsics.LJFF(this.discounts, aCPCheckoutSessionPayload.discounts) && Intrinsics.LJFF(this.totals, aCPCheckoutSessionPayload.totals) && Intrinsics.LJFF(this.fulfillment, aCPCheckoutSessionPayload.fulfillment) && Intrinsics.LJFF(this.expiresAt, aCPCheckoutSessionPayload.expiresAt) && Intrinsics.LJFF(this.links, aCPCheckoutSessionPayload.links) && Intrinsics.LJFF(this.payment, aCPCheckoutSessionPayload.payment) && Intrinsics.LJFF(this.order, aCPCheckoutSessionPayload.order) && Intrinsics.LJFF(this.messages, aCPCheckoutSessionPayload.messages) && Intrinsics.LJFF(this.status, aCPCheckoutSessionPayload.status) && Intrinsics.LJFF(this.continueUrl, aCPCheckoutSessionPayload.continueUrl);
    }

    public final int hashCode() {
        String str = this.checkoutId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CheckoutBuyer checkoutBuyer = this.buyer;
        int iHashCode3 = (iHashCode2 + (checkoutBuyer == null ? 0 : checkoutBuyer.hashCode())) * 31;
        List<CheckoutLineItem> list = this.lineItems;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        CheckoutDiscounts checkoutDiscounts = this.discounts;
        int iHashCode5 = (iHashCode4 + (checkoutDiscounts == null ? 0 : checkoutDiscounts.hashCode())) * 31;
        List<CheckoutTotal> list2 = this.totals;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CheckoutFulfillment checkoutFulfillment = this.fulfillment;
        int iHashCode7 = (iHashCode6 + (checkoutFulfillment == null ? 0 : checkoutFulfillment.hashCode())) * 31;
        String str3 = this.expiresAt;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Object> list3 = this.links;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        CheckoutPayment checkoutPayment = this.payment;
        int iHashCode10 = (iHashCode9 + (checkoutPayment == null ? 0 : checkoutPayment.hashCode())) * 31;
        CheckoutOrder checkoutOrder = this.order;
        int iHashCode11 = (iHashCode10 + (checkoutOrder == null ? 0 : checkoutOrder.hashCode())) * 31;
        List<UcpMessage> list4 = this.messages;
        int iHashCode12 = (iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str4 = this.status;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.continueUrl;
        return iHashCode13 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "ACPCheckoutSessionPayload(checkoutId=" + this.checkoutId + ", currency=" + this.currency + ", buyer=" + this.buyer + ", lineItems=" + this.lineItems + ", discounts=" + this.discounts + ", totals=" + this.totals + ", fulfillment=" + this.fulfillment + ", expiresAt=" + this.expiresAt + ", links=" + this.links + ", payment=" + this.payment + ", order=" + this.order + ", messages=" + this.messages + ", status=" + this.status + ", continueUrl=" + this.continueUrl + ')';
    }

    public ACPCheckoutSessionPayload(String str, String str2, CheckoutBuyer checkoutBuyer, List<CheckoutLineItem> list, CheckoutDiscounts checkoutDiscounts, List<CheckoutTotal> list2, CheckoutFulfillment checkoutFulfillment, String str3, List<Object> list3, CheckoutPayment checkoutPayment, CheckoutOrder checkoutOrder, List<UcpMessage> list4, String str4, String str5) {
        this.checkoutId = str;
        this.currency = str2;
        this.buyer = checkoutBuyer;
        this.lineItems = list;
        this.discounts = checkoutDiscounts;
        this.totals = list2;
        this.fulfillment = checkoutFulfillment;
        this.expiresAt = str3;
        this.links = list3;
        this.payment = checkoutPayment;
        this.order = checkoutOrder;
        this.messages = list4;
        this.status = str4;
        this.continueUrl = str5;
    }
}
