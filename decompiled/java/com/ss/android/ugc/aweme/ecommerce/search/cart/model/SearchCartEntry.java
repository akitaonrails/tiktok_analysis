package com.ss.android.ugc.aweme.ecommerce.search.cart.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCartEntry {

    @C09CT("code")
    public final Long code;

    @C09CT("item_count")
    public final Integer itemCount;

    @C09CT("message")
    public final String msg;

    @C09CT("cart_entry_schema")
    public final String schema;

    public SearchCartEntry() {
        this(null, null, null, null);
    }

    public SearchCartEntry(Long l, String str, String str2, Integer num) {
        this.code = l;
        this.msg = str;
        this.schema = str2;
        this.itemCount = num;
    }
}
