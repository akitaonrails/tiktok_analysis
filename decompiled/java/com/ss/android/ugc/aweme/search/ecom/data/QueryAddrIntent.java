package com.ss.android.ugc.aweme.search.ecom.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class QueryAddrIntent implements Serializable {

    @C09CT("query_addr_intent")
    public final Boolean addrIntent;

    @C09CT("query_addr_intent_creator")
    public final Boolean creatorIntent;

    @C09CT("query_addr_intent_shop")
    public final Boolean shopIntent;

    public QueryAddrIntent() {
        this(null, null, null);
    }

    public QueryAddrIntent(Boolean bool, Boolean bool2, Boolean bool3) {
        this.addrIntent = bool;
        this.creatorIntent = bool2;
        this.shopIntent = bool3;
    }
}
