package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MembershipPreCheckPaymentRiskResponse {

    @C09CT("decision")
    public final String decision;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("risk_verify_info")
    public final String riskVerifyInfo;

    @C09CT("verify_id")
    public final String verifyId;

    public MembershipPreCheckPaymentRiskResponse() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MembershipPreCheckPaymentRiskResponse)) {
            return false;
        }
        MembershipPreCheckPaymentRiskResponse membershipPreCheckPaymentRiskResponse = (MembershipPreCheckPaymentRiskResponse) obj;
        return Intrinsics.LJFF(this.decision, membershipPreCheckPaymentRiskResponse.decision) && Intrinsics.LJFF(this.riskVerifyInfo, membershipPreCheckPaymentRiskResponse.riskVerifyInfo) && Intrinsics.LJFF(this.verifyId, membershipPreCheckPaymentRiskResponse.verifyId) && Intrinsics.LJFF(this.errorCode, membershipPreCheckPaymentRiskResponse.errorCode) && Intrinsics.LJFF(this.errorMsg, membershipPreCheckPaymentRiskResponse.errorMsg);
    }

    public final int hashCode() {
        String str = this.decision;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.riskVerifyInfo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.verifyId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.errorMsg;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MembershipPreCheckPaymentRiskResponse(decision=");
        sbLIZ.append(this.decision);
        sbLIZ.append(", riskVerifyInfo=");
        sbLIZ.append(this.riskVerifyInfo);
        sbLIZ.append(", verifyId=");
        sbLIZ.append(this.verifyId);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MembershipPreCheckPaymentRiskResponse(String str, String str2, String str3, String str4, String str5) {
        this.decision = str;
        this.riskVerifyInfo = str2;
        this.verifyId = str3;
        this.errorCode = str4;
        this.errorMsg = str5;
    }
}
