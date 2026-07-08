package com.ss.android.ugc.aweme.social.thought.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ThoughtAggregatedModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("thought_info")
    public final ThoughtInfo thoughtInfo;

    @C09CT("user_info")
    public final User userInfo;

    public ThoughtAggregatedModel() {
        this(null, null);
    }

    public final ThoughtAggregatedModel copy(User user, ThoughtInfo thoughtInfo) {
        return new ThoughtAggregatedModel(user, thoughtInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThoughtAggregatedModel)) {
            return false;
        }
        ThoughtAggregatedModel thoughtAggregatedModel = (ThoughtAggregatedModel) obj;
        return Intrinsics.LJFF(this.userInfo, thoughtAggregatedModel.userInfo) && Intrinsics.LJFF(this.thoughtInfo, thoughtAggregatedModel.thoughtInfo);
    }

    public int hashCode() {
        User user = this.userInfo;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        ThoughtInfo thoughtInfo = this.thoughtInfo;
        return iHashCode + (thoughtInfo != null ? thoughtInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThoughtAggregatedModel(userInfo=");
        sbLIZ.append(this.userInfo);
        sbLIZ.append(", thoughtInfo=");
        sbLIZ.append(this.thoughtInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ThoughtAggregatedModel(User user, ThoughtInfo thoughtInfo) {
        this.userInfo = user;
        this.thoughtInfo = thoughtInfo;
    }
}
