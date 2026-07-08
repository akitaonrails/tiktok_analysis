package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPaymentBnplOptConfigModel {

    @C09CT("anchor_x_default")
    public final boolean anchorXDefault;

    @C09CT("disable_anchor_dual_style")
    public final boolean disableAnchorDualStyle;

    @C09CT("disable_non_anchor_dual_style")
    public final boolean disableNonAnchorDualStyle;

    public EcPaymentBnplOptConfigModel() {
        this(true, false, false);
    }

    public EcPaymentBnplOptConfigModel(boolean z, boolean z2, boolean z3) {
        this.anchorXDefault = z;
        this.disableAnchorDualStyle = z2;
        this.disableNonAnchorDualStyle = z3;
    }
}
