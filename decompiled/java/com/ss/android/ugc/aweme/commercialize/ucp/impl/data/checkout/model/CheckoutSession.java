package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model;

import X.C09CT;
import X.C0D6J;
import X.C0D6K;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutSession implements Serializable {

    @C09CT("checkout_status")
    public final int _checkoutState;

    @C09CT("buyer")
    public final CheckoutBuyer buyer;

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

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("checkout_create_time")
    public final Long lastCreatAtTime;

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

    @C09CT("ucp")
    public final Object ucp;

    public CheckoutSession() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, C0D6J.NORMAL.getRawValue(), null);
    }

    public final CheckoutSession copy(Object obj, String str, String str2, CheckoutBuyer checkoutBuyer, List<CheckoutLineItem> list, CheckoutDiscounts checkoutDiscounts, List<CheckoutTotal> list2, CheckoutFulfillment checkoutFulfillment, String str3, List<Object> list3, CheckoutPayment checkoutPayment, CheckoutOrder checkoutOrder, List<UcpMessage> list4, String str4, String str5, int i, Long l) {
        return new CheckoutSession(obj, str, str2, checkoutBuyer, list, checkoutDiscounts, list2, checkoutFulfillment, str3, list3, checkoutPayment, checkoutOrder, list4, str4, str5, i, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutSession)) {
            return false;
        }
        CheckoutSession checkoutSession = (CheckoutSession) obj;
        return Intrinsics.LJFF(this.ucp, checkoutSession.ucp) && Intrinsics.LJFF(this.id, checkoutSession.id) && Intrinsics.LJFF(this.currency, checkoutSession.currency) && Intrinsics.LJFF(this.buyer, checkoutSession.buyer) && Intrinsics.LJFF(this.lineItems, checkoutSession.lineItems) && Intrinsics.LJFF(this.discounts, checkoutSession.discounts) && Intrinsics.LJFF(this.totals, checkoutSession.totals) && Intrinsics.LJFF(this.fulfillment, checkoutSession.fulfillment) && Intrinsics.LJFF(this.expiresAt, checkoutSession.expiresAt) && Intrinsics.LJFF(this.links, checkoutSession.links) && Intrinsics.LJFF(this.payment, checkoutSession.payment) && Intrinsics.LJFF(this.order, checkoutSession.order) && Intrinsics.LJFF(this.messages, checkoutSession.messages) && Intrinsics.LJFF(this.status, checkoutSession.status) && Intrinsics.LJFF(this.continueUrl, checkoutSession.continueUrl) && this._checkoutState == checkoutSession._checkoutState && Intrinsics.LJFF(this.lastCreatAtTime, checkoutSession.lastCreatAtTime);
    }

    public int hashCode() {
        Object obj = this.ucp;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CheckoutBuyer checkoutBuyer = this.buyer;
        int iHashCode4 = (iHashCode3 + (checkoutBuyer == null ? 0 : checkoutBuyer.hashCode())) * 31;
        List<CheckoutLineItem> list = this.lineItems;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        CheckoutDiscounts checkoutDiscounts = this.discounts;
        int iHashCode6 = (iHashCode5 + (checkoutDiscounts == null ? 0 : checkoutDiscounts.hashCode())) * 31;
        List<CheckoutTotal> list2 = this.totals;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CheckoutFulfillment checkoutFulfillment = this.fulfillment;
        int iHashCode8 = (iHashCode7 + (checkoutFulfillment == null ? 0 : checkoutFulfillment.hashCode())) * 31;
        String str3 = this.expiresAt;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Object> list3 = this.links;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        CheckoutPayment checkoutPayment = this.payment;
        int iHashCode11 = (iHashCode10 + (checkoutPayment == null ? 0 : checkoutPayment.hashCode())) * 31;
        CheckoutOrder checkoutOrder = this.order;
        int iHashCode12 = (iHashCode11 + (checkoutOrder == null ? 0 : checkoutOrder.hashCode())) * 31;
        List<UcpMessage> list4 = this.messages;
        int iHashCode13 = (iHashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str4 = this.status;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.continueUrl;
        int iHashCode15 = (((iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31) + this._checkoutState) * 31;
        Long l = this.lastCreatAtTime;
        return iHashCode15 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "CheckoutSession(ucp=" + this.ucp + ", id=" + this.id + ", currency=" + this.currency + ", buyer=" + this.buyer + ", lineItems=" + this.lineItems + ", discounts=" + this.discounts + ", totals=" + this.totals + ", fulfillment=" + this.fulfillment + ", expiresAt=" + this.expiresAt + ", links=" + this.links + ", payment=" + this.payment + ", order=" + this.order + ", messages=" + this.messages + ", status=" + this.status + ", continueUrl=" + this.continueUrl + ", _checkoutState=" + this._checkoutState + ", lastCreatAtTime=" + this.lastCreatAtTime + ')';
    }

    public final C0D6J getCheckoutState() {
        C0D6K c0d6k = C0D6J.Companion;
        int i = this._checkoutState;
        c0d6k.getClass();
        C0D6J c0d6jLIZ = C0D6K.LIZ(i);
        return c0d6jLIZ == null ? C0D6J.NORMAL : c0d6jLIZ;
    }

    public CheckoutSession(Object obj, String str, String str2, CheckoutBuyer checkoutBuyer, List<CheckoutLineItem> list, CheckoutDiscounts checkoutDiscounts, List<CheckoutTotal> list2, CheckoutFulfillment checkoutFulfillment, String str3, List<Object> list3, CheckoutPayment checkoutPayment, CheckoutOrder checkoutOrder, List<UcpMessage> list4, String str4, String str5, int i, Long l) {
        this.ucp = obj;
        this.id = str;
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
        this._checkoutState = i;
        this.lastCreatAtTime = l;
    }
}
