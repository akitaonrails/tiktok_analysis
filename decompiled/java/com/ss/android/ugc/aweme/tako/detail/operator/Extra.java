package com.ss.android.ugc.aweme.tako.detail.operator;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Extra {

    @C09CT("fatal_item_ids")
    public final List<String> fatalItemIds;

    @C09CT("inner_search_id")
    public final String innerSearchId;

    @C09CT("logid")
    public final String logId;

    @C09CT("now")
    public final long now;

    public Extra(long j, String str, List<String> list, String str2) {
        this.now = j;
        this.logId = str;
        this.fatalItemIds = list;
        this.innerSearchId = str2;
    }
}
