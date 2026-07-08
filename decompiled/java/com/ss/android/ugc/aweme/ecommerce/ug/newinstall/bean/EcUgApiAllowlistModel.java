package com.ss.android.ugc.aweme.ecommerce.ug.newinstall.bean;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class EcUgApiAllowlistModel {

    @C09CT("api")
    public final List<String> api;

    public EcUgApiAllowlistModel() {
        this(C1697810uHb.LJIIJJI("/api/v1/mall/", "/api/v1/shop/recommend/feed/"));
    }

    public EcUgApiAllowlistModel(List<String> list) {
        this.api = list;
    }
}
