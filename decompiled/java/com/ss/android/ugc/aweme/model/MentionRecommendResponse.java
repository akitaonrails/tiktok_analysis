package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class MentionRecommendResponse extends BaseResponse {

    @C09CT("block_results")
    public final List<MentionCheckResult> blockResults = C13BV.INSTANCE;

    @C09CT("following_user_list")
    public final UserListWithPagination followingUserList;

    @C09CT("friend_user_list")
    public final UserListWithPagination friendUserList;

    @C09CT("after_publish_mentioned_user_list")
    public final UserListWithPagination mentionedUserList;

    @C09CT("recent_user_list")
    public final UserListWithPagination recentUserList;

    @C09CT("custom_sorted_user_list")
    public final UserListWithPagination sortedUserList;
}
