package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MembershipPreCheckPaymentRiskRequest {

    @C09CT("event")
    public final String event;

    @C09CT("payer_id")
    public final String payerId;

    @C09CT("region")
    public final String region;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("risk_info")
    public final String riskInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MembershipPreCheckPaymentRiskRequest)) {
            return false;
        }
        MembershipPreCheckPaymentRiskRequest membershipPreCheckPaymentRiskRequest = (MembershipPreCheckPaymentRiskRequest) obj;
        return Intrinsics.LJFF(this.payerId, membershipPreCheckPaymentRiskRequest.payerId) && Intrinsics.LJFF(this.event, membershipPreCheckPaymentRiskRequest.event) && Intrinsics.LJFF(this.region, membershipPreCheckPaymentRiskRequest.region) && Intrinsics.LJFF(this.requestId, membershipPreCheckPaymentRiskRequest.requestId) && Intrinsics.LJFF(this.riskInfo, membershipPreCheckPaymentRiskRequest.riskInfo);
    }

    public final int hashCode() {
        String str = this.payerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.event;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.region;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.requestId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.riskInfo;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MembershipPreCheckPaymentRiskRequest(payerId=");
        sbLIZ.append(this.payerId);
        sbLIZ.append(", event=");
        sbLIZ.append(this.event);
        sbLIZ.append(", region=");
        sbLIZ.append(this.region);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.requestId);
        sbLIZ.append(", riskInfo=");
        sbLIZ.append(this.riskInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MembershipPreCheckPaymentRiskRequest(String str, String str2, String str3, String str4, String str5) {
        this.payerId = str;
        this.event = str2;
        this.region = str3;
        this.requestId = str4;
        this.riskInfo = str5;
    }
}
