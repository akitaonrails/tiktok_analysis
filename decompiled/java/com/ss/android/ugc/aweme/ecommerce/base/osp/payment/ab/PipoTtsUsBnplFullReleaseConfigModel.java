package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoTtsUsBnplFullReleaseConfigModel {

    @C09CT("enable_extra_hide_fix")
    public final boolean enableExtraHideFix;

    @C09CT("enable_installment_plan_selection_fix")
    public final boolean enableInstallmentPlanSelectionFix;

    @C09CT("enable_update_all")
    public final boolean enableUpdateAll;

    @C09CT("enable_us_bnpl")
    public final boolean enableUsBnpl;

    public PipoTtsUsBnplFullReleaseConfigModel() {
        this(true, false, true, true);
    }

    public PipoTtsUsBnplFullReleaseConfigModel(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enableUsBnpl = z;
        this.enableUpdateAll = z2;
        this.enableExtraHideFix = z3;
        this.enableInstallmentPlanSelectionFix = z4;
    }
}
