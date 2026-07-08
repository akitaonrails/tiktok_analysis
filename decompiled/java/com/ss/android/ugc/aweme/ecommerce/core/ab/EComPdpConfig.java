package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EComPdpConfig {

    @C09CT("pdp_cache_timeout_config")
    public final int cacheTimeout;

    @C09CT("coupon_popup_bg_2x")
    public final String couponPopupBg2xUrl;

    @C09CT("coupon_popup_bg_3x")
    public final String couponPopupBg3xUrl;

    @C09CT("pdp_prefetch_cache_timeout_config")
    public final int prefetchTimeout;

    public EComPdpConfig(int i, int i2, String str, String str2) {
        this.cacheTimeout = i;
        this.prefetchTimeout = i2;
        this.couponPopupBg2xUrl = str;
        this.couponPopupBg3xUrl = str2;
    }
}
