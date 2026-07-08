package com.ss.android.ugc.aweme.friendstab.repo;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RepostTextExtra {

    @C09CT("type")
    public final Integer mentionType;

    @C09CT("user_id")
    public final String mentionUserId;

    @C09CT("end")
    public final Integer spanEnd;

    @C09CT("start")
    public final Integer spanStart;

    public RepostTextExtra() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostTextExtra)) {
            return false;
        }
        RepostTextExtra repostTextExtra = (RepostTextExtra) obj;
        return Intrinsics.LJFF(this.spanStart, repostTextExtra.spanStart) && Intrinsics.LJFF(this.spanEnd, repostTextExtra.spanEnd) && Intrinsics.LJFF(this.mentionUserId, repostTextExtra.mentionUserId) && Intrinsics.LJFF(this.mentionType, repostTextExtra.mentionType);
    }

    public final int hashCode() {
        Integer num = this.spanStart;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.spanEnd;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.mentionUserId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.mentionType;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostTextExtra(spanStart=");
        sbLIZ.append(this.spanStart);
        sbLIZ.append(", spanEnd=");
        sbLIZ.append(this.spanEnd);
        sbLIZ.append(", mentionUserId=");
        sbLIZ.append(this.mentionUserId);
        sbLIZ.append(", mentionType=");
        sbLIZ.append(this.mentionType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RepostTextExtra(Integer num, Integer num2, String str, Integer num3) {
        this.spanStart = num;
        this.spanEnd = num2;
        this.mentionUserId = str;
        this.mentionType = num3;
    }
}
