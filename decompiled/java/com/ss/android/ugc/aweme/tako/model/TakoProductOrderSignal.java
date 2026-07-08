package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoProductOrderSignal {

    @C09CT("order_id")
    public final String orderId;

    @C09CT("product_id")
    public final String productId;

    @C09CT("timestamp")
    public final long time;

    public TakoProductOrderSignal() {
        this("", "", 0L);
    }

    public TakoProductOrderSignal(String str, String str2, long j) {
        this.productId = str;
        this.orderId = str2;
        this.time = j;
    }
}
