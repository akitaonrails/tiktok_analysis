package com.ss.android.ugc.aweme.now;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UserNowPost implements Serializable {

    @C09CT("collection_type")
    public final Integer collectionType;

    @C09CT("has_more_after")
    public final Boolean hasMoreAfter;

    @C09CT("has_more_before")
    public final Boolean hasMoreBefore;

    @C09CT("next_cursor")
    public final Long nextCursor;

    @C09CT("now_posts")
    public List<Aweme> nowPosts;

    @C09CT("position")
    public final Integer position;

    @C09CT("pre_cursor")
    public final Long preCursor;

    @C09CT("total_count")
    public final Integer totalCount;

    public UserNowPost() {
        this(null, null, null, null, null, null, null, null);
    }

    public final void setNowPosts(List<Aweme> list) {
        this.nowPosts = list;
    }

    public UserNowPost(List<Aweme> list, Integer num, Long l, Long l2, Boolean bool, Boolean bool2, Integer num2, Integer num3) {
        this.nowPosts = list;
        this.totalCount = num;
        this.nextCursor = l;
        this.preCursor = l2;
        this.hasMoreBefore = bool;
        this.hasMoreAfter = bool2;
        this.position = num2;
        this.collectionType = num3;
    }
}
