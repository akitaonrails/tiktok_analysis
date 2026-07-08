package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoTtsCashierCommonFallbackConfig {

    @C09CT("enable_independent_installment_plan_show_all")
    public final Boolean enableIndependentInstallmentPlanShowAll;

    @C09CT("fix_hybrid_default_payment_info")
    public final Boolean fixHybridDefaultPaymentInfo;

    @C09CT("payment_options_use_all_methods")
    public final Boolean paymentOptionsUseAllMethods;

    @C09CT("use_primary_for_bind_not_pay_cancel")
    public final Boolean usePrimaryForBindNotPayCancel;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipoTtsCashierCommonFallbackConfig)) {
            return false;
        }
        PipoTtsCashierCommonFallbackConfig pipoTtsCashierCommonFallbackConfig = (PipoTtsCashierCommonFallbackConfig) obj;
        return Intrinsics.LJFF(this.fixHybridDefaultPaymentInfo, pipoTtsCashierCommonFallbackConfig.fixHybridDefaultPaymentInfo) && Intrinsics.LJFF(this.paymentOptionsUseAllMethods, pipoTtsCashierCommonFallbackConfig.paymentOptionsUseAllMethods) && Intrinsics.LJFF(this.usePrimaryForBindNotPayCancel, pipoTtsCashierCommonFallbackConfig.usePrimaryForBindNotPayCancel) && Intrinsics.LJFF(this.enableIndependentInstallmentPlanShowAll, pipoTtsCashierCommonFallbackConfig.enableIndependentInstallmentPlanShowAll);
    }

    public final int hashCode() {
        Boolean bool = this.fixHybridDefaultPaymentInfo;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.paymentOptionsUseAllMethods;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.usePrimaryForBindNotPayCancel;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.enableIndependentInstallmentPlanShowAll;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoTtsCashierCommonFallbackConfig(fixHybridDefaultPaymentInfo=");
        sbLIZ.append(this.fixHybridDefaultPaymentInfo);
        sbLIZ.append(", paymentOptionsUseAllMethods=");
        sbLIZ.append(this.paymentOptionsUseAllMethods);
        sbLIZ.append(", usePrimaryForBindNotPayCancel=");
        sbLIZ.append(this.usePrimaryForBindNotPayCancel);
        sbLIZ.append(", enableIndependentInstallmentPlanShowAll=");
        sbLIZ.append(this.enableIndependentInstallmentPlanShowAll);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PipoTtsCashierCommonFallbackConfig() {
        this(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE);
    }

    public PipoTtsCashierCommonFallbackConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.fixHybridDefaultPaymentInfo = bool;
        this.paymentOptionsUseAllMethods = bool2;
        this.usePrimaryForBindNotPayCancel = bool3;
        this.enableIndependentInstallmentPlanShowAll = bool4;
    }
}
