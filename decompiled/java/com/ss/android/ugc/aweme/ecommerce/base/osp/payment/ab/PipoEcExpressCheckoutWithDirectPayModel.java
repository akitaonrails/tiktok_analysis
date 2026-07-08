package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoEcExpressCheckoutWithDirectPayModel {

    @C09CT("cta_button_enable")
    public final boolean ctaButtonEnable;

    @C09CT("view_all_enable")
    public final boolean viewAllEnable;

    public PipoEcExpressCheckoutWithDirectPayModel() {
        this(false, false);
    }

    public PipoEcExpressCheckoutWithDirectPayModel(boolean z, boolean z2) {
        this.ctaButtonEnable = z;
        this.viewAllEnable = z2;
    }
}
