package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class QuotaListTaskBody {

    @C09CT("quota_queries")
    public final List<QuotaListQueriesItem> quotaQueries;

    public QuotaListTaskBody() {
        this(null);
    }

    public QuotaListTaskBody(List<QuotaListQueriesItem> list) {
        this.quotaQueries = list;
    }
}
