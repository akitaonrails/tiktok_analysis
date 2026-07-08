package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigModel {

    @C09CT("enabled_bnpl_x_fragment")
    public final boolean enabledBnplXFragment;

    @C09CT("enable_payment_fragment")
    public final boolean enabledPaymentFragment;

    @C09CT("enabled_pm_list")
    public final List<String> enabledPmList;

    @C09CT("osp_not_expand")
    public final boolean ospNotExpand;

    @C09CT("override_installment_plan")
    public final boolean overrideInstallmentPlan;

    @C09CT("use_new_pay_info")
    public final boolean useNewPayInfo;

    public ConfigModel() {
        this(null, false, false, false, false, false, 63, null);
    }

    public ConfigModel(List<String> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enabledPmList = list;
        this.enabledPaymentFragment = z;
        this.enabledBnplXFragment = z2;
        this.useNewPayInfo = z3;
        this.ospNotExpand = z4;
        this.overrideInstallmentPlan = z5;
    }

    public ConfigModel(List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4, (i & 32) == 0 ? z5 : true);
    }
}
