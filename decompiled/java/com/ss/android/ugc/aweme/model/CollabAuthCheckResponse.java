package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes25.dex */
public final class CollabAuthCheckResponse extends BaseResponse {

    @C09CT("follower_count_threshold")
    public final Long followerCountThreshold;

    @C09CT("history_follower_count")
    public final long historyFollowerCount;

    @C09CT("month_post_count")
    public final long monthPostCount;

    @C09CT("month_post_limit")
    public final Long monthPostLimit;
}
