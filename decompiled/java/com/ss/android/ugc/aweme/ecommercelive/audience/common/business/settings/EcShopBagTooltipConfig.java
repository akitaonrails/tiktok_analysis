package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EcShopBagTooltipConfig {

    @C09CT("animation_type")
    public final int animationType;

    @C09CT("frequency_limit")
    public final int frequencyLimit;

    @C09CT("need_request")
    public final boolean needRequest;

    @C09CT("show_image")
    public final boolean showImage;

    @C09CT("show_time")
    public final long showTime;

    public EcShopBagTooltipConfig() {
        this(4000L, 1, false, false, 0);
    }

    public EcShopBagTooltipConfig(long j, int i, boolean z, boolean z2, int i2) {
        this.showTime = j;
        this.frequencyLimit = i;
        this.showImage = z;
        this.needRequest = z2;
        this.animationType = i2;
    }
}
