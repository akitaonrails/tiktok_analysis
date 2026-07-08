package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupEntranceCommon {

    @C09CT("can_create")
    public final boolean canCreate;

    @C09CT("group_cnt_limit")
    public final long groupCntLimit;

    @C09CT("total_current_group_cnt")
    public final long totalCurrentGroupCnt;

    public GroupEntranceCommon() {
        this(0L, 0L, false);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupEntranceCommon(groupCntLimit=");
        sbLIZ.append(this.groupCntLimit);
        sbLIZ.append(", totalCurrentGroupCnt=");
        sbLIZ.append(this.totalCurrentGroupCnt);
        sbLIZ.append(", canCreate=");
        sbLIZ.append(this.canCreate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GroupEntranceCommon(long j, long j2, boolean z) {
        this.groupCntLimit = j;
        this.totalCurrentGroupCnt = j2;
        this.canCreate = z;
    }
}
