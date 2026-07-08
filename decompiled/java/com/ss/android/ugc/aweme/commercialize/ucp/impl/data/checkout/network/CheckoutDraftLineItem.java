package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutDraftLineItem {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("item")
    public final CheckoutDraftItem item;

    @C09CT("quantity")
    public final Integer quantity;

    public CheckoutDraftLineItem() {
        this(null, null, null);
    }

    public CheckoutDraftLineItem(String str, Integer num, CheckoutDraftItem checkoutDraftItem) {
        this.id = str;
        this.quantity = num;
        this.item = checkoutDraftItem;
    }
}
