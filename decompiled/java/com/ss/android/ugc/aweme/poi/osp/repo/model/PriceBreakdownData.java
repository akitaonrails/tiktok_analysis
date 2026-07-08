package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PriceBreakdownData implements Serializable {

    @C09CT("order_summary_total_price")
    public final PriceItem orderSummaryTotalPrice;

    @C09CT("save_amount_tag")
    public final String saveAmount;

    @C09CT("sub_prices")
    public final List<PriceItem> subPrices;

    @C09CT("total_price")
    public final PriceItem totalPrice;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceBreakdownData)) {
            return false;
        }
        PriceBreakdownData priceBreakdownData = (PriceBreakdownData) obj;
        return Intrinsics.LJFF(this.totalPrice, priceBreakdownData.totalPrice) && Intrinsics.LJFF(this.subPrices, priceBreakdownData.subPrices) && Intrinsics.LJFF(this.saveAmount, priceBreakdownData.saveAmount) && Intrinsics.LJFF(this.orderSummaryTotalPrice, priceBreakdownData.orderSummaryTotalPrice);
    }

    public PriceBreakdownData(PriceItem priceItem, List<PriceItem> list, String str, PriceItem priceItem2) {
        this.totalPrice = priceItem;
        this.subPrices = list;
        this.saveAmount = str;
        this.orderSummaryTotalPrice = priceItem2;
    }
}
