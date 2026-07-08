package com.ss.android.ugc.aweme.comment.exposedcmt.limit;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class ExposedCommentUidRemoveData implements Serializable {
    public static final int $stable = 8;

    @C09CT("extra_remove_days")
    public int extraRemoveDays;

    @C09CT("extra_remove_days_startTime")
    public long extraRemoveDaysStartTime;

    @C09CT("remove_uid_list")
    public final List<ExposedCommentUidRemoveMetaData> removeUidList;

    public ExposedCommentUidRemoveData() {
        this(null, 0, 0L, 7, null);
    }

    public final void setExtraRemoveDays(int i) {
        this.extraRemoveDays = i;
    }

    public final void setExtraRemoveDaysStartTime(long j) {
        this.extraRemoveDaysStartTime = j;
    }

    public ExposedCommentUidRemoveData(List<ExposedCommentUidRemoveMetaData> list, int i, long j) {
        this.removeUidList = list;
        this.extraRemoveDays = i;
        this.extraRemoveDaysStartTime = j;
    }

    public ExposedCommentUidRemoveData(List list, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0L : j);
    }
}
