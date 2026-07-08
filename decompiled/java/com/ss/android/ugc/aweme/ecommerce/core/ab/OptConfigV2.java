package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class OptConfigV2 {

    @C09CT("add_cart_animator_opt")
    public boolean addCartAnimatorOpt;

    @C09CT("add_cart_animator_timing_opt")
    public boolean addCartAnimatorTimingOpt;

    public OptConfigV2() {
        this(false, false);
    }

    public OptConfigV2(boolean z, boolean z2) {
        this.addCartAnimatorTimingOpt = z;
        this.addCartAnimatorOpt = z2;
    }
}
