package com.ss.android.ugc.profile.business.ci.viewer.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes22.dex */
public final class ProfileViewerInfo {

    @C09CT("unread")
    public final boolean isUnRead;

    @C09CT("last_view_time")
    public final long lastViewTime;

    @C09CT("user")
    public final User user;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileViewerInfo(isUnRead=");
        sbLIZ.append(this.isUnRead);
        sbLIZ.append(", lastViewTime=");
        sbLIZ.append(this.lastViewTime);
        sbLIZ.append(", user=");
        sbLIZ.append(this.user);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProfileViewerInfo(boolean z, long j, User user) {
        this.isUnRead = z;
        this.lastViewTime = j;
        this.user = user;
    }
}
