package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class PdpLynxCardModel {

    @C09CT("power_item_content_type")
    public final int powerItemContentType;

    @C09CT("view_type")
    public final String viewType;

    public PdpLynxCardModel() {
        this(null, 50000);
    }

    public PdpLynxCardModel(String str, int i) {
        this.viewType = str;
        this.powerItemContentType = i;
    }
}
