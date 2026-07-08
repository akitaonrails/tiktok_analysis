package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class CartEntry {

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
