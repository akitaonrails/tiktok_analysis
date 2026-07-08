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

/* JADX INFO: loaded from: classes33.dex */
public final class OecInitData {
    public transient C1563990qnl LIZIZ;

    @C09CT("atmosphere_tags")
    public final List<AtmosphereTag> atmosphereTags;

    @C09CT("pop_auction")
    public final AuctionData auctionData;

    @C09CT("bag_animation")
    public final String bagAnimation;

    @C09CT("bag_index")
    public final int bagIndex;

    @C09CT("bff_data")
    public final PopupCardBffData bffData;

    @C09CT("buy_button_config")
    public final BuyButtonConfig buyButtonConfig;

    @C09CT("card_type")
    public final int cardType;

    @C09CT("common_guide_bubble")
    public final Map<String, LiveBagIconAnimation> commonGuideBubble;

    @C09CT("display_product_num")
    public final int displayProductNum;

    @C09CT("enter_room_prompt")
    public final EnterRoomPrompt enterRoomPrompt;

    @C09CT("flash_sale_atmosphere_info")
    public final FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;

    @C09CT("flash_sale_refresh_control")
    public final FlashSaleControl flashSaleControl;

    @C09CT("hot_tag")
    public final HotTag hotTag;

    @C09CT("is_new_user")
    public final boolean isNewUser;

    @C09CT("is_new_user_fixed")
    public final boolean isNewUserFixed;

    @C09CT("lynx_card_info")
    public LynxCardInfo lynxCardInfo;

    @C09CT("action_info")
    public final NextActionInfo nextActionInfo;

    @C09CT("pdp_top_bubble")
    public final PdpTopBubble pdpTopBubble;

    @C09CT("pin_card_config")
    public final PinCardConfig pinCardConfig;

    @C09CT("pin_card_minimalism")
    public final int pinCardMinimalism;

    @C09CT("pop_card_id")
    public final long popCardId;

    @C09CT("pop_msg_ctx_str")
    public final String popMsgCtxStr;

    @C09CT("pop_product_id")
    public final String popProductId;

    @C09CT("pin_voucher")
    public final LiveVoucher popVoucher;

    @C09CT("preheat_atmosphere_info")
    public final ProductPreheatAtmosphereInfo preheatAtmosphereInfo;

    @C09CT("pop_product")
    public final Product product;

    @C09CT("product_card_config")
    public final ProductCardConfig productCardConfig;

    @C09CT("product_filter_reason")
    public final Integer[] productFilterReason;

    @C09CT("product_num")
    public final int productNum;

    @C09CT("promotion_skin")
    public final PromotionSkin promotionSkin;

    @C09CT("promotion_style")
    @C09CS(StringJsonAdapterFactory.class)
    public final PromotionStyleConfig promotionStyleConfig;

    @C09CT("code_region_info")
    public final String regionInfo;

    @C09CT("schema")
    public final String schema;

    @C09CT("server_time")
    public final long serverTime;

    @C09CT("shopping_bag_list_card")
    public final ShoppingBagList shoppingBagList;
    public final transient long LIZ = SystemClock.elapsedRealtime();

    @C09CT("live_bag_and_pin_card_type")
    public final int liveBagAndPinCardType = 1;
}
