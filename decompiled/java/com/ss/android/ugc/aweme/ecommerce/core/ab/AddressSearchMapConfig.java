package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressSearchMapConfig {

    @C09CT("is_enable")
    public final boolean isEnable;

    @C09CT("pin_movable")
    public final boolean pinMovable;

    public AddressSearchMapConfig() {
        this(false, false);
    }

    public AddressSearchMapConfig(boolean z, boolean z2) {
        this.isEnable = z;
        this.pinMovable = z2;
    }
}
