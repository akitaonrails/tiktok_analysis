package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class EventRegister implements Serializable {

    @C09CT("avatar")
    public UrlModel avatar;

    @C09CT("follow_status")
    public int followStatus;
    public boolean isShowed;

    @C09CT("nickname")
    public String nickname;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("uid")
    public String uid;

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final boolean isShowed() {
        return this.isShowed;
    }

    public final void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setShowed(boolean z) {
        this.isShowed = z;
    }

    public final void setUid(String str) {
        this.uid = str;
    }
}
