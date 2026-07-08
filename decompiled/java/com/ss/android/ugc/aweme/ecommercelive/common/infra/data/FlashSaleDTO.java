package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class FlashSaleDTO {

    @C09CT("begin_time")
    public final long beginTime;

    @C09CT("end_time")
    public final long endTime;

    public FlashSaleDTO() {
        this(0L, 0L);
    }

    public FlashSaleDTO(long j, long j2) {
        this.beginTime = j;
        this.endTime = j2;
    }
}
