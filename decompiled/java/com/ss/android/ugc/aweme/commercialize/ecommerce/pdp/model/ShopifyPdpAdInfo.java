package com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public final class ShopifyPdpAdInfo implements Serializable {

    @C09CT("creative_id")
    public final Long creativeId;

    @C09CT("is_ad")
    public final boolean isAd;

    @C09CT("log_extra")
    public final String logExtra;

    public final boolean isAd() {
        return this.isAd;
    }

    public ShopifyPdpAdInfo(boolean z, Long l, String str) {
        this.isAd = z;
        this.creativeId = l;
        this.logExtra = str;
    }
}
