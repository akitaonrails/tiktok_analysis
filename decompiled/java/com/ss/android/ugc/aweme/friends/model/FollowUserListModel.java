package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FollowUserListModel extends BaseResponse {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("min_time")
    public long maxTime;

    @C09CT("max_time")
    public long minTime;

    @C09CT("followings")
    public List<User> users;

    public long getMaxTime() {
        return this.maxTime;
    }

    public long getMinTime() {
        return this.minTime;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setMaxTime(long j) {
        this.maxTime = j;
    }

    public void setMinTime(long j) {
        this.minTime = j;
    }

    public void setUsers(List<User> list) {
        this.users = list;
    }
}
