package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo;

import X.C1563990qnl;
import X.C182R;
import X.C21194017wo;
import X.C21196917xH;
import X.C2188811AlT;
import X.C2341109Fh;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommercebase.model.EnhancedBrandLogo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonProperty;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.DepositPrice;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveDaInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.NextActionInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PdpTopBubble;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ProductCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PromotionSkin;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.StaticAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ThirdLineTopBrand;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.TopBrand;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class UsPopupCardVO {
    public static final C182R Companion = new C182R();
    public static Map<String, BuyButtonProperty> buyButtonConfig;
    public Boolean advancedFlashSale;
    public String afterCouponPriceContent;
    public final List<Object> assistantModules;
    public final Boolean assistantSwitch;
    public List<AtmosphereTag> atmosphereTags;
    public AuctionData auctionData;
    public int bagIndex;
    public BcmStandardTrack bcmStandardTrack;
    public final PopupCardBffData bffData;
    public final Integer bizType;
    public int buyButtonType;
    public int cardType;
    public transient C1563990qnl chainInfo;
    public final String chainKey;
    public final LiveDaInfo commonDaInfo;
    public Map<String, ? extends Object> coverComponentDaInfo;
    public final long createTime;
    public final String daInfo;
    public DepositPrice depositPrice;
    public String discount;
    public boolean enableLiveFlashSaleAtmosphere;
    public EnhancedBrandLogo enhancedBrandLogo;
    public final Map<String, String> extra;
    public FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
    public final C21196917xH flashSaleInfo;
    public int flashSaleStockLimit;
    public String formatAvailablePrice;
    public String formatOriginPrice;
    public String fromMessageId;
    public boolean hasElasticImg;
    public boolean hasPrefetched;
    public String imageUrl;
    public String imageUrlKey;
    public boolean isFromMessage;
    public boolean jumpPdpSetCacheEnable;
    public JSONObject latencyInfo;
    public int liveBagAndPinCardType;
    public final LynxCardInfo lynxCardInfo;
    public NextActionInfo nextActionInfo;
    public final String oecInitData;
    public final String openUrl;
    public final PdpTopBubble pdpTopBubble;
    public final PinCardConfig pinCardConfig;
    public final List<PlacementLabel> placementLabels;
    public final int platform;
    public long popCardId;
    public final String popMsgCtxStr;
    public final String popRespData;
    public Integer popupCardStatus;
    public final String price;
    public final String priceCurrency;
    public final String priceDecimalNum;
    public final String priceIntegerNum;
    public final String pricePrefix;
    public final ProductCardConfig productCardConfig;
    public final long productId;
    public final String productRating;
    public int productStatus;
    public Integer productType;
    public PromotionInfo promotionInfo;
    public PromotionSkin promotionSkin;
    public PromotionView promotionView;
    public final Long requestTime;
    public final String schema;
    public final String sellerId;
    public final SellingView sellingView;
    public final long serverTime;
    public ShoppingBagList shoppingBagList;
    public long showAtmosphereBeginMilliSecond;
    public final List<Object> skcInfo;
    public final List<String> skuIds;
    public Integer smartAiCoverIndex;
    public final String soldCount;
    public final String source;
    public final int sourceFrom;
    public ECommerceMessage sourceMessage;
    public List<StaticAtmosphereInfo> staticAtmosphereInfoList;
    public ThirdLineTopBrand thirdLineTopBrand;
    public String title;
    public TopBrand topBrand;
    public final String visitReportParams;
    public int weakenLiveFlashSaleAtmosphere;

    public final String hasFansPrice() {
        List<PromotionItem> promotion_items;
        PromotionView promotionView = this.promotionView;
        if (promotionView == null || (promotion_items = promotionView.getPromotion_items()) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        Iterator<PromotionItem> it2 = promotion_items.iterator();
        while (it2.hasNext()) {
            PromotionItem next = it2.next();
            Integer type = next.getType();
            if (type != null && type.intValue() == 3) {
                return next != null ? "1" : CardStruct.IStatusCode.DEFAULT;
            }
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public final boolean isInStock() {
        return this.productStatus == 90;
    }

    public final boolean isSoldOut() {
        return this.productStatus == 80;
    }

    public final String getLynxCardData() {
        if (!C21194017wo.LIZIZ(this)) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("empty data");
            return null;
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx data from pop resp data : ");
        sbLIZ.append(this.popRespData);
        sbLIZ.append(", ");
        sbLIZ.append(this.oecInitData);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        String str = this.popRespData;
        return str == null ? this.oecInitData : str;
    }

    public final boolean isFromMessage() {
        return this.isFromMessage;
    }

    public final void fromMessage(ECommerceMessage eCommerceMessage) {
        this.isFromMessage = true;
        this.sourceMessage = eCommerceMessage;
        this.fromMessageId = String.valueOf(eCommerceMessage.getMessageId());
    }

    public final void setAdvancedFlashSale(Boolean bool) {
        this.advancedFlashSale = bool;
    }

    public final void setAfterCouponPriceContent(String str) {
        this.afterCouponPriceContent = str;
    }

    public final void setAtmosphereTags(List<AtmosphereTag> list) {
        this.atmosphereTags = list;
    }

    public final void setAuctionData(AuctionData auctionData) {
        this.auctionData = auctionData;
    }

    public final void setBagIndex(int i) {
        this.bagIndex = i;
    }

    public final void setBcmStandardTrack(BcmStandardTrack bcmStandardTrack) {
        this.bcmStandardTrack = bcmStandardTrack;
    }

    public final void setBuyButtonType(int i) {
        this.buyButtonType = i;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setChainInfo(C1563990qnl c1563990qnl) {
        this.chainInfo = c1563990qnl;
    }

    public final void setCoverComponentDaInfo(Map<String, ? extends Object> map) {
        this.coverComponentDaInfo = map;
    }

    public final void setDepositPrice(DepositPrice depositPrice) {
        this.depositPrice = depositPrice;
    }

    public final void setDiscount(String str) {
        this.discount = str;
    }

    public final void setEnableLiveFlashSaleAtmosphere(boolean z) {
        this.enableLiveFlashSaleAtmosphere = z;
    }

    public final void setEnhancedBrandLogo(EnhancedBrandLogo enhancedBrandLogo) {
        this.enhancedBrandLogo = enhancedBrandLogo;
    }

    public final void setFlashSaleAtmosphereInfo(FlashSaleAtmosphereInfo flashSaleAtmosphereInfo) {
        this.flashSaleAtmosphereInfo = flashSaleAtmosphereInfo;
    }

    public final void setFlashSaleStockLimit(int i) {
        this.flashSaleStockLimit = i;
    }

    public final void setFormatAvailablePrice(String str) {
        this.formatAvailablePrice = str;
    }

    public final void setFormatOriginPrice(String str) {
        this.formatOriginPrice = str;
    }

    public final void setFromMessage(boolean z) {
        this.isFromMessage = z;
    }

    public final void setFromMessageId(String str) {
        this.fromMessageId = str;
    }

    public final void setHasElasticImg(boolean z) {
        this.hasElasticImg = z;
    }

    public final void setHasPrefetched(boolean z) {
        this.hasPrefetched = z;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setImageUrlKey(String str) {
        this.imageUrlKey = str;
    }

    public final void setJumpPdpSetCacheEnable(boolean z) {
        this.jumpPdpSetCacheEnable = z;
    }

    public final void setLatencyInfo(JSONObject jSONObject) {
        this.latencyInfo = jSONObject;
    }

    public final void setLiveBagAndPinCardType(int i) {
        this.liveBagAndPinCardType = i;
    }

    public final void setNextActionInfo(NextActionInfo nextActionInfo) {
        this.nextActionInfo = nextActionInfo;
    }

    public final void setPopCardId(long j) {
        this.popCardId = j;
    }

    public final void setPopupCardStatus(Integer num) {
        this.popupCardStatus = num;
    }

    public final void setProductStatus(int i) {
        this.productStatus = i;
    }

    public final void setProductType(Integer num) {
        this.productType = num;
    }

    public final void setPromotionInfo(PromotionInfo promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public final void setPromotionSkin(PromotionSkin promotionSkin) {
        this.promotionSkin = promotionSkin;
    }

    public final void setPromotionView(PromotionView promotionView) {
        this.promotionView = promotionView;
    }

    public final void setShoppingBagList(ShoppingBagList shoppingBagList) {
        this.shoppingBagList = shoppingBagList;
    }

    public final void setShowAtmosphereBeginMilliSecond(long j) {
        this.showAtmosphereBeginMilliSecond = j;
    }

    public final void setSmartAiCoverIndex(Integer num) {
        this.smartAiCoverIndex = num;
    }

    public final void setSourceMessage(ECommerceMessage eCommerceMessage) {
        this.sourceMessage = eCommerceMessage;
    }

    public final void setStaticAtmosphereInfoList(List<StaticAtmosphereInfo> list) {
        this.staticAtmosphereInfoList = list;
    }

    public final void setThirdLineTopBrand(ThirdLineTopBrand thirdLineTopBrand) {
        this.thirdLineTopBrand = thirdLineTopBrand;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTopBrand(TopBrand topBrand) {
        this.topBrand = topBrand;
    }

    public final void setWeakenLiveFlashSaleAtmosphere(int i) {
        this.weakenLiveFlashSaleAtmosphere = i;
    }

    public UsPopupCardVO(String str, PopupCardBffData popupCardBffData, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, String str11, int i2, int i3, String str12, String str13, boolean z, long j, String str14, String str15, C21196917xH c21196917xH, List<PlacementLabel> list, PromotionSkin promotionSkin, PromotionView promotionView, int i4, List<AtmosphereTag> list2, Map<String, String> map, String str16, String str17, SellingView sellingView, List<String> list3, String str18, String str19, String str20, Boolean bool, List<Object> list4, long j2, long j3, Integer num, List<Object> list5, String str21, EnhancedBrandLogo enhancedBrandLogo, FlashSaleAtmosphereInfo flashSaleAtmosphereInfo, String str22, LiveDaInfo liveDaInfo, int i5, Boolean bool2, int i6, boolean z2, long j4, int i7, int i8, Integer num2, PromotionInfo promotionInfo, int i9, ShoppingBagList shoppingBagList, BcmStandardTrack bcmStandardTrack, Integer num3, Map<String, ? extends Object> map2, boolean z3, TopBrand topBrand, ThirdLineTopBrand thirdLineTopBrand, PdpTopBubble pdpTopBubble, AuctionData auctionData, Integer num4, NextActionInfo nextActionInfo, List<StaticAtmosphereInfo> list6, DepositPrice depositPrice, long j5, LynxCardInfo lynxCardInfo, PinCardConfig pinCardConfig, ProductCardConfig productCardConfig, String str23, JSONObject jSONObject, String str24) {
        this.oecInitData = str;
        this.bffData = popupCardBffData;
        this.popRespData = str2;
        this.requestTime = l;
        this.title = str3;
        this.price = str4;
        this.pricePrefix = str5;
        this.priceIntegerNum = str6;
        this.priceDecimalNum = str7;
        this.priceCurrency = str8;
        this.openUrl = str9;
        this.source = str10;
        this.sourceFrom = i;
        this.schema = str11;
        this.platform = i2;
        this.productStatus = i3;
        this.imageUrl = str12;
        this.imageUrlKey = str13;
        this.hasElasticImg = z;
        this.productId = j;
        this.formatOriginPrice = str14;
        this.formatAvailablePrice = str15;
        this.flashSaleInfo = c21196917xH;
        this.placementLabels = list;
        this.promotionSkin = promotionSkin;
        this.promotionView = promotionView;
        this.bagIndex = i4;
        this.atmosphereTags = list2;
        this.extra = map;
        this.soldCount = str16;
        this.productRating = str17;
        this.sellingView = sellingView;
        this.skuIds = list3;
        this.visitReportParams = str18;
        this.chainKey = str19;
        this.sellerId = str20;
        this.assistantSwitch = bool;
        this.assistantModules = list4;
        this.createTime = j2;
        this.serverTime = j3;
        this.bizType = num;
        this.skcInfo = list5;
        this.discount = str21;
        this.enhancedBrandLogo = enhancedBrandLogo;
        this.flashSaleAtmosphereInfo = flashSaleAtmosphereInfo;
        this.daInfo = str22;
        this.commonDaInfo = liveDaInfo;
        this.buyButtonType = i5;
        this.advancedFlashSale = bool2;
        this.liveBagAndPinCardType = i6;
        this.enableLiveFlashSaleAtmosphere = z2;
        this.showAtmosphereBeginMilliSecond = j4;
        this.flashSaleStockLimit = i7;
        this.weakenLiveFlashSaleAtmosphere = i8;
        this.popupCardStatus = num2;
        this.promotionInfo = promotionInfo;
        this.cardType = i9;
        this.shoppingBagList = shoppingBagList;
        this.bcmStandardTrack = bcmStandardTrack;
        this.smartAiCoverIndex = num3;
        this.coverComponentDaInfo = map2;
        this.jumpPdpSetCacheEnable = z3;
        this.topBrand = topBrand;
        this.thirdLineTopBrand = thirdLineTopBrand;
        this.pdpTopBubble = pdpTopBubble;
        this.auctionData = auctionData;
        this.productType = num4;
        this.nextActionInfo = nextActionInfo;
        this.staticAtmosphereInfoList = list6;
        this.depositPrice = depositPrice;
        this.popCardId = j5;
        this.lynxCardInfo = lynxCardInfo;
        this.pinCardConfig = pinCardConfig;
        this.productCardConfig = productCardConfig;
        this.afterCouponPriceContent = str23;
        this.latencyInfo = jSONObject;
        this.popMsgCtxStr = str24;
    }
}
