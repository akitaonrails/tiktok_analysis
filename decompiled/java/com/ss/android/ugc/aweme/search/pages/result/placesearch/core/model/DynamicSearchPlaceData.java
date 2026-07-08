package com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui.RequestInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class DynamicSearchPlaceData {

    @C09CT("requestInfo")
    public final RequestInfo requestInfo;

    @C09CT("searchPOIData")
    public final n searchPOIData;

    public DynamicSearchPlaceData(n nVar, RequestInfo requestInfo) {
        this.searchPOIData = nVar;
        this.requestInfo = requestInfo;
    }
}
