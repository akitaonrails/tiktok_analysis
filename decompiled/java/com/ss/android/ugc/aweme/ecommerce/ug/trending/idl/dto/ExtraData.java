package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class ExtraData implements Serializable {

    @C09CT("cart_entry")
    public final CartEntry cartEntry;

    @C09CT("style")
    public final String style;

    public ExtraData() {
        this(null, null);
    }

    public ExtraData(String str, CartEntry cartEntry) {
        this.style = str;
        this.cartEntry = cartEntry;
    }
}
