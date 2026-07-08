package com.ss.android.ugc.aweme.favorites.business.collaboration;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CollaborativeUserInfo implements Serializable {

    @C09CT("avatarUrl")
    public final String avatarUrl;

    @C09CT("follow_status")
    public final int followStatus;

    @C09CT("name")
    public final String name;

    @C09CT("uid")
    public final String uid;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollaborativeUserInfo)) {
            return false;
        }
        CollaborativeUserInfo collaborativeUserInfo = (CollaborativeUserInfo) obj;
        return Intrinsics.LJFF(this.uid, collaborativeUserInfo.uid) && Intrinsics.LJFF(this.name, collaborativeUserInfo.name) && Intrinsics.LJFF(this.avatarUrl, collaborativeUserInfo.avatarUrl) && this.followStatus == collaborativeUserInfo.followStatus;
    }

    public CollaborativeUserInfo() {
        this("", "", "", 2);
    }

    public CollaborativeUserInfo(String str, String str2, String str3, int i) {
        this.uid = str;
        this.name = str2;
        this.avatarUrl = str3;
        this.followStatus = i;
    }
}
