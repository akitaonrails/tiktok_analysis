package com.bytedance.touchpoint.core.model;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class PrefetchIncentiveAdParam {

    @C09CT("request_params")
    public final PrefetchIncentiveAdRequestParam requestParams;

    public PrefetchIncentiveAdParam() {
        this(null);
    }

    public PrefetchIncentiveAdParam(PrefetchIncentiveAdRequestParam prefetchIncentiveAdRequestParam) {
        this.requestParams = prefetchIncentiveAdRequestParam;
    }
}
