package com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Conditions {

    @C09CT("block_gift_ids")
    public final List<Long> blockGiftIds;

    @C09CT("gift_price")
    public final long giftPrice;

    public Conditions(long j, List<Long> list) {
        this.giftPrice = j;
        this.blockGiftIds = list;
    }
}
