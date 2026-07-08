package com.ss.android.ugc.aweme.theater.notify.route;

import X.C040G;
import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AITheaterPostNotifyRoutePayload {

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("is_story")
    @C040G
    public final Boolean isStory;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITheaterPostNotifyRoutePayload)) {
            return false;
        }
        AITheaterPostNotifyRoutePayload aITheaterPostNotifyRoutePayload = (AITheaterPostNotifyRoutePayload) obj;
        return Intrinsics.LJFF(this.awemeId, aITheaterPostNotifyRoutePayload.awemeId) && Intrinsics.LJFF(this.isStory, aITheaterPostNotifyRoutePayload.isStory);
    }

    public int hashCode() {
        String str = this.awemeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isStory;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterPostNotifyRoutePayload(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", isStory=");
        sbLIZ.append(this.isStory);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isStory() {
        return this.isStory;
    }

    public AITheaterPostNotifyRoutePayload(String str, Boolean bool) {
        this.awemeId = str;
        this.isStory = bool;
    }
}
