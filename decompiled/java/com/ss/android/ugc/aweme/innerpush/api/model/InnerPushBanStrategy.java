package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class InnerPushBanStrategy implements Serializable {

    @C09CT("ban_by_cancel_times")
    public final int banByCancelTimes;

    @C09CT("ban_seconds_by_cancel")
    public final long banSecondsByCancel;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("records")
    public List<Long> records;

    public InnerPushBanStrategy() {
        this(0L, 0, 0L, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerPushBanStrategy(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", banByCancelTimes=");
        sbLIZ.append(this.banByCancelTimes);
        sbLIZ.append(", banSecondsByCancel=");
        sbLIZ.append(this.banSecondsByCancel);
        sbLIZ.append(", records=");
        sbLIZ.append(this.records);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setRecords(List<Long> list) {
        this.records = list;
    }

    public InnerPushBanStrategy(long j, int i, long j2, List<Long> list) {
        this.id = j;
        this.banByCancelTimes = i;
        this.banSecondsByCancel = j2;
        this.records = list;
    }
}
