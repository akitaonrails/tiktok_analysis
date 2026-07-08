package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CBIPayLaterInstallmentInfo {

    @C09CT("installment_plan_list")
    public final List<CBIInstallmentPlan> installmentPlanList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CBIPayLaterInstallmentInfo) && Intrinsics.LJFF(this.installmentPlanList, ((CBIPayLaterInstallmentInfo) obj).installmentPlanList);
    }

    public final int hashCode() {
        List<CBIInstallmentPlan> list = this.installmentPlanList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CBIPayLaterInstallmentInfo(installmentPlanList=");
        sbLIZ.append(this.installmentPlanList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CBIPayLaterInstallmentInfo(List<CBIInstallmentPlan> list) {
        this.installmentPlanList = list;
    }
}
