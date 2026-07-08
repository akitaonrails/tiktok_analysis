package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class GuaranteeConfig {

    @C09CT("ec_payment_ccdc_popup")
    public final boolean ccdcPopup;

    @C09CT("ec_payment_guarantee_info")
    public final boolean enableGuarantee;

    public GuaranteeConfig() {
        this(false, false);
    }

    public GuaranteeConfig(boolean z, boolean z2) {
        this.enableGuarantee = z;
        this.ccdcPopup = z2;
    }
}
