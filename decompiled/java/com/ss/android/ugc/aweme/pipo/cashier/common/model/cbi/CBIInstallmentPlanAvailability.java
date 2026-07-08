package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CBIInstallmentPlanAvailability {

    @C09CT("is_available")
    public final Boolean isAvailable;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    @C09CT("unavailable_reason")
    public final String unavailableReason;

    @C09CT("unavailable_reason_text")
    public final String unavailableReasonText;

    public CBIInstallmentPlanAvailability() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CBIInstallmentPlanAvailability)) {
            return false;
        }
        CBIInstallmentPlanAvailability cBIInstallmentPlanAvailability = (CBIInstallmentPlanAvailability) obj;
        return Intrinsics.LJFF(this.isAvailable, cBIInstallmentPlanAvailability.isAvailable) && Intrinsics.LJFF(this.status, cBIInstallmentPlanAvailability.status) && Intrinsics.LJFF(this.unavailableReason, cBIInstallmentPlanAvailability.unavailableReason) && Intrinsics.LJFF(this.unavailableReasonText, cBIInstallmentPlanAvailability.unavailableReasonText);
    }

    public final int hashCode() {
        Boolean bool = this.isAvailable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unavailableReason;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unavailableReasonText;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CBIInstallmentPlanAvailability(isAvailable=");
        sbLIZ.append(this.isAvailable);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", unavailableReason=");
        sbLIZ.append(this.unavailableReason);
        sbLIZ.append(", unavailableReasonText=");
        sbLIZ.append(this.unavailableReasonText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CBIInstallmentPlanAvailability(Boolean bool, String str, String str2, String str3) {
        this.isAvailable = bool;
        this.status = str;
        this.unavailableReason = str2;
        this.unavailableReasonText = str3;
    }
}
