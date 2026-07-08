package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommercebase.model.EnhancedBrandLogo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelSingleConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class Product {

    @C09CT("add_to_cart_button")
    public final AddToCartButton addToCartButton;

    @C09CT("advanced_flash_sale")
    public final Boolean advancedFlashSale;

    @C09CT("after_coupon_price_show_content")
    public final String afterCouponPriceContent;

    @C09CT("assistant_modules")
    public final List<Object> assistantModules;

    @C09CT("auction_data")
    public final AuctionData auctionData;

    @C09CT("available_price_decimal")
    public final String availablePriceDecimalNum;

    @C09CT("available_price_num")
    public final String availablePriceIntegerNum;

    @C09CT("bag_index")
    public final int bagIndex;

    @C09CT("bcm_standard_track")
    public final BcmStandardTrack bcmStandardTrack;

    @C09CT("biz_type")
    public final Integer bizType;

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("common_da_info")
    public final LiveDaInfo commonDaInfo;

    @C09CT("component_data")
    public final ComponentData componentData;

    @C09CT("cover")
    public final ECImage cover;

    @C09CT("cover_bottom_top_brand")
    public final TopBrand coverBottomTopBrand;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("deposit_price")
    public final DepositPrice depositPrice;

    @C09CT("detail_url")
    public final String detailUrl;

    @C09CT("discount")
    public final String discount;

    @C09CT("display_available_price")
    public final String displayAvailablePrice;

    @C09CT("display_currency")
    public final String displayCurrency;

    @C09CT("elastic_img")
    public final List<ECImage> elasticImg;

    @C09CT("enhanced_brand_logo")
    public final EnhancedBrandLogo enhancedBrandLogo;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("flash_sale_info")
    public final FlashSaleDTO flashSaleInfo;

    @C09CT("format_available_price")
    public final String formatAvailablePrice;

    @C09CT("format_origin_price")
    public final String formatOriginPrice;

    @C09CT("format_price")
    public final String formatPrice;

    @C09CT("live_bag_buy_button")
    public final LiveBagBuyButton liveBagBuyButton;

    @C09CT("order_request_params")
    public final String orderRequestParams;

    @C09CT("pdp_access_control")
    public final PDPAccessControl pdpAccessControl;

    @C09CT("pin_card_buy_button")
    public final PinCardBuyButton pinCardBuyButton;

    @C09CT("platform")
    public final int platform;

    @C09CT("price")
    public final Long price;

    @C09CT("price_prefix")
    public final String pricePrefix;

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_rating")
    public final String productRating;

    @C09CT("product_status")
    public final int productStatus;

    @C09CT("product_type")
    public final int productType;

    @C09CT("promotion_info")
    public final PromotionInfo promotionInfo;

    @C09CT("promotion_view")
    public final PromotionView promotionView;

    @C09CT("schema")
    public final String schema;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("selling_view")
    public final SellingView sellingView;

    @C09CT("skc_info")
    public final List<Object> skcInfo;

    @C09CT("sku_ids")
    public final List<String> skuIds;

    @C09CT("sold_count")
    public final String soldCount;

    @C09CT("source")
    public final String source;

    @C09CT("source_from")
    public final int source_from;

    @C09CT("static_atmosphere_info_list")
    public final List<StaticAtmosphereInfo> staticAtmosphereInfoList;

    @C09CT("third_line_enhanced_brand_logo")
    public final ThirdLineTopBrand thirdLineEnhancedBrandLogo;

    @C09CT("title")
    public final String title;

    @C09CT("user_right_view")
    public final UserRightView userRightView;

    @C09CT("visit_report_params")
    public final String visitReportParams;

    public Product() {
        this("", "", null, null, "", "", 0, null, 0, "", "", "", 0, "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null);
    }

    public final String LIZIZ() {
        String str;
        if (this.elasticImg != null && (!r0.isEmpty())) {
            return ((ECImage) ListProtector.get(this.elasticImg, 0)).url;
        }
        ECImage eCImage = this.cover;
        return (eCImage == null || (str = eCImage.url) == null) ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[PHI: r0
      0x0025: PHI (r0v3 java.lang.String) = (r0v2 java.lang.String), (r0v9 java.lang.String) binds: [B:12:0x0022, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZJ() {
        /*
            r3 = this;
            java.util.List<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage> r0 = r3.elasticImg
            java.lang.String r2 = ""
            if (r0 == 0) goto L1c
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L1c
            java.util.List<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage> r1 = r3.elasticImg
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage r0 = (com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage) r0
            java.lang.String r0 = r0.urlKey
            if (r0 != 0) goto L25
        L1b:
            return r2
        L1c:
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage r0 = r3.cover
            if (r0 == 0) goto L1b
            java.lang.String r0 = r0.urlKey
            if (r0 != 0) goto L25
            return r2
        L25:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product.LIZJ():java.lang.String");
    }

    public final void LIZ(PromotionStyleConfig promotionStyleConfig) {
        HashMap<String, PromotionLabelSingleConfig> map;
        List<PlacementLabel> list;
        int iIntValue;
        Integer num;
        List<PromotionLabel> list2;
        int iIntValue2;
        Integer num2;
        List<PromotionLabel> list3;
        int iIntValue3;
        Integer num3;
        if (promotionStyleConfig == null) {
            return;
        }
        PromotionInfo promotionInfo = this.promotionInfo;
        if (promotionInfo != null) {
            promotionInfo.setStyleConfig(promotionStyleConfig);
        }
        PromotionLabelConfig promotionLabelConfig = promotionStyleConfig.promotionLabelConfig;
        if (promotionLabelConfig != null && (map = promotionLabelConfig.configs) != null) {
            PromotionLabelSingleConfig promotionLabelSingleConfig = map.get("-1");
            PromotionInfo promotionInfo2 = this.promotionInfo;
            if (promotionInfo2 != null && (list3 = promotionInfo2.promotionLabels) != null) {
                for (PromotionLabel promotionLabel : list3) {
                    PromotionLabelSingleConfig promotionLabelSingleConfig2 = map.get(String.valueOf(promotionLabel.type));
                    if (promotionLabelSingleConfig2 == null) {
                        promotionLabelSingleConfig2 = promotionLabelSingleConfig;
                        if (promotionLabelSingleConfig != null) {
                        }
                    }
                    PromotionLabelConfig promotionLabelConfig2 = promotionStyleConfig.promotionLabelConfig;
                    if (promotionLabelConfig2 != null && (num3 = promotionLabelConfig2.height) != null) {
                        iIntValue3 = num3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    promotionLabelSingleConfig2.LIZ = iIntValue3;
                    promotionLabel.setPromotionLabelSingleConfig(promotionLabelSingleConfig2);
                }
            }
            PromotionInfo promotionInfo3 = this.promotionInfo;
            if (promotionInfo3 != null && (list2 = promotionInfo3.secondPromotionLabels) != null) {
                for (PromotionLabel promotionLabel2 : list2) {
                    PromotionLabelSingleConfig promotionLabelSingleConfig3 = map.get(String.valueOf(promotionLabel2.type));
                    if (promotionLabelSingleConfig3 == null) {
                        promotionLabelSingleConfig3 = promotionLabelSingleConfig;
                        if (promotionLabelSingleConfig != null) {
                        }
                    }
                    PromotionLabelConfig promotionLabelConfig3 = promotionStyleConfig.promotionLabelConfig;
                    if (promotionLabelConfig3 != null && (num2 = promotionLabelConfig3.height) != null) {
                        iIntValue2 = num2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    promotionLabelSingleConfig3.LIZ = iIntValue2;
                    promotionLabel2.setPromotionLabelSingleConfig(promotionLabelSingleConfig3);
                }
            }
            PromotionInfo promotionInfo4 = this.promotionInfo;
            if (promotionInfo4 != null && (list = promotionInfo4.placementLabels) != null) {
                Iterator<PlacementLabel> it2 = list.iterator();
                while (it2.hasNext()) {
                    List<PromotionLabel> list4 = it2.next().placementLabelList;
                    if (list4 != null) {
                        for (PromotionLabel promotionLabel3 : list4) {
                            PromotionLabelSingleConfig promotionLabelSingleConfig4 = map.get(String.valueOf(promotionLabel3.type));
                            if (promotionLabelSingleConfig4 != null) {
                                PromotionLabelConfig promotionLabelConfig4 = promotionStyleConfig.promotionLabelConfig;
                                if (promotionLabelConfig4 != null && (num = promotionLabelConfig4.height) != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                promotionLabelSingleConfig4.LIZ = iIntValue;
                                promotionLabel3.setPromotionLabelSingleConfig(promotionLabelSingleConfig4);
                            }
                        }
                    }
                }
            }
        }
    }

    public Product(String str, String str2, ECImage eCImage, Long l, String str3, String str4, int i, List<ECImage> list, int i2, String str5, String str6, String str7, int i3, String str8, String str9, String str10, String str11, FlashSaleDTO flashSaleDTO, PromotionView promotionView, Map<String, String> map, String str12, String str13, SellingView sellingView, UserRightView userRightView, List<String> list2, String str14, String str15, String str16, List<Object> list3, int i4, AddToCartButton addToCartButton, String str17, String str18, String str19, Integer num, List<Object> list4, String str20, String str21, EnhancedBrandLogo enhancedBrandLogo, PromotionInfo promotionInfo, LiveDaInfo liveDaInfo, PinCardBuyButton pinCardBuyButton, LiveBagBuyButton liveBagBuyButton, Boolean bool, ComponentData componentData, AuctionData auctionData, int i5, BcmStandardTrack bcmStandardTrack, TopBrand topBrand, ThirdLineTopBrand thirdLineTopBrand, List<StaticAtmosphereInfo> list5, DepositPrice depositPrice, String str22, PDPAccessControl pDPAccessControl) {
        this.productId = str;
        this.title = str2;
        this.cover = eCImage;
        this.price = l;
        this.pricePrefix = str3;
        this.detailUrl = str4;
        this.productStatus = i;
        this.elasticImg = list;
        this.platform = i2;
        this.formatPrice = str5;
        this.source = str6;
        this.schema = str7;
        this.source_from = i3;
        this.formatOriginPrice = str8;
        this.formatAvailablePrice = str9;
        this.availablePriceIntegerNum = str10;
        this.availablePriceDecimalNum = str11;
        this.flashSaleInfo = flashSaleDTO;
        this.promotionView = promotionView;
        this.extra = map;
        this.soldCount = str12;
        this.productRating = str13;
        this.sellingView = sellingView;
        this.userRightView = userRightView;
        this.skuIds = list2;
        this.visitReportParams = str14;
        this.chainKey = str15;
        this.sellerId = str16;
        this.assistantModules = list3;
        this.bagIndex = i4;
        this.addToCartButton = addToCartButton;
        this.orderRequestParams = str17;
        this.displayAvailablePrice = str18;
        this.displayCurrency = str19;
        this.bizType = num;
        this.skcInfo = list4;
        this.daInfo = str20;
        this.discount = str21;
        this.enhancedBrandLogo = enhancedBrandLogo;
        this.promotionInfo = promotionInfo;
        this.commonDaInfo = liveDaInfo;
        this.pinCardBuyButton = pinCardBuyButton;
        this.liveBagBuyButton = liveBagBuyButton;
        this.advancedFlashSale = bool;
        this.componentData = componentData;
        this.auctionData = auctionData;
        this.productType = i5;
        this.bcmStandardTrack = bcmStandardTrack;
        this.coverBottomTopBrand = topBrand;
        this.thirdLineEnhancedBrandLogo = thirdLineTopBrand;
        this.staticAtmosphereInfoList = list5;
        this.depositPrice = depositPrice;
        this.afterCouponPriceContent = str22;
        this.pdpAccessControl = pDPAccessControl;
    }
}
