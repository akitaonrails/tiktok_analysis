package com.ss.android.ugc.aweme.ecommerce.search.result.model;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.result.ui.RequestInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class DynamicSearchResponseData {

    @C09CT("requestInfo")
    public final RequestInfo requestInfo;

    @C09CT("searchResponseData")
    public final n response;

    @C09CT("techLogParams")
    public n techLogParams;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSearchResponseData)) {
            return false;
        }
        DynamicSearchResponseData dynamicSearchResponseData = (DynamicSearchResponseData) obj;
        return Intrinsics.LJFF(this.response, dynamicSearchResponseData.response) && Intrinsics.LJFF(this.requestInfo, dynamicSearchResponseData.requestInfo) && Intrinsics.LJFF(this.techLogParams, dynamicSearchResponseData.techLogParams);
    }

    public DynamicSearchResponseData(n nVar, RequestInfo requestInfo, n nVar2) {
        this.response = nVar;
        this.requestInfo = requestInfo;
        this.techLogParams = nVar2;
    }
}
