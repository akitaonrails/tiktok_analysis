package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AddItemOperationExtra {

    @C09CT("preload_request_latency_milliseconds")
    public final Long delayRequestMs;

    @C09CT("enable_preload_after_add")
    public final Boolean enablePreloadAfterAdd;

    public AddItemOperationExtra(Long l, Boolean bool) {
        this.delayRequestMs = l;
        this.enablePreloadAfterAdd = bool;
    }
}
