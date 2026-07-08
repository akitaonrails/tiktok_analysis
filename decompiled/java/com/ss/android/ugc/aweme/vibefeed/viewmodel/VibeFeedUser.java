package com.ss.android.ugc.aweme.vibefeed.viewmodel;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeFeedUser {

    @C09CT("avatar_middle")
    public final UrlModel avatarMiddle;

    @C09CT("avatar_thumb")
    public final UrlModel avatarThumb;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String userId;

    @C09CT("nick_name")
    public final String userName;

    public VibeFeedUser() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibeFeedUser)) {
            return false;
        }
        VibeFeedUser vibeFeedUser = (VibeFeedUser) obj;
        return Intrinsics.LJFF(this.userId, vibeFeedUser.userId) && Intrinsics.LJFF(this.userName, vibeFeedUser.userName) && Intrinsics.LJFF(this.avatarThumb, vibeFeedUser.avatarThumb) && Intrinsics.LJFF(this.avatarMiddle, vibeFeedUser.avatarMiddle);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeFeedUser(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.userName);
        sbLIZ.append(", avatarThumb=");
        sbLIZ.append(this.avatarThumb);
        sbLIZ.append(", avatarMiddle=");
        sbLIZ.append(this.avatarMiddle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VibeFeedUser(String str, String str2, UrlModel urlModel, UrlModel urlModel2) {
        this.userId = str;
        this.userName = str2;
        this.avatarThumb = urlModel;
        this.avatarMiddle = urlModel2;
    }
}
