package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.pdp;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PortableViewConfig {

    @C09CT("view_data")
    public final String viewData;

    @C09CT("view_id")
    public final String viewId;

    @C09CT("view_position")
    public final String viewPosition;

    public PortableViewConfig() {
        this(null, null, null);
    }

    public PortableViewConfig(String str, String str2, String str3) {
        this.viewId = str;
        this.viewData = str2;
        this.viewPosition = str3;
    }
}
