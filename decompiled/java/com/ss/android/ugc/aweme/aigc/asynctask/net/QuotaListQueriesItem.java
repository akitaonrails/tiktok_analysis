package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class QuotaListQueriesItem {

    @C09CT("req_keys")
    public final List<String> reqKeys;

    @C09CT("scope")
    public final Scope scope;

    public QuotaListQueriesItem() {
        this(null, null);
    }

    public QuotaListQueriesItem(Scope scope, List<String> list) {
        this.scope = scope;
        this.reqKeys = list;
    }
}
