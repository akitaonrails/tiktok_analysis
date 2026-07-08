package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EComUsPostBillingAddressModel {

    @C09CT("ecom_us_post_ba_interactive")
    public final boolean baInteractive;

    @C09CT("ecom_us_post_osp")
    public final boolean osp;

    public EComUsPostBillingAddressModel() {
        this(false, false);
    }

    public EComUsPostBillingAddressModel(boolean z, boolean z2) {
        this.baInteractive = z;
        this.osp = z2;
    }
}
