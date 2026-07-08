package com.ss.android.ugc.aweme.ecommercelive.audience.common.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class ECContentClientAIConfig {

    @C09CT("gecc_live_shop_bag_prerender_low_end")
    public final boolean liveShopBagPrerenderLowEndEnable;

    @C09CT("gecc_live_shop_bag_prerender")
    public final boolean liveShopBagPrerenderedEnable;

    public ECContentClientAIConfig() {
        this(true, true);
    }

    public ECContentClientAIConfig(boolean z, boolean z2) {
        this.liveShopBagPrerenderedEnable = z;
        this.liveShopBagPrerenderLowEndEnable = z2;
    }
}
