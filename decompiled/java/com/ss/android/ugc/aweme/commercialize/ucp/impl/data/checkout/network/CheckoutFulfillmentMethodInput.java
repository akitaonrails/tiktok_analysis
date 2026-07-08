package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutFulfillmentMethodInput {

    @C09CT("destinations")
    public final List<CheckoutDestinationInput> destinations;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("line_item_ids")
    public final List<String> lineItemIDs;

    @C09CT("type")
    public final String type;

    public CheckoutFulfillmentMethodInput() {
        this(null, null, null, null);
    }

    public CheckoutFulfillmentMethodInput(String str, String str2, List<CheckoutDestinationInput> list, List<String> list2) {
        this.id = str;
        this.type = str2;
        this.destinations = list;
        this.lineItemIDs = list2;
    }
}
