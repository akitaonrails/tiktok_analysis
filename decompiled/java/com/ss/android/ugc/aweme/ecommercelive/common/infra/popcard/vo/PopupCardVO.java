package com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo;

import X.C182S;
import X.C21197017xI;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommercebase.model.EnhancedBrandLogo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonProperty;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveDaInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.NextActionInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OneStepCheckoutConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PDPAccessControl;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PdpTopBubble;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardBuyButton;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ProductPreheatAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PromotionSkin;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ThirdLineTopBrand;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.TopBrand;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.UserRightView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class PopupCardVO {
    public static final C182S Companion = new C182S();
    public static Map<String, BuyButtonProperty> buyButtonConfig;
    public Boolean advancedFlashSale;
    public AnchorPinCardConfig anchorPinCardConfig;
    public final List<Object> assistantModules;
    public final Boolean assistantSwitch;
    public List<AtmosphereTag> atmosphereTags;
    public AuctionData auctionData;
    public int bagIndex;
    public BcmStandardTrack bcmStandardTrack;
    public PopupCardBffData bffData;
    public final Integer bizType;
    public int buyButtonType;
    public int cardType;
    public final String chainKey;
    public final LiveDaInfo commonDaInfo;
    public Map<String, ? extends Object> coverComponentDaInfo;
    public final long createTime;
    public final String daInfo;
    public String discount;
    public boolean enableLiveFlashSaleAtmosphere;
    public EnhancedBrandLogo enhancedBrandLogo;
    public final Map<String, String> extra;
    public FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
    public final C21197017xI flashSaleInfo;
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
    public String lynxCardId;
    public LynxCardInfo lynxCardInfo;
    public String lynxCardSchema;
    public Boolean needRetry;
    public NextActionInfo nextActionInfo;
    public String oecInitData;
    public final String openUrl;
    public PDPAccessControl pdpAccessControl;
    public final PdpTopBubble pdpTopBubble;
    public final PinCardBuyButton pinCardBuyButton;
    public final List<PlacementLabel> placementLabels;
    public final int platform;
    public long popCardId;
    public String popRespData;
    public LiveVoucher popVoucher;
    public Integer popupCardStatus;
    public ProductPreheatAtmosphereInfo preheatAtmosphereInfo;
    public final String price;
    public final String priceCurrency;
    public final String priceDecimalNum;
    public final String priceIntegerNum;
    public final String pricePrefix;
    public final long productId;
    public final String productRating;
    public int productStatus;
    public Integer productType;
    public PromotionInfo promotionInfo;
    public PromotionSkin promotionSkin;
    public PromotionView promotionView;
    public Object rawResponse;
    public Long requestTime;
    public String responseRaw;
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
    public ThirdLineTopBrand thirdLineTopBrand;
    public String title;
    public TopBrand topBrand;
    public final UserRightView userRightView;
    public final String visitReportParams;

    public final int getBillSceneType() {
        OneStepCheckoutConfig oneStepCheckoutConfig;
        Integer num;
        PinCardBuyButton pinCardBuyButton = this.pinCardBuyButton;
        if (pinCardBuyButton == null || (oneStepCheckoutConfig = pinCardBuyButton.oneStepCheckoutConfig) == null || (num = oneStepCheckoutConfig.billSceneType) == null) {
            return 0;
        }
        return num.intValue();
    }

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

    public final boolean isOneStepCheckout() {
        return getBillSceneType() == 1;
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

    public final void setAnchorPinCardConfig(AnchorPinCardConfig anchorPinCardConfig) {
        this.anchorPinCardConfig = anchorPinCardConfig;
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

    public final void setBffData(PopupCardBffData popupCardBffData) {
        this.bffData = popupCardBffData;
    }

    public final void setBuyButtonType(int i) {
        this.buyButtonType = i;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setCoverComponentDaInfo(Map<String, ? extends Object> map) {
        this.coverComponentDaInfo = map;
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

    public final void setLynxCardId(String str) {
        this.lynxCardId = str;
    }

    public final void setLynxCardInfo(LynxCardInfo lynxCardInfo) {
        this.lynxCardInfo = lynxCardInfo;
    }

    public final void setLynxCardSchema(String str) {
        this.lynxCardSchema = str;
    }

    public final void setNeedRetry(Boolean bool) {
        this.needRetry = bool;
    }

    public final void setNextActionInfo(NextActionInfo nextActionInfo) {
        this.nextActionInfo = nextActionInfo;
    }

    public final void setOecInitData(String str) {
        this.oecInitData = str;
    }

    public final void setPdpAccessControl(PDPAccessControl pDPAccessControl) {
        this.pdpAccessControl = pDPAccessControl;
    }

    public final void setPopCardId(long j) {
        this.popCardId = j;
    }

    public final void setPopRespData(String str) {
        this.popRespData = str;
    }

    public final void setPopVoucher(LiveVoucher liveVoucher) {
        this.popVoucher = liveVoucher;
    }

    public final void setPopupCardStatus(Integer num) {
        this.popupCardStatus = num;
    }

    public final void setPreheatAtmosphereInfo(ProductPreheatAtmosphereInfo productPreheatAtmosphereInfo) {
        this.preheatAtmosphereInfo = productPreheatAtmosphereInfo;
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

    public final void setRawResponse(Object obj) {
        this.rawResponse = obj;
    }

    public final void setRequestTime(Long l) {
        this.requestTime = l;
    }

    public final void setResponseRaw(String str) {
        this.responseRaw = str;
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

    public final void setThirdLineTopBrand(ThirdLineTopBrand thirdLineTopBrand) {
        this.thirdLineTopBrand = thirdLineTopBrand;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTopBrand(TopBrand topBrand) {
        this.topBrand = topBrand;
    }

    public PopupCardVO(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, String str10, String str11, boolean z, long j, String str12, String str13, C21197017xI c21197017xI, List<PlacementLabel> list, PromotionSkin promotionSkin, PromotionView promotionView, int i4, List<AtmosphereTag> list2, Map<String, String> map, String str14, String str15, SellingView sellingView, UserRightView userRightView, List<String> list3, String str16, String str17, String str18, Boolean bool, List<Object> list4, long j2, long j3, Integer num, List<Object> list5, String str19, EnhancedBrandLogo enhancedBrandLogo, FlashSaleAtmosphereInfo flashSaleAtmosphereInfo, ProductPreheatAtmosphereInfo productPreheatAtmosphereInfo, String str20, LiveDaInfo liveDaInfo, int i5, Boolean bool2, int i6, boolean z2, long j4, int i7, Integer num2, PromotionInfo promotionInfo, int i8, ShoppingBagList shoppingBagList, BcmStandardTrack bcmStandardTrack, Integer num3, Map<String, ? extends Object> map2, boolean z3, TopBrand topBrand, ThirdLineTopBrand thirdLineTopBrand, PdpTopBubble pdpTopBubble, AuctionData auctionData, Integer num4, NextActionInfo nextActionInfo, LiveVoucher liveVoucher, AnchorPinCardConfig anchorPinCardConfig, Boolean bool3, String str21, Long l, JSONObject jSONObject, String str22, String str23, Object obj, PDPAccessControl pDPAccessControl, PinCardBuyButton pinCardBuyButton, String str24, String str25, long j5, PopupCardBffData popupCardBffData, LynxCardInfo lynxCardInfo) {
        this.title = str;
        this.price = str2;
        this.pricePrefix = str3;
        this.priceIntegerNum = str4;
        this.priceDecimalNum = str5;
        this.priceCurrency = str6;
        this.openUrl = str7;
        this.source = str8;
        this.sourceFrom = i;
        this.schema = str9;
        this.platform = i2;
        this.productStatus = i3;
        this.imageUrl = str10;
        this.imageUrlKey = str11;
        this.hasElasticImg = z;
        this.productId = j;
        this.formatOriginPrice = str12;
        this.formatAvailablePrice = str13;
        this.flashSaleInfo = c21197017xI;
        this.placementLabels = list;
        this.promotionSkin = promotionSkin;
        this.promotionView = promotionView;
        this.bagIndex = i4;
        this.atmosphereTags = list2;
        this.extra = map;
        this.soldCount = str14;
        this.productRating = str15;
        this.sellingView = sellingView;
        this.userRightView = userRightView;
        this.skuIds = list3;
        this.visitReportParams = str16;
        this.chainKey = str17;
        this.sellerId = str18;
        this.assistantSwitch = bool;
        this.assistantModules = list4;
        this.createTime = j2;
        this.serverTime = j3;
        this.bizType = num;
        this.skcInfo = list5;
        this.discount = str19;
        this.enhancedBrandLogo = enhancedBrandLogo;
        this.flashSaleAtmosphereInfo = flashSaleAtmosphereInfo;
        this.preheatAtmosphereInfo = productPreheatAtmosphereInfo;
        this.daInfo = str20;
        this.commonDaInfo = liveDaInfo;
        this.buyButtonType = i5;
        this.advancedFlashSale = bool2;
        this.liveBagAndPinCardType = i6;
        this.enableLiveFlashSaleAtmosphere = z2;
        this.showAtmosphereBeginMilliSecond = j4;
        this.flashSaleStockLimit = i7;
        this.popupCardStatus = num2;
        this.promotionInfo = promotionInfo;
        this.cardType = i8;
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
        this.popVoucher = liveVoucher;
        this.anchorPinCardConfig = anchorPinCardConfig;
        this.needRetry = bool3;
        this.responseRaw = str21;
        this.requestTime = l;
        this.latencyInfo = jSONObject;
        this.lynxCardSchema = str22;
        this.lynxCardId = str23;
        this.rawResponse = obj;
        this.pdpAccessControl = pDPAccessControl;
        this.pinCardBuyButton = pinCardBuyButton;
        this.oecInitData = str24;
        this.popRespData = str25;
        this.popCardId = j5;
        this.bffData = popupCardBffData;
        this.lynxCardInfo = lynxCardInfo;
    }
}
