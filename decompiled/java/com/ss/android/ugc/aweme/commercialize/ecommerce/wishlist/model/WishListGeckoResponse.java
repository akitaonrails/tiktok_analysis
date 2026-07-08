package com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class WishListGeckoResponse implements Serializable {

    @C09CT("lynx_schema")
    public final LynxSchema lynxSchema;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public WishListGeckoResponse(int i, String str, LynxSchema lynxSchema) {
        this.statusCode = i;
        this.statusMsg = str;
        this.lynxSchema = lynxSchema;
    }
}
