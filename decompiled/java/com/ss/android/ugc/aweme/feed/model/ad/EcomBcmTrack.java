package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class EcomBcmTrack implements Serializable {

    @C09CT("single_product")
    public final BcmStandardTrack singleProduct;

    public EcomBcmTrack() {
        this(null);
    }

    public EcomBcmTrack(BcmStandardTrack bcmStandardTrack) {
        this.singleProduct = bcmStandardTrack;
    }
}
