package com.ss.android.ugc.aweme.service;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes25.dex */
public final class Response {

    @C09CT("friend_feed_data")
    public ArrayList<String> friendFeedData;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("last_view_item_id")
    public final String lastViewItemId;

    @C09CT("page_token")
    public final String pageToken;

    @C09CT("preload")
    public final int preload;

    @C09CT("source")
    public final int source;

    public Response() {
        this(0, false, null, "", "", 0, "");
    }

    public Response(int i, boolean z, ArrayList<String> arrayList, String str, String str2, int i2, String str3) {
        this.source = i;
        this.hasMore = z;
        this.friendFeedData = arrayList;
        this.lastViewItemId = str;
        this.pageToken = str2;
        this.preload = i2;
    }
}
