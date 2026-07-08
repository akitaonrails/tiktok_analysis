package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderSubmitRefreshEventParams {

    @C09CT("change_type")
    public final Integer changeType;

    public OrderSubmitRefreshEventParams() {
        this(null);
    }

    public OrderSubmitRefreshEventParams(Integer num) {
        this.changeType = num;
    }
}
