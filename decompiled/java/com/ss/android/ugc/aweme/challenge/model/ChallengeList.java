package com.ss.android.ugc.aweme.challenge.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class ChallengeList extends BaseResponse {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("is_match")
    public boolean isMatch;

    @C09CT("challenge_list")
    public List<Challenge> items;

    @C09CT("max_cursor")
    public long maxCursor;

    @C09CT("min_cursor")
    public long minCursor;

    public List<Challenge> getItems() {
        return this.items;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public boolean isMatch() {
        return this.isMatch;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setItems(List<Challenge> list) {
        this.items = list;
    }

    public void setMatch(boolean z) {
        this.isMatch = z;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }
}
