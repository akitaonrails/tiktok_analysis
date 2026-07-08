package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PlanLevelClarificationModel {

    @C09CT("allow_pm_ids")
    public final List<String> allowPaymentMethodIds;

    @C09CT("enable")
    public final boolean enable;

    public PlanLevelClarificationModel() {
        this(false, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanLevelClarificationModel)) {
            return false;
        }
        PlanLevelClarificationModel planLevelClarificationModel = (PlanLevelClarificationModel) obj;
        return this.enable == planLevelClarificationModel.enable && Intrinsics.LJFF(this.allowPaymentMethodIds, planLevelClarificationModel.allowPaymentMethodIds);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + this.allowPaymentMethodIds.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlanLevelClarificationModel(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", allowPaymentMethodIds=");
        sbLIZ.append(this.allowPaymentMethodIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PlanLevelClarificationModel(boolean z, List<String> list) {
        this.enable = z;
        this.allowPaymentMethodIds = list;
    }

    public PlanLevelClarificationModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Collections.singletonList("pm_pi_ins_pipobnpl_c_d") : list);
    }
}
