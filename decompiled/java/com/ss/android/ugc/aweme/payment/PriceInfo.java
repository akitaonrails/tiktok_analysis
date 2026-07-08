package com.ss.android.ugc.aweme.payment;

import X.C09CT;
import com.ss.android.ugc.aweme.components.purchaseoption.PricePacket;

/* JADX INFO: loaded from: classes25.dex */
public final class PriceInfo {

    @C09CT("discounted_price")
    public final PricePacket discountedPrice;

    @C09CT("original_price")
    public final PricePacket originalPrice;

    public PriceInfo() {
        this(new PricePacket(null, null, null, null), new PricePacket(null, null, null, null));
    }

    public PriceInfo(PricePacket pricePacket, PricePacket pricePacket2) {
        this.originalPrice = pricePacket;
        this.discountedPrice = pricePacket2;
    }
}
