package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressConfig {

    @C09CT("enable_e2e")
    public final boolean enableE2E;

    @C09CT("pdp_delivery_clickable")
    public final boolean pdpDeliveryClickable;

    public AddressConfig() {
        this(false, true);
    }

    public AddressConfig(boolean z, boolean z2) {
        this.pdpDeliveryClickable = z;
        this.enableE2E = z2;
    }
}
