package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CustomDotGetParams {

    @C09CT("is_cold_start")
    public final int isColdStart;

    @C09CT("is_shop_tab")
    public final int isShopTab;

    @C09CT("mall_version")
    public final String mallVersion;

    @C09CT("shop_tab_position")
    public final int shopTabPosition;

    public CustomDotGetParams(int i, int i2, int i3, String str) {
        this.isShopTab = i;
        this.isColdStart = i2;
        this.shopTabPosition = i3;
        this.mallVersion = str;
    }
}
