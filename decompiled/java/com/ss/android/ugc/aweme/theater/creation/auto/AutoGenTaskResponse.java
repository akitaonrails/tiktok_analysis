package com.ss.android.ugc.aweme.theater.creation.auto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoGenTaskResponse {

    @C09CT("data")
    public final AutoGenTaskModel data;

    @C09CT("log_pb")
    public final LogPB logPb;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public AutoGenTaskResponse() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoGenTaskResponse)) {
            return false;
        }
        AutoGenTaskResponse autoGenTaskResponse = (AutoGenTaskResponse) obj;
        return Intrinsics.LJFF(this.statusCode, autoGenTaskResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, autoGenTaskResponse.statusMsg) && Intrinsics.LJFF(this.data, autoGenTaskResponse.data) && Intrinsics.LJFF(this.logPb, autoGenTaskResponse.logPb);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AutoGenTaskModel autoGenTaskModel = this.data;
        int iHashCode3 = (iHashCode2 + (autoGenTaskModel == null ? 0 : autoGenTaskModel.hashCode())) * 31;
        LogPB logPB = this.logPb;
        return iHashCode3 + (logPB != null ? logPB.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoGenTaskResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AutoGenTaskResponse(Integer num, String str, AutoGenTaskModel autoGenTaskModel, LogPB logPB) {
        this.statusCode = num;
        this.statusMsg = str;
        this.data = autoGenTaskModel;
        this.logPb = logPB;
    }
}
