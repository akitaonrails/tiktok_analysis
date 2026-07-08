package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class RelationshipCelebrationTarget implements Serializable {

    @C09CT("celebrating_content")
    public final String celebratingContent;

    @C09CT("celebrating_user_id")
    public final String celebratingUserId;
    public long lastShowTime;

    public RelationshipCelebrationTarget() {
        this(null, null, Long.MAX_VALUE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelationshipCelebrationTarget)) {
            return false;
        }
        RelationshipCelebrationTarget relationshipCelebrationTarget = (RelationshipCelebrationTarget) obj;
        return Intrinsics.LJFF(this.celebratingUserId, relationshipCelebrationTarget.celebratingUserId) && Intrinsics.LJFF(this.celebratingContent, relationshipCelebrationTarget.celebratingContent) && this.lastShowTime == relationshipCelebrationTarget.lastShowTime;
    }

    public int hashCode() {
        String str = this.celebratingUserId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.celebratingContent;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.lastShowTime);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationshipCelebrationTarget(celebratingUserId=");
        sbLIZ.append(this.celebratingUserId);
        sbLIZ.append(", celebratingContent=");
        sbLIZ.append(this.celebratingContent);
        sbLIZ.append(", lastShowTime=");
        sbLIZ.append(this.lastShowTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setLastShowTime(long j) {
        this.lastShowTime = j;
    }

    public RelationshipCelebrationTarget(String str, String str2, long j) {
        this.celebratingUserId = str;
        this.celebratingContent = str2;
        this.lastShowTime = j;
    }
}
