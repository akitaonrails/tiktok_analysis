package com.ss.android.ugc.aweme.ecommerce.search.detail.productscard.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes.dex */
public final class EcomSearchMixFeed {

    @C09CT("aweme_info")
    public final Aweme aweme;

    @C09CT("type")
    public final int type;

    public EcomSearchMixFeed() {
        this(0, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcomSearchMixFeed(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcomSearchMixFeed(int i, Aweme aweme) {
        this.type = i;
        this.aweme = aweme;
    }
}
