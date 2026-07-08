package com.ss.android.ugc.aweme.feed.module;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingInterestUser implements Serializable {
    public LogPbBean LL;
    public transient SlimRoom LLILLJJLI;
    public transient int LLILLL;

    @C09CT("ec_live_event")
    public final FollowingEcLiveEvent ecLiveEvent;

    @C09CT("interest_user_type")
    public int interestUserType;

    @C09CT("is_show_blue_point")
    public boolean showBluePoint;

    @C09CT("user")
    public final User user;

    public final FollowingEcLiveEvent getEcLiveEvent() {
        return this.ecLiveEvent;
    }

    public final int getInterestUserType() {
        return this.interestUserType;
    }

    public final LogPbBean getLogPbBean() {
        return this.LL;
    }

    public final int getRelationType() {
        return this.LLILLL;
    }

    public final boolean getShowBluePoint() {
        return this.showBluePoint;
    }

    public final SlimRoom getSlimRoom() {
        return this.LLILLJJLI;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setInterestUserType(int i) {
        this.interestUserType = i;
    }

    public final void setLogPbBean(LogPbBean logPbBean) {
        this.LL = logPbBean;
    }

    public final void setRelationType(int i) {
        this.LLILLL = i;
    }

    public final void setShowBluePoint(boolean z) {
        this.showBluePoint = z;
    }

    public final void setSlimRoom(SlimRoom slimRoom) {
        this.LLILLJJLI = slimRoom;
    }

    public FollowingInterestUser(User user, boolean z, LogPbBean logPbBean, int i, FollowingEcLiveEvent followingEcLiveEvent) {
        this.user = user;
        this.showBluePoint = z;
        this.LL = logPbBean;
        this.interestUserType = i;
        this.ecLiveEvent = followingEcLiveEvent;
    }
}
