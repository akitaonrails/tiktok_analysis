package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeriesSubscriptionModels$CancelResult {

    @C09CT("contract_id")
    public final String contractId;

    @C09CT("period_end_time")
    public final Long periodEndTime;

    public SeriesSubscriptionModels$CancelResult() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSubscriptionModels$CancelResult)) {
            return false;
        }
        SeriesSubscriptionModels$CancelResult seriesSubscriptionModels$CancelResult = (SeriesSubscriptionModels$CancelResult) obj;
        return Intrinsics.LJFF(this.contractId, seriesSubscriptionModels$CancelResult.contractId) && Intrinsics.LJFF(this.periodEndTime, seriesSubscriptionModels$CancelResult.periodEndTime);
    }

    public final int hashCode() {
        String str = this.contractId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.periodEndTime;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelResult(contractId=");
        sbLIZ.append(this.contractId);
        sbLIZ.append(", periodEndTime=");
        sbLIZ.append(this.periodEndTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesSubscriptionModels$CancelResult(String str, Long l) {
        this.contractId = str;
        this.periodEndTime = l;
    }
}
