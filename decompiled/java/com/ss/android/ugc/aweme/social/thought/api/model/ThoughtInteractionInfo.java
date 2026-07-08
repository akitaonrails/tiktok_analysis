package com.ss.android.ugc.aweme.social.thought.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ThoughtInteractionInfo implements Serializable {

    @C09CT("like_info")
    public final ThoughtLikeInfo likeInfo;

    @C09CT("user_info")
    public final User userInfo;

    public ThoughtInteractionInfo() {
        this(null, null);
    }

    public final ThoughtInteractionInfo copy(User user, ThoughtLikeInfo thoughtLikeInfo) {
        return new ThoughtInteractionInfo(user, thoughtLikeInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThoughtInteractionInfo)) {
            return false;
        }
        ThoughtInteractionInfo thoughtInteractionInfo = (ThoughtInteractionInfo) obj;
        return Intrinsics.LJFF(this.userInfo, thoughtInteractionInfo.userInfo) && Intrinsics.LJFF(this.likeInfo, thoughtInteractionInfo.likeInfo);
    }

    public int hashCode() {
        User user = this.userInfo;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        ThoughtLikeInfo thoughtLikeInfo = this.likeInfo;
        return iHashCode + (thoughtLikeInfo != null ? thoughtLikeInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThoughtInteractionInfo(userInfo=");
        sbLIZ.append(this.userInfo);
        sbLIZ.append(", likeInfo=");
        sbLIZ.append(this.likeInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ThoughtInteractionInfo(User user, ThoughtLikeInfo thoughtLikeInfo) {
        this.userInfo = user;
        this.likeInfo = thoughtLikeInfo;
    }
}
