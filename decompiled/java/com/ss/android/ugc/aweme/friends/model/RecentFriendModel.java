package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.mention.model.MentionCheckResult;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RecentFriendModel extends BaseResponse {

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("user_list")
    public final List<User> users = new ArrayList();

    @C09CT("block_results")
    public final List<MentionCheckResult> blockResults = new ArrayList();

    public final List<MentionCheckResult> getBlockResults() {
        return this.blockResults;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<User> getUsers() {
        return this.users;
    }
}
