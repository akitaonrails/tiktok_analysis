package com.ss.android.ugc.aweme.search.ecom.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class EcomSearchInfo implements Serializable {

    @C09CT("ecom_search_bubble_info")
    public final EcSearchBubbleInfo ecomSearchBubbleInfo;

    @C09CT("query_addr_intent")
    public final QueryAddrIntent queryAddrIntent;

    @C09CT("shop_tab_info")
    public ShopTabInfo shopTabInfo;

    @C09CT("shop_tab_move_to_second")
    public Boolean shopTabMoveToSecond;

    public EcomSearchInfo() {
        this(null, null, null, null);
    }

    public final void setShopTabInfo(ShopTabInfo shopTabInfo) {
        this.shopTabInfo = shopTabInfo;
    }

    public final void setShopTabMoveToSecond(Boolean bool) {
        this.shopTabMoveToSecond = bool;
    }

    public EcomSearchInfo(QueryAddrIntent queryAddrIntent, EcSearchBubbleInfo ecSearchBubbleInfo, ShopTabInfo shopTabInfo, Boolean bool) {
        this.queryAddrIntent = queryAddrIntent;
        this.ecomSearchBubbleInfo = ecSearchBubbleInfo;
        this.shopTabInfo = shopTabInfo;
        this.shopTabMoveToSecond = bool;
    }
}
