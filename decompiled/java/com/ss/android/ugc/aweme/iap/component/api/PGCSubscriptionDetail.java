package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PGCSubscriptionDetail {

    @C09CT("current_sub_info")
    public final CurrentSubInfo currentSubInfo;

    @C09CT("plan_change_block_status")
    public final Integer planChangeBlockStatus;

    @C09CT("sub_scenario")
    public final Integer subScenario;

    public PGCSubscriptionDetail() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PGCSubscriptionDetail)) {
            return false;
        }
        PGCSubscriptionDetail pGCSubscriptionDetail = (PGCSubscriptionDetail) obj;
        return Intrinsics.LJFF(this.planChangeBlockStatus, pGCSubscriptionDetail.planChangeBlockStatus) && Intrinsics.LJFF(this.currentSubInfo, pGCSubscriptionDetail.currentSubInfo) && Intrinsics.LJFF(this.subScenario, pGCSubscriptionDetail.subScenario);
    }

    public final int hashCode() {
        Integer num = this.planChangeBlockStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        CurrentSubInfo currentSubInfo = this.currentSubInfo;
        int iHashCode2 = (iHashCode + (currentSubInfo == null ? 0 : currentSubInfo.hashCode())) * 31;
        Integer num2 = this.subScenario;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PGCSubscriptionDetail(planChangeBlockStatus=");
        sbLIZ.append(this.planChangeBlockStatus);
        sbLIZ.append(", currentSubInfo=");
        sbLIZ.append(this.currentSubInfo);
        sbLIZ.append(", subScenario=");
        sbLIZ.append(this.subScenario);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PGCSubscriptionDetail(Integer num, CurrentSubInfo currentSubInfo, Integer num2) {
        this.planChangeBlockStatus = num;
        this.currentSubInfo = currentSubInfo;
        this.subScenario = num2;
    }
}
