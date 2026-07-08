package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class InnerPushPopupLimitStrategy implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("max_popup_times")
    public final int maxPopupTimes;

    @C09CT("period_in_seconds")
    public final long periodInSeconds;

    @C09CT("records")
    public List<Long> records;

    public InnerPushPopupLimitStrategy() {
        this(0L, 0, 0L, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerPushPopupLimitStrategy(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", maxPopupTimes=");
        sbLIZ.append(this.maxPopupTimes);
        sbLIZ.append(", periodInSeconds=");
        sbLIZ.append(this.periodInSeconds);
        sbLIZ.append(", records=");
        sbLIZ.append(this.records);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setRecords(List<Long> list) {
        this.records = list;
    }

    public InnerPushPopupLimitStrategy(long j, int i, long j2, List<Long> list) {
        this.id = j;
        this.maxPopupTimes = i;
        this.periodInSeconds = j2;
        this.records = list;
    }
}
