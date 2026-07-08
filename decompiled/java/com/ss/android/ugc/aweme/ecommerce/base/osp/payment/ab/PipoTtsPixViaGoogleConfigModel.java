package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoTtsPixViaGoogleConfigModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("fix_osp_pix_display")
    public final Boolean fixOspPixDisplay;

    @C09CT("fix_osp_pix_display_in_payment_cell")
    public final Boolean fixOspPixDisplayInPaymentCell;

    @C09CT("hide_pre_page_loading_in_pix")
    public final boolean hidePrePageLoading;

    public PipoTtsPixViaGoogleConfigModel() {
        this(true, true, Boolean.TRUE, Boolean.FALSE);
    }

    public PipoTtsPixViaGoogleConfigModel(boolean z, boolean z2, Boolean bool, Boolean bool2) {
        this.enable = z;
        this.hidePrePageLoading = z2;
        this.fixOspPixDisplay = bool;
        this.fixOspPixDisplayInPaymentCell = bool2;
    }
}
