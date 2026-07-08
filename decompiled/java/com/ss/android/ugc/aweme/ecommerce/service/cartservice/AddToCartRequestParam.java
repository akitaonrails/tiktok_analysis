package com.ss.android.ugc.aweme.ecommerce.service.cartservice;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AddToCartRequestParam {

    @C09CT("add_count")
    public final int addCount;

    @C09CT("add_item_page_ctx")
    public final AddItemPageCtx addItemPageCtx;

    @C09CT("add_item_source_page")
    public final int addItemSourcePage;

    @C09CT("biz_extra")
    public final BizExtra bizExtra;

    @C09CT("buyer_addr_id")
    public final String buyerAddrId;

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("entrance_info")
    public final String entranceInfo;

    @C09CT("other_params")
    public final Map<String, Object> otherParams;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("platform_link_based_item")
    public final PlatformLinkInfo platformLinkInfo;

    @C09CT("product_id")
    public final String productId;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("ship_to_addr")
    public final List<Object> shipToAddr;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("user_virtual_info")
    public final UserVirtualAtcInfo virtualInfo;

    public AddToCartRequestParam(String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, Map<String, ? extends Object> map, AddItemPageCtx addItemPageCtx, PlatformLinkInfo platformLinkInfo, BizExtra bizExtra, String str7, List<? extends Object> list, UserVirtualAtcInfo userVirtualAtcInfo) {
        this.productId = str;
        this.sellerId = str2;
        this.skuId = str3;
        this.addCount = i;
        this.addItemSourcePage = i2;
        this.pageSourceInfo = str4;
        this.chainKey = str5;
        this.entranceInfo = str6;
        this.otherParams = map;
        this.addItemPageCtx = addItemPageCtx;
        this.platformLinkInfo = platformLinkInfo;
        this.bizExtra = bizExtra;
        this.buyerAddrId = str7;
        this.shipToAddr = list;
        this.virtualInfo = userVirtualAtcInfo;
    }
}
