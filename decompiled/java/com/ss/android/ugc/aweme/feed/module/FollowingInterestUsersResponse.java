package com.ss.android.ugc.aweme.feed.module;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingInterestUsersResponse implements Serializable {

    @C09CT("status_code")
    public final int code;

    @C09CT("ec_live_event_list")
    public final List<FollowingInterestUser> ecLiveEventList;

    @C09CT("first_vid")
    public final long firstVid;

    @C09CT("user_list")
    public final List<FollowingInterestUser> followingInterestUsers;

    @C09CT("log_pb")
    public final LogPbBean logPbBean;

    @C09CT("skylight_strategy")
    public final String skylightStrategy;

    @C09CT("video_num")
    public final int videoNum;

    public FollowingInterestUsersResponse() {
        this(0, new ArrayList(), new ArrayList(), 0, 0L, null, null);
    }

    public final int getCode() {
        return this.code;
    }

    public final List<FollowingInterestUser> getEcLiveEventList() {
        return this.ecLiveEventList;
    }

    public final long getFirstVid() {
        return this.firstVid;
    }

    public final List<FollowingInterestUser> getFollowingInterestUsers() {
        return this.followingInterestUsers;
    }

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public final String getSkylightStrategy() {
        return this.skylightStrategy;
    }

    public final int getVideoNum() {
        return this.videoNum;
    }

    public FollowingInterestUsersResponse(int i, List<FollowingInterestUser> list, List<FollowingInterestUser> list2, int i2, long j, LogPbBean logPbBean, String str) {
        this.code = i;
        this.followingInterestUsers = list;
        this.ecLiveEventList = list2;
        this.videoNum = i2;
        this.firstVid = j;
        this.logPbBean = logPbBean;
        this.skylightStrategy = str;
    }
}
