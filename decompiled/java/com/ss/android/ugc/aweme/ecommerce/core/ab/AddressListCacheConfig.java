package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressListCacheConfig {

    @C09CT("list_cache_time_hours")
    public final float addressListCacheTimeoutHour;

    @C09CT("list_preload_enable")
    public final int listPreloadEnable;

    public AddressListCacheConfig() {
        this(0, 0.0f);
    }

    public AddressListCacheConfig(int i, float f) {
        this.listPreloadEnable = i;
        this.addressListCacheTimeoutHour = f;
    }
}
