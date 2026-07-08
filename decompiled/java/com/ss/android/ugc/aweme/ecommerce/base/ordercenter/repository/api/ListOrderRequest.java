package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ListOrderRequest {

    @C09CT("req")
    public final List<ListOrderComponentReq> req;

    public ListOrderRequest(List<ListOrderComponentReq> list) {
        this.req = list;
    }
}
