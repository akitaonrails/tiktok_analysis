package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class SaleMode {

    @C09CT("if_self_sale")
    public final boolean selfSale;

    @C09CT("toggle_compliance")
    public final ToggleCompliance toggleCompliance;

    public SaleMode() {
        this(false, null);
    }

    public SaleMode(boolean z, ToggleCompliance toggleCompliance) {
        this.selfSale = z;
        this.toggleCompliance = toggleCompliance;
    }
}
