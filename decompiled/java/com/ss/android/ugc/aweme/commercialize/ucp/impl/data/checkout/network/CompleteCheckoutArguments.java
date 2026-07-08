package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes5.dex */
public final class CompleteCheckoutArguments {

    @C09CT("checkout")
    public final CompleteCheckoutInput checkout;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("meta")
    public final CreateCheckoutMeta meta;

    public CompleteCheckoutArguments(String str, CreateCheckoutMeta createCheckoutMeta, CompleteCheckoutInput completeCheckoutInput) {
        this.id = str;
        this.meta = createCheckoutMeta;
        this.checkout = completeCheckoutInput;
    }
}
