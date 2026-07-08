package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CurrentSubInfo {

    @C09CT("cancellation_reason")
    public final String cancellationReason;

    @C09CT("contract_id")
    public final String contractId;

    @C09CT("cycle_type")
    public final Integer cycleType;

    @C09CT("expiry_time")
    public final Long expiryTime;

    @C09CT("is_auto_renew")
    public final Boolean isAutoRenew;

    @C09CT("next_renewal_time")
    public final Long nextRenewalTime;

    @C09CT("option_id")
    public final String optionId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("sub_source")
    public final Integer subSource;

    public CurrentSubInfo() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentSubInfo)) {
            return false;
        }
        CurrentSubInfo currentSubInfo = (CurrentSubInfo) obj;
        return Intrinsics.LJFF(this.contractId, currentSubInfo.contractId) && Intrinsics.LJFF(this.status, currentSubInfo.status) && Intrinsics.LJFF(this.optionId, currentSubInfo.optionId) && Intrinsics.LJFF(this.nextRenewalTime, currentSubInfo.nextRenewalTime) && Intrinsics.LJFF(this.expiryTime, currentSubInfo.expiryTime) && Intrinsics.LJFF(this.cycleType, currentSubInfo.cycleType) && Intrinsics.LJFF(this.isAutoRenew, currentSubInfo.isAutoRenew) && Intrinsics.LJFF(this.cancellationReason, currentSubInfo.cancellationReason) && Intrinsics.LJFF(this.subSource, currentSubInfo.subSource);
    }

    public final int hashCode() {
        String str = this.contractId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.status;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.optionId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.nextRenewalTime;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.expiryTime;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.cycleType;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isAutoRenew;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.cancellationReason;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.subSource;
        return iHashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CurrentSubInfo(contractId=");
        sbLIZ.append(this.contractId);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", optionId=");
        sbLIZ.append(this.optionId);
        sbLIZ.append(", nextRenewalTime=");
        sbLIZ.append(this.nextRenewalTime);
        sbLIZ.append(", expiryTime=");
        sbLIZ.append(this.expiryTime);
        sbLIZ.append(", cycleType=");
        sbLIZ.append(this.cycleType);
        sbLIZ.append(", isAutoRenew=");
        sbLIZ.append(this.isAutoRenew);
        sbLIZ.append(", cancellationReason=");
        sbLIZ.append(this.cancellationReason);
        sbLIZ.append(", subSource=");
        sbLIZ.append(this.subSource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CurrentSubInfo(String str, Integer num, String str2, Long l, Long l2, Integer num2, Boolean bool, String str3, Integer num3) {
        this.contractId = str;
        this.status = num;
        this.optionId = str2;
        this.nextRenewalTime = l;
        this.expiryTime = l2;
        this.cycleType = num2;
        this.isAutoRenew = bool;
        this.cancellationReason = str3;
        this.subSource = num3;
    }
}
