package com.ss.android.ugc.aweme.detail.repo;

import X.C09CT;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class BatchEntry {

    @C09CT("cursor")
    public final String cursor;

    @C09CT("data")
    public final List<FollowFeed> data;

    @C09CT("has_more")
    public final Integer hasMore;

    @C09CT("level")
    public final Integer level;

    @C09CT("live")
    public final FollowFeed live;

    /* JADX WARN: Multi-variable type inference failed */
    public BatchEntry(String str, Integer num, Integer num2, List<? extends FollowFeed> list, FollowFeed followFeed) {
        this.cursor = str;
        this.level = num;
        this.hasMore = num2;
        this.data = list;
        this.live = followFeed;
    }
}
