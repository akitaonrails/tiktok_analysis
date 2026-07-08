package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class FlashSaleAtmosphereStock {
    public int LIZ;

    @C09CT("activity_stock")
    public final int activityStock;

    @C09CT("activity_stock_status")
    public final int activityStockStatus;

    @C09CT("activity_stock_text")
    public final String activityStockText;

    @C09CT("total_activity_stock")
    public final int totalActivityStock;

    public final boolean LIZ() {
        int i = this.LIZ;
        int i2 = this.activityStock;
        return 1 <= i2 && i2 < i;
    }

    public FlashSaleAtmosphereStock(int i, int i2, String str, int i3) {
        this.activityStockStatus = i;
        this.activityStock = i2;
        this.activityStockText = str;
        this.totalActivityStock = i3;
    }
}
