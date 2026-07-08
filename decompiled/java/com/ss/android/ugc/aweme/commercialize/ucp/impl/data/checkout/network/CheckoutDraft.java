package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import X.C333990D7l;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutDraft {

    @C09CT("buyer")
    public final CheckoutBuyerInput buyer;

    @C09CT("context")
    public final CheckoutContextInput context;

    @C09CT("currency")
    public final String currency;

    @C09CT("discounts")
    public final CheckoutDiscountsInput discounts;

    @C09CT("fulfillment")
    public final CheckoutFulfillmentInput fulfillment;

    @C09CT("line_items")
    public final List<CheckoutDraftLineItem> lineItems;

    @C09CT("payment")
    public final C333990D7l payment;

    public CheckoutDraft(String str, List<CheckoutDraftLineItem> list, CheckoutDiscountsInput checkoutDiscountsInput, CheckoutBuyerInput checkoutBuyerInput, CheckoutFulfillmentInput checkoutFulfillmentInput, C333990D7l c333990D7l, CheckoutContextInput checkoutContextInput) {
        this.currency = str;
        this.lineItems = list;
        this.discounts = checkoutDiscountsInput;
        this.buyer = checkoutBuyerInput;
        this.fulfillment = checkoutFulfillmentInput;
        this.payment = c333990D7l;
        this.context = checkoutContextInput;
    }
}
