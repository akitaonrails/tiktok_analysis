package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelSingleConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class ProductPromotionInfo {

    @C09CT("add_to_cart_button")
    public final AddToCartButton addToCartButton;

    @C09CT("advanced_flash_sale")
    public final Boolean advancedFlashSale;

    @C09CT("available_price_decimal")
    public final String availablePriceDecimalNum;

    @C09CT("available_price_num")
    public final String availablePriceIntegerNum;

    @C09CT("bcm_standard_track")
    public final BcmStandardTrack bcmStandardTrack;

    @C09CT("celling_price")
    public final String cellingPrice;

    @C09CT("currency")
    public final String currency;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("discount")
    public final String discount;

    @C09CT("display_available_price")
    public final String displayAvailablePrice;

    @C09CT("display_currency")
    public final String displayCurrency;

    @C09CT("display_origin_price")
    public final String displayOriginPrice;

    @C09CT("floor_price")
    public final String floorPrice;

    @C09CT("format_available_price")
    public final String formatAvailablePrice;

    @C09CT("format_origin_price")
    public final String formatOriginPrice;

    @C09CT("format_price")
    public final String formatPrice;

    @C09CT("is_disable")
    public final int isDisable;

    @C09CT("live_bag_buy_button")
    public final LiveBagBuyButton liveBagBuyButton;

    @C09CT("pin_card_buy_button")
    public final PinCardBuyButton pinCardBuyButton;

    @C09CT("price_prefix")
    public final String pricePrefix;

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_status")
    public final int productStatus;

    @C09CT("promotion_info")
    public final PromotionInfo promotionInfo;

    @C09CT("selling_view")
    public final SellingView sellingView;

    @C09CT("voucher_list")
    public final List<Object> voucherList;

    public final void LIZ(PromotionStyleConfig promotionStyleConfig) {
        PromotionLabelConfig promotionLabelConfig;
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
        if (promotionStyleConfig != null && (promotionLabelConfig = promotionStyleConfig.promotionLabelConfig) != null && (map = promotionLabelConfig.configs) != null) {
            PromotionLabelSingleConfig promotionLabelSingleConfig = map.get("-1");
            PromotionInfo promotionInfo = this.promotionInfo;
            if (promotionInfo != null && (list3 = promotionInfo.promotionLabels) != null) {
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
            PromotionInfo promotionInfo2 = this.promotionInfo;
            if (promotionInfo2 != null && (list2 = promotionInfo2.secondPromotionLabels) != null) {
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
            PromotionInfo promotionInfo3 = this.promotionInfo;
            if (promotionInfo3 != null && (list = promotionInfo3.placementLabels) != null) {
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

    public ProductPromotionInfo(String str, String str2, int i, String str3, String str4, String str5, List<? extends Object> list, String str6, String str7, AddToCartButton addToCartButton, PromotionInfo promotionInfo, SellingView sellingView, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i2, PinCardBuyButton pinCardBuyButton, LiveBagBuyButton liveBagBuyButton, Boolean bool, String str15, BcmStandardTrack bcmStandardTrack) {
        this.productId = str;
        this.currency = str2;
        this.productStatus = i;
        this.formatPrice = str3;
        this.cellingPrice = str4;
        this.floorPrice = str5;
        this.voucherList = list;
        this.formatOriginPrice = str6;
        this.formatAvailablePrice = str7;
        this.addToCartButton = addToCartButton;
        this.promotionInfo = promotionInfo;
        this.sellingView = sellingView;
        this.displayOriginPrice = str8;
        this.displayAvailablePrice = str9;
        this.displayCurrency = str10;
        this.pricePrefix = str11;
        this.discount = str12;
        this.availablePriceIntegerNum = str13;
        this.availablePriceDecimalNum = str14;
        this.isDisable = i2;
        this.pinCardBuyButton = pinCardBuyButton;
        this.liveBagBuyButton = liveBagBuyButton;
        this.advancedFlashSale = bool;
        this.daInfo = str15;
        this.bcmStandardTrack = bcmStandardTrack;
    }
}
