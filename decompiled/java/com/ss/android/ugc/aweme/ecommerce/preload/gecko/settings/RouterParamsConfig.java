package com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class RouterParamsConfig {

    @C09CT("path")
    public final String path;

    @C09CT("resource")
    public final GeckoResourceItem[] resources;

    public RouterParamsConfig() {
        this(null, new GeckoResourceItem[0]);
    }

    public RouterParamsConfig(String str, GeckoResourceItem[] geckoResourceItemArr) {
        this.path = str;
        this.resources = geckoResourceItemArr;
    }
}
