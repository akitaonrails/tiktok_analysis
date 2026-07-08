package com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AmazonPrimeBadgeModel implements Serializable {

    @C09CT("altText")
    public final String altText;

    @C09CT("isPrime")
    public final boolean isPrime;

    @C09CT("miniPrimeBadgeUrl")
    public final String miniPrimeBadgeUrl;

    @C09CT("smallPrimeBadgeUrl")
    public final String smallPrimeBadgeUrl;

    public final String getAltText() {
        return this.altText;
    }

    public final String getMiniPrimeBadgeUrl() {
        return this.miniPrimeBadgeUrl;
    }

    public final String getSmallPrimeBadgeUrl() {
        return this.smallPrimeBadgeUrl;
    }

    public final boolean isPrime() {
        return this.isPrime;
    }
}
