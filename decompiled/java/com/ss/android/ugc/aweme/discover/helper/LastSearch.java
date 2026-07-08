package com.ss.android.ugc.aweme.discover.helper;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class LastSearch {

    @C09CT("channel")
    public final String channel;

    @C09CT("query")
    public final String query;

    @C09CT("search_id")
    public final String search_id;

    @C09CT("source")
    public final String source;

    @C09CT("tag_timestamp")
    public final Long tag_timestamp;

    @C09CT("time")
    public final Long time;

    public LastSearch() {
        this("", "", "", "", 0L, 0L);
    }

    public LastSearch(String str, String str2, String str3, String str4, Long l, Long l2) {
        this.query = str;
        this.search_id = str2;
        this.channel = str3;
        this.source = str4;
        this.time = l;
        this.tag_timestamp = l2;
    }
}
