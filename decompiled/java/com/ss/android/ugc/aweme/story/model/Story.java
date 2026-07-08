package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Story implements Cloneable {
    public List<Aweme> awemes;

    @C09CT("skylight_display_tag")
    public String skyLightDisplayTag;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("type")
    public int type;

    @C09CT("update_time")
    public long updateTime;

    @C09CT("user_info")
    public User userInfo;

    public void setRead() {
        this.status = 1;
    }

    public String getLiveUid() {
        User user = this.userInfo;
        return user == null ? "" : user.getLiveUid();
    }

    public boolean isFollowing() {
        return this.type == 2;
    }

    public boolean isLive() {
        int i = this.type;
        return i == 1 || i == 5 || i == 6;
    }

    public boolean isNewLiveType() {
        int i = this.type;
        return i == 5 || i == 6;
    }

    public boolean isRead() {
        return this.status == 1;
    }

    public boolean isStory() {
        return this.type == 0;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Story m325clone() {
        try {
            return (Story) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public String getUid() {
        if (getUserInfo() == null) {
            return null;
        }
        return getUserInfo().getUid();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Story{status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", userInfo=");
        sbLIZ.append(this.userInfo);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public List<Aweme> getAwemes() {
        return this.awemes;
    }

    public int getStatus() {
        return this.status;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public User getUserInfo() {
        return this.userInfo;
    }

    public void setAwemes(List<Aweme> list) {
        this.awemes = list;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setUserInfo(User user) {
        this.userInfo = user;
    }
}
