package com.ss.android.ugc.aweme.explore.lynx;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ExploreLynxStatistics {

    @C09CT("comment_count")
    public final Integer commentCount;

    @C09CT("digg_count")
    public final Integer diggCount;

    public ExploreLynxStatistics() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreLynxStatistics)) {
            return false;
        }
        ExploreLynxStatistics exploreLynxStatistics = (ExploreLynxStatistics) obj;
        return Intrinsics.LJFF(this.commentCount, exploreLynxStatistics.commentCount) && Intrinsics.LJFF(this.diggCount, exploreLynxStatistics.diggCount);
    }

    public final int hashCode() {
        Integer num = this.commentCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.diggCount;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreLynxStatistics(commentCount=");
        sbLIZ.append(this.commentCount);
        sbLIZ.append(", diggCount=");
        sbLIZ.append(this.diggCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreLynxStatistics(Integer num, Integer num2) {
        this.commentCount = num;
        this.diggCount = num2;
    }
}
