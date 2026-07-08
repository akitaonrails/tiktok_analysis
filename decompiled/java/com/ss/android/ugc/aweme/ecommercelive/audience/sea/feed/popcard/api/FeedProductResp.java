package com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.popcard.api;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.GoLiveCard;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.popcard.data.SeaFeedProduct;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList;

/* JADX INFO: loaded from: classes33.dex */
public final class FeedProductResp {

    @C09CT("bff_data")
    public final PopupCardBffData bffData;

    @C09CT("card_type")
    public final Integer cardType;

    @C09CT("flash_sale_atmosphere_info")
    public final FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;

    @C09CT("go_live_card_product")
    public GoLiveCard goLiveProduct;

    @C09CT("lynx_card_info")
    public final LynxCardInfo lynxCardInfo;

    @C09CT("need_pull_shopping_bag_list")
    public Boolean needPullShoppingBagList;

    @C09CT("pin_voucher")
    public final LiveVoucher pinVoucher;

    @C09CT("pop_card_id")
    public final long popCardId;

    @C09CT("product")
    public final SeaFeedProduct product;

    @C09CT("product_info")
    public final Product productInfo;

    @C09CT("promotion_style")
    public final String promotionStyle;

    @C09CT("server_time")
    public final Long serverTime;

    @C09CT("shopping_bag_list_card")
    public ShoppingBagList shoppingBagListCard;

    public FeedProductResp(SeaFeedProduct seaFeedProduct, Long l, Product product, String str, FlashSaleAtmosphereInfo flashSaleAtmosphereInfo, GoLiveCard goLiveCard, ShoppingBagList shoppingBagList, Integer num, Boolean bool, long j, PopupCardBffData popupCardBffData, LynxCardInfo lynxCardInfo, LiveVoucher liveVoucher) {
        this.product = seaFeedProduct;
        this.serverTime = l;
        this.productInfo = product;
        this.promotionStyle = str;
        this.flashSaleAtmosphereInfo = flashSaleAtmosphereInfo;
        this.goLiveProduct = goLiveCard;
        this.shoppingBagListCard = shoppingBagList;
        this.cardType = num;
        this.needPullShoppingBagList = bool;
        this.popCardId = j;
        this.bffData = popupCardBffData;
        this.lynxCardInfo = lynxCardInfo;
        this.pinVoucher = liveVoucher;
    }
}
