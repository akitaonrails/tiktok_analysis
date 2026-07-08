package com.ss.android.ugc.aweme.tako.personalization;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class SearchHistorySignal {

    @C09CT("keyword")
    public final String keyword;

    @C09CT("query_source")
    public final String source;

    @C09CT("time")
    public final long time;

    public SearchHistorySignal() {
        this("", 0L, "");
    }

    public SearchHistorySignal(String str, long j, String str2) {
        this.keyword = str;
        this.time = j;
        this.source = str2;
    }
}
