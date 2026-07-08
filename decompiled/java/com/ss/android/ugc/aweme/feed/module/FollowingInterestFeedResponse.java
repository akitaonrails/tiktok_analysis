package com.ss.android.ugc.aweme.feed.module;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class FollowingInterestFeedResponse implements Serializable {

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("status_code")
    public final int code;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("status_msg")
    public final String msg;

    @C09CT("next_cursor")
    public final int nextCursor;

    public FollowingInterestFeedResponse() {
        this(0, "", new ArrayList(), 0, true);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final int getCode() {
        return this.code;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final int getNextCursor() {
        return this.nextCursor;
    }

    public FollowingInterestFeedResponse(int i, String str, List<Aweme> list, int i2, boolean z) {
        this.code = i;
        this.msg = str;
        this.awemeList = list;
        this.nextCursor = i2;
        this.hasMore = z;
    }
}
