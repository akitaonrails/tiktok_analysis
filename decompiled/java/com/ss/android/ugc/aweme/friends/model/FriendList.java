package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FriendList<T extends User> extends BaseResponse implements Serializable {

    @C09CT("cursor")
    public int cursor;

    @C09CT(alternate = {"user_list"}, value = "social_users")
    public List<? extends T> friends;

    @C09CT("has_more")
    public boolean isHasMore;

    @C09CT("log_pb")
    public LogPbBean logPbBean;

    @C09CT("register_count")
    public int registerCount;

    @C09CT("total_count")
    public int totalCount;

    @C09CT("type")
    public int type;

    @C09CT("unregistered_user")
    public List<UnRegisteredUser> unregisteredUser;

    public final int getCursor() {
        return this.cursor;
    }

    public final List<T> getFriends() {
        return this.friends;
    }

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public final int getRegisterCount() {
        return this.registerCount;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final int getType() {
        return this.type;
    }

    public final List<UnRegisteredUser> getUnregisteredUser() {
        return this.unregisteredUser;
    }

    public final boolean isHasMore() {
        return this.isHasMore;
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public final void setFriends(List<? extends T> list) {
        this.friends = list;
    }

    public final void setHasMore(boolean z) {
        this.isHasMore = z;
    }

    public final void setLogPbBean(LogPbBean logPbBean) {
        this.logPbBean = logPbBean;
    }

    public final void setRegisterCount(int i) {
        this.registerCount = i;
    }

    public final void setTotalCount(int i) {
        this.totalCount = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUnregisteredUser(List<UnRegisteredUser> list) {
        this.unregisteredUser = list;
    }
}
