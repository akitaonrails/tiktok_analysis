package com.ss.android.ugc.aweme.rss.api.models;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class GetRssUserResponse {

    @C09CT("status_msg")
    public final String msg;

    @C09CT("rss_feeds")
    public final List<Rss> rssFeed;

    @C09CT("status_code")
    public final int statusCode;

    public GetRssUserResponse(int i, String str, List<Rss> list) {
        this.statusCode = i;
        this.msg = str;
        this.rssFeed = list;
    }
}
