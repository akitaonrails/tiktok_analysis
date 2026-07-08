package com.ss.android.ugc.aweme.social.thought.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ThoughtQueryResult implements Serializable {

    @C09CT("thought_info")
    public final ThoughtInfo thoughtInfo;

    @C09CT("user_id")
    public final String userId;

    public ThoughtQueryResult() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThoughtQueryResult)) {
            return false;
        }
        ThoughtQueryResult thoughtQueryResult = (ThoughtQueryResult) obj;
        return Intrinsics.LJFF(this.userId, thoughtQueryResult.userId) && Intrinsics.LJFF(this.thoughtInfo, thoughtQueryResult.thoughtInfo);
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ThoughtInfo thoughtInfo = this.thoughtInfo;
        return iHashCode + (thoughtInfo != null ? thoughtInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThoughtQueryResult(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", thoughtInfo=");
        sbLIZ.append(this.thoughtInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ThoughtQueryResult(String str, ThoughtInfo thoughtInfo) {
        this.userId = str;
        this.thoughtInfo = thoughtInfo;
    }
}
