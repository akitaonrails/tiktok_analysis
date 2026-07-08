package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeriesSubscriptionModels$CancelContractResponse {

    @C09CT("data")
    public final SeriesSubscriptionModels$CancelResult data;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public SeriesSubscriptionModels$CancelContractResponse() {
        this(0, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSubscriptionModels$CancelContractResponse)) {
            return false;
        }
        SeriesSubscriptionModels$CancelContractResponse seriesSubscriptionModels$CancelContractResponse = (SeriesSubscriptionModels$CancelContractResponse) obj;
        return this.statusCode == seriesSubscriptionModels$CancelContractResponse.statusCode && Intrinsics.LJFF(this.statusMsg, seriesSubscriptionModels$CancelContractResponse.statusMsg) && Intrinsics.LJFF(this.data, seriesSubscriptionModels$CancelContractResponse.data);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        SeriesSubscriptionModels$CancelResult seriesSubscriptionModels$CancelResult = this.data;
        return iHashCode + (seriesSubscriptionModels$CancelResult != null ? seriesSubscriptionModels$CancelResult.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelContractResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesSubscriptionModels$CancelContractResponse(int i, String str, SeriesSubscriptionModels$CancelResult seriesSubscriptionModels$CancelResult) {
        this.statusCode = i;
        this.statusMsg = str;
        this.data = seriesSubscriptionModels$CancelResult;
    }
}
