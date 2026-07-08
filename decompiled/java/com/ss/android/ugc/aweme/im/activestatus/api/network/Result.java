package com.ss.android.ugc.aweme.im.activestatus.api.network;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.im.activestatus.api.model.ActivityStatus;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Result extends BaseResponse {

    @C09CT("activity_status")
    public final List<ActivityStatus> activityStatuses;

    @C09CT("log_pb")
    public final LogPbBean logPB;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return Intrinsics.LJFF(this.activityStatuses, result.activityStatuses) && Intrinsics.LJFF(this.logPB, result.logPB);
    }

    public final int hashCode() {
        List<ActivityStatus> list = this.activityStatuses;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        LogPbBean logPbBean = this.logPB;
        return iHashCode + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Result(activityStatuses=");
        sbLIZ.append(this.activityStatuses);
        sbLIZ.append(", logPB=");
        sbLIZ.append(this.logPB);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Result(List<ActivityStatus> list, LogPbBean logPbBean) {
        this.activityStatuses = list;
        this.logPB = logPbBean;
    }
}
