package com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AmazonCtaButtonStyleModel implements Serializable {

    @C09CT("normal")
    public final AmazonCtaButtonStyle normal;

    @C09CT("prime")
    public final AmazonCtaButtonStyle prime;

    public final AmazonCtaButtonStyle getNormal() {
        return this.normal;
    }

    public final AmazonCtaButtonStyle getPrime() {
        return this.prime;
    }
}
