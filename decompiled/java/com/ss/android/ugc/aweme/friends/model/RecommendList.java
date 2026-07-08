package com.ss.android.ugc.aweme.friends.model;

import X.C086I;
import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.follow.recommend.follow.repo.RecommendFollowStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RecommendList extends BaseResponse implements Serializable {

    @C09CT("cursor")
    public int cursor;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("inviters")
    public List<User> inviterList;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("new_user_count")
    public int newUserCount;

    @C09CT("user_extra_list")
    public List<RecommendFollowStruct> recommendFollowList;

    @C09CT("rid")
    public String rid;

    @C09CT("total")
    public int totalCount;

    @C09CT("user_list")
    public List<User> userList;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RecommendList m204clone() {
        RecommendList recommendList = new RecommendList();
        ArrayList arrayList = new ArrayList();
        if (!C086I.LIZIZ(this.userList)) {
            for (User user : this.userList) {
                if (user != null) {
                    arrayList.add(user.m307clone());
                }
            }
        }
        recommendList.userList = arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (!C086I.LIZIZ(this.recommendFollowList)) {
            for (RecommendFollowStruct recommendFollowStruct : this.recommendFollowList) {
                if (recommendFollowStruct != null) {
                    arrayList2.add(recommendFollowStruct.clone());
                }
            }
        }
        recommendList.recommendFollowList = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        if (!C086I.LIZIZ(this.inviterList)) {
            for (User user2 : this.inviterList) {
                if (user2 != null) {
                    arrayList3.add(user2.m307clone());
                }
            }
        }
        recommendList.inviterList = arrayList3;
        recommendList.rid = this.rid;
        recommendList.cursor = this.cursor;
        recommendList.hasMore = this.hasMore;
        recommendList.totalCount = this.totalCount;
        recommendList.newUserCount = this.newUserCount;
        recommendList.extra = this.extra;
        recommendList.status_code = this.status_code;
        recommendList.status_msg = this.status_msg;
        recommendList.error_code = this.error_code;
        recommendList.logPb = this.logPb;
        return recommendList;
    }

    public List<User> getInviterList() {
        if (this.inviterList == null) {
            this.inviterList = new ArrayList(0);
        }
        return this.inviterList;
    }

    public List<User> getUserList() {
        if (this.userList == null) {
            this.userList = new ArrayList(0);
        }
        return this.userList;
    }

    public int getCursor() {
        return this.cursor;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public int getNewUserCount() {
        return this.newUserCount;
    }

    public List<RecommendFollowStruct> getRecommendFollowList() {
        return this.recommendFollowList;
    }

    public String getRid() {
        return this.rid;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setInviterList(List<User> list) {
        this.inviterList = list;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setRecommendFollowList(List<RecommendFollowStruct> list) {
        this.recommendFollowList = list;
    }

    public void setRid(String str) {
        this.rid = str;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }

    public void setUserList(List<User> list) {
        this.userList = list;
    }
}
