package com.ss.android.ugc.aweme.ecommerce.search.result.ui;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes11.dex */
public final class DynamicSearchShopData {

    @C09CT("nativeConfigInfo")
    public final n nativeConfigInfo;

    @C09CT("requestInfo")
    public final RequestInfo requestInfo;

    @C09CT("searchShopData")
    public final n shopList;

    @C09CT("techLogParams")
    public final n techLogParams;

    public DynamicSearchShopData(n nVar, RequestInfo requestInfo, n nVar2, n nVar3) {
        this.shopList = nVar;
        this.requestInfo = requestInfo;
        this.techLogParams = nVar2;
        this.nativeConfigInfo = nVar3;
    }
}
