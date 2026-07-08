package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class OptimizeCheckoutConfig {

    @C09CT("enable_address_optimize_native_imp")
    public final boolean enableAddressNativeImp;

    @C09CT("enable_address_optimize")
    public final boolean enableAddressOptimize;

    @C09CT("enable_payment_optimize")
    public final boolean enablePayOptimize;

    public OptimizeCheckoutConfig() {
        this(false, false, false);
    }

    public OptimizeCheckoutConfig(boolean z, boolean z2, boolean z3) {
        this.enableAddressOptimize = z;
        this.enableAddressNativeImp = z2;
        this.enablePayOptimize = z3;
    }
}
