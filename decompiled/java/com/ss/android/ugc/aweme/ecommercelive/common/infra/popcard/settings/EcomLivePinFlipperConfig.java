package com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EcomLivePinFlipperConfig {

    @C09CT("ec_live_pin_flipper_count")
    public final int count;

    @C09CT("ec_live_pin_flipper_interval")
    public final long internal;

    public EcomLivePinFlipperConfig() {
        this(20000L, 1);
    }

    public EcomLivePinFlipperConfig(long j, int i) {
        this.internal = j;
        this.count = i;
    }
}
