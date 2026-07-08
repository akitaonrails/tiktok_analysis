package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class UserNowPackStruct implements Serializable {

    @C09CT("now_avatar_badge_status")
    public Integer nowAvatarBadgeStatus;

    @C09CT("user_now_status")
    public int userNowStatus;

    public UserNowPackStruct() {
        this(0, 0);
    }

    public final void setUserNowStatus(int i) {
        this.userNowStatus = i;
    }

    public UserNowPackStruct(int i, Integer num) {
        this.userNowStatus = i;
        this.nowAvatarBadgeStatus = num;
    }
}
