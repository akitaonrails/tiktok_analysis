package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CS;
import X.C09CT;
import X.C1563990qnl;
import android.os.SystemClock;
import com.bytedance.android.livesdk.model.message.ext.HotTag;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class PopProductResp {
    public final transient long LIZ;
    public transient String LIZIZ;
    public transient long LIZJ;
    public transient C1563990qnl LIZLLL;
    public transient JSONObject LJ;

    @C09CT("anchor_pin_card_config")
    public final AnchorPinCardConfig anchorPinCardConfig;

    @C09CT("assistant_switch")
    public final Boolean assistantSwitch;

    @C09CT("atmosphere_tags")
    public final List<AtmosphereTag> atmosphereTags;

    @C09CT("pop_auction")
    public final AuctionData auctionData;

    @C09CT("bag_index")
    public final int bagIndex;

    @C09CT("bff_data")
    public final PopupCardBffData bffData;

    @C09CT("buy_button_config")
    public final BuyButtonConfig buyButtonConfig;

    @C09CT("card_type")
    public final int cardType;

    @C09CT("flash_sale_atmosphere_info")
    public final FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;

    @C09CT("flash_sale_refresh_control")
    public final FlashSaleControl flashSaleControl;

    @C09CT("hot_tag")
    public final HotTag hotTag;

    @C09CT("live_bag_and_pin_card_type")
    public final int liveBagAndPinCardType;

    @C09CT("lynx_card_info")
    public LynxCardInfo lynxCardInfo;

    @C09CT("need_retry")
    public final Boolean needRetry;

    @C09CT("action_info")
    public final NextActionInfo nextActionInfo;

    @C09CT("pdp_top_bubble")
    public final PdpTopBubble pdpTopBubble;

    @C09CT("pin_card_config")
    public final PinCardConfig pinCardConfig;

    @C09CT("pin_voucher")
    public final LiveVoucher pinVoucher;

    @C09CT("pop_card_id")
    public final long popCardId;

    @C09CT("pop_msg_ctx_str")
    public final String popMsgCtxStr;

    @C09CT("preheat_atmosphere_info")
    public final ProductPreheatAtmosphereInfo preheatAtmosphereInfo;

    @C09CT("product")
    public final Product product;

    @C09CT("product_card_config")
    public final ProductCardConfig productCardConfig;

    @C09CT("promotion_style")
    @C09CS(StringJsonAdapterFactory.class)
    public final PromotionStyleConfig promotionStyleConfig;

    @C09CT("schema")
    public final String schema;

    @C09CT("server_time")
    public final long serverTime;

    @C09CT("shopping_bag_list_card")
    public final ShoppingBagList shoppingBagList;

    @C09CT("time_tag")
    public final Map<String, Long> timeTag;

    public PopProductResp() {
        this(null, null, null, 0L, null, 0, Boolean.FALSE, null, null, 1, null, null, null, 1, null, null, null, null, null, 0L, null, null, null, null, null, null, Boolean.FALSE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PopProductResp(Product product, HotTag hotTag, List<? extends AtmosphereTag> list, long j, String str, int i, Boolean bool, Map<String, Long> map, FlashSaleAtmosphereInfo flashSaleAtmosphereInfo, int i2, FlashSaleControl flashSaleControl, ProductPreheatAtmosphereInfo productPreheatAtmosphereInfo, PromotionStyleConfig promotionStyleConfig, int i3, BuyButtonConfig buyButtonConfig, ShoppingBagList shoppingBagList, PdpTopBubble pdpTopBubble, NextActionInfo nextActionInfo, LiveVoucher liveVoucher, long j2, LynxCardInfo lynxCardInfo, PinCardConfig pinCardConfig, ProductCardConfig productCardConfig, AuctionData auctionData, PopupCardBffData popupCardBffData, AnchorPinCardConfig anchorPinCardConfig, Boolean bool2, String str2) {
        this.product = product;
        this.hotTag = hotTag;
        this.atmosphereTags = list;
        this.serverTime = j;
        this.schema = str;
        this.bagIndex = i;
        this.assistantSwitch = bool;
        this.timeTag = map;
        this.flashSaleAtmosphereInfo = flashSaleAtmosphereInfo;
        this.liveBagAndPinCardType = i2;
        this.flashSaleControl = flashSaleControl;
        this.preheatAtmosphereInfo = productPreheatAtmosphereInfo;
        this.promotionStyleConfig = promotionStyleConfig;
        this.cardType = i3;
        this.buyButtonConfig = buyButtonConfig;
        this.shoppingBagList = shoppingBagList;
        this.pdpTopBubble = pdpTopBubble;
        this.nextActionInfo = nextActionInfo;
        this.pinVoucher = liveVoucher;
        this.popCardId = j2;
        this.lynxCardInfo = lynxCardInfo;
        this.pinCardConfig = pinCardConfig;
        this.productCardConfig = productCardConfig;
        this.auctionData = auctionData;
        this.bffData = popupCardBffData;
        this.anchorPinCardConfig = anchorPinCardConfig;
        this.needRetry = bool2;
        this.popMsgCtxStr = str2;
        this.LIZ = SystemClock.elapsedRealtime();
        this.LIZJ = System.currentTimeMillis();
    }
}
