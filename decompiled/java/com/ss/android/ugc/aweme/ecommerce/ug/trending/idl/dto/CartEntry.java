package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class CartEntry implements Serializable {

    @C09CT("item_count")
    public final Integer itemCount;

    @C09CT("link")
    public final String link;

    public CartEntry() {
        this(null, null);
    }

    public CartEntry(String str, Integer num) {
        this.link = str;
        this.itemCount = num;
    }
}
