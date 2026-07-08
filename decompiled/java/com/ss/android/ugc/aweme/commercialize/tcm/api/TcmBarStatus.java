package com.ss.android.ugc.aweme.commercialize.tcm.api;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class TcmBarStatus {

    @C09CT("bar_status")
    public final int barStatus;

    @C09CT("item_id")
    public final long itemId;

    @C09CT("order_id")
    public final long orderId;

    public TcmBarStatus() {
        this(0L, 0, 0L);
    }

    public TcmBarStatus(long j, int i, long j2) {
        this.itemId = j;
        this.barStatus = i;
        this.orderId = j2;
    }
}
