package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeriesSubscriptionModels$CancelContractRequest {

    @C09CT("contract_id")
    public final String contractId;

    public SeriesSubscriptionModels$CancelContractRequest() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SeriesSubscriptionModels$CancelContractRequest) && Intrinsics.LJFF(this.contractId, ((SeriesSubscriptionModels$CancelContractRequest) obj).contractId);
    }

    public final int hashCode() {
        String str = this.contractId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelContractRequest(contractId=");
        sbLIZ.append(this.contractId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesSubscriptionModels$CancelContractRequest(String str) {
        this.contractId = str;
    }
}
