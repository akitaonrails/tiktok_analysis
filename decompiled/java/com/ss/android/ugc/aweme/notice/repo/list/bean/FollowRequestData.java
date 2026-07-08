package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowRequestData {

    @C09CT("create_time")
    public final long createTime;

    @C09CT("has_read")
    public boolean hasRead;

    @C09CT("from_user")
    public final User user;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowRequestData(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(", hasRead=");
        sbLIZ.append(this.hasRead);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setHasRead(boolean z) {
        this.hasRead = z;
    }

    public FollowRequestData(User user, long j, boolean z) {
        this.user = user;
        this.createTime = j;
        this.hasRead = z;
    }
}
