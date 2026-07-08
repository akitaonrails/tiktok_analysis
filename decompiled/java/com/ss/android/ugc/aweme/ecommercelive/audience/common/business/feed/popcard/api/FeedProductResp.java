package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.data.FeedProduct;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList;

/* JADX INFO: loaded from: classes33.dex */
public final class FeedProductResp {

    @C09CT("pop_auction")
    public final AuctionData auctionData;

    @C09CT("bff_data")
    public final BFFData bffData;

    @C09CT("card_type")
    public final Integer cardType;

    @C09CT("go_live_card_product")
    public GoLiveCard goLiveProduct;

    @C09CT("need_pull_shopping_bag_list")
    public Boolean needPullShoppingBagList;

    @C09CT("product")
    public final FeedProduct product;

    @C09CT("product_info")
    public final Product productInfo;

    @C09CT("promotion_style")
    public final String promotionStyle;

    @C09CT("server_time")
    public final long serverTime;

    @C09CT("shopping_bag_list_card")
    public ShoppingBagList shoppingBagListCard;

    public FeedProductResp(FeedProduct feedProduct, long j, Product product, String str, GoLiveCard goLiveCard, ShoppingBagList shoppingBagList, Integer num, Boolean bool, AuctionData auctionData, BFFData bFFData) {
        this.product = feedProduct;
        this.serverTime = j;
        this.productInfo = product;
        this.promotionStyle = str;
        this.goLiveProduct = goLiveCard;
        this.shoppingBagListCard = shoppingBagList;
        this.cardType = num;
        this.needPullShoppingBagList = bool;
        this.auctionData = auctionData;
        this.bffData = bFFData;
    }
}
