package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AddToCartConfig {

    @C09CT("ecom_one_step_osp_add_to_cart_decoupling")
    public final boolean combinedSkuOsp;

    @C09CT("ecom_express_osp_add_to_cart_decoupling")
    public final boolean expressOsp;

    @C09CT("ecom_osp_add_to_cart_decoupling")
    public final boolean normalOsp;

    public AddToCartConfig() {
        this(false, false, false);
    }

    public AddToCartConfig(boolean z, boolean z2, boolean z3) {
        this.normalOsp = z;
        this.expressOsp = z2;
        this.combinedSkuOsp = z3;
    }
}
