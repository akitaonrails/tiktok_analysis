package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EcShopBagAfterPinCardGuide {

    @C09CT("enable")
    public final boolean enabled;

    @C09CT("frequency_limit")
    public final int frequencyLimit;

    @C09CT("show_image")
    public final boolean showImage;

    @C09CT("show_time")
    public final long showTime;

    public EcShopBagAfterPinCardGuide() {
        this(false, 4000L, 1, false);
    }

    public EcShopBagAfterPinCardGuide(boolean z, long j, int i, boolean z2) {
        this.enabled = z;
        this.showTime = j;
        this.frequencyLimit = i;
        this.showImage = z2;
    }
}
