package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class FlashSaleControl {

    @C09CT("show_atmosphere_begin_millisecond")
    public final long showAtmosphereBeginMilliSecond;

    @C09CT("show_atmosphere_stock_change_limit")
    public final int showAtmosphereStockChangeLimit;

    @C09CT("show_live_flash_sale_atmosphere")
    public final int showLiveFlashSaleAtmosphere;

    @C09CT("weaken_live_flash_sale_atmosphere")
    public final int weakenLiveFlashSaleAtmosphere;

    public FlashSaleControl(int i, long j, int i2, int i3) {
        this.showLiveFlashSaleAtmosphere = i;
        this.showAtmosphereBeginMilliSecond = j;
        this.showAtmosphereStockChangeLimit = i2;
        this.weakenLiveFlashSaleAtmosphere = i3;
    }
}
