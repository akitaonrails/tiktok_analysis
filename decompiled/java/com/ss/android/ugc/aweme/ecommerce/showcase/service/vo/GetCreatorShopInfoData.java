package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class GetCreatorShopInfoData {

    @C09CT("creator_role")
    public final int creatorRole;

    @C09CT("entrance_pattern")
    public final int entrancePattern;

    @C09CT("shop")
    public final Shop shop;

    @C09CT("shop_link")
    public final String shopLink;

    public GetCreatorShopInfoData(String str, Shop shop, int i, int i2) {
        this.shopLink = str;
        this.shop = shop;
        this.creatorRole = i;
        this.entrancePattern = i2;
    }
}
