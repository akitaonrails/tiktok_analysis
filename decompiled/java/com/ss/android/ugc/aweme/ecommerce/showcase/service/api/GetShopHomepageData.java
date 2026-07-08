package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.Shop;

/* JADX INFO: loaded from: classes27.dex */
public final class GetShopHomepageData {

    @C09CT("background")
    public final ShopBackground background;

    @C09CT("can_share")
    public final boolean canShare;

    @C09CT("cart_entry")
    public final CartEntry cartEntry;

    @C09CT("creator_list")
    public final ShopCreator[] creatorList;

    @C09CT("ecommerce_center_schema")
    public final String ecommerceCenterSchema;

    @C09CT("im_pigeon_schema")
    public final String imPigeonSchema;

    @C09CT("live_info")
    public final ShopLiveInfo liveInfo;

    @C09CT("unread_message_count")
    public final Integer messageCount;

    @C09CT("shop")
    public final Shop shop;

    public GetShopHomepageData(Shop shop, ShopCreator[] shopCreatorArr, ShopBackground shopBackground, ShopLiveInfo shopLiveInfo, String str, String str2, CartEntry cartEntry, Integer num, boolean z) {
        this.shop = shop;
        this.creatorList = shopCreatorArr;
        this.background = shopBackground;
        this.liveInfo = shopLiveInfo;
        this.imPigeonSchema = str;
        this.ecommerceCenterSchema = str2;
        this.cartEntry = cartEntry;
        this.messageCount = num;
        this.canShare = z;
    }
}
