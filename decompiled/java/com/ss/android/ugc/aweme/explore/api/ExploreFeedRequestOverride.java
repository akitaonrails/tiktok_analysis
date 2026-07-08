package com.ss.android.ugc.aweme.explore.api;

import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ExploreFeedRequestOverride {
    public final List<String> awemeIds;
    public final Long interestId;
    public final Integer pullType;

    public ExploreFeedRequestOverride() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreFeedRequestOverride)) {
            return false;
        }
        ExploreFeedRequestOverride exploreFeedRequestOverride = (ExploreFeedRequestOverride) obj;
        return Intrinsics.LJFF(this.pullType, exploreFeedRequestOverride.pullType) && Intrinsics.LJFF(this.awemeIds, exploreFeedRequestOverride.awemeIds) && Intrinsics.LJFF(this.interestId, exploreFeedRequestOverride.interestId);
    }

    public int hashCode() {
        Integer num = this.pullType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.awemeIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.interestId;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreFeedRequestOverride(pullType=");
        sbLIZ.append(this.pullType);
        sbLIZ.append(", awemeIds=");
        sbLIZ.append(this.awemeIds);
        sbLIZ.append(", interestId=");
        sbLIZ.append(this.interestId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreFeedRequestOverride(Integer num, List<String> list, Long l) {
        this.pullType = num;
        this.awemeIds = list;
        this.interestId = l;
    }
}
