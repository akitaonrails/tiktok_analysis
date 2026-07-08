package com.ss.android.ugc.aweme.pipo.postpayment.impl;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ReportUserActionRequest {

    @C09CT("action_type")
    public final String actionType;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("operation_type")
    public final String operationType;

    public ReportUserActionRequest() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportUserActionRequest)) {
            return false;
        }
        ReportUserActionRequest reportUserActionRequest = (ReportUserActionRequest) obj;
        return Intrinsics.LJFF(this.merchantId, reportUserActionRequest.merchantId) && Intrinsics.LJFF(this.merchantUserId, reportUserActionRequest.merchantUserId) && Intrinsics.LJFF(this.operationType, reportUserActionRequest.operationType) && Intrinsics.LJFF(this.actionType, reportUserActionRequest.actionType);
    }

    public final int hashCode() {
        String str = this.merchantId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.merchantUserId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.operationType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionType;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportUserActionRequest(merchantId=");
        sbLIZ.append(this.merchantId);
        sbLIZ.append(", merchantUserId=");
        sbLIZ.append(this.merchantUserId);
        sbLIZ.append(", operationType=");
        sbLIZ.append(this.operationType);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.actionType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ReportUserActionRequest(String str, String str2, String str3, String str4) {
        this.merchantId = str;
        this.merchantUserId = str2;
        this.operationType = str3;
        this.actionType = str4;
    }
}
