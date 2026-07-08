package com.ss.android.ugc.aweme.rss.api.models;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class GetRssFeedResponse {

    @C09CT("status_msg")
    public final String msg;

    @C09CT("next_page_token")
    public final String nextPageToken;

    @C09CT("rss_feed")
    public final RssFeed rssFeed;

    @C09CT("status_code")
    public final int statusCode;

    public GetRssFeedResponse(int i, String str, RssFeed rssFeed, String str2) {
        this.statusCode = i;
        this.msg = str;
        this.rssFeed = rssFeed;
        this.nextPageToken = str2;
    }
}
