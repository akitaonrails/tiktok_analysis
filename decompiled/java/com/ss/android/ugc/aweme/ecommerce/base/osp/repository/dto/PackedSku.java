package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.AbstractC723102s1;
import X.C03O0;
import X.C09CT;
import X.C1019103yf;
import X.C2188811AlT;
import X.EnumC1014603xw;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RangePrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuQuantityProperty;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.PlatformLinkInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PackedSku extends AbstractC723102s1 {
    public final String LL;
    public int LLILLJJLI;
    public String LLILLL;
    public List<PackedSku> LLILZ;

    @C09CT("activity_info")
    public PickTag activityInfo;

    @C09CT("addon_product_promotion_info_list")
    public List<AddonProductPromotionInfo> addonProductPromotionInfoList;

    @C09CT("aggregation_count")
    public Integer aggregationCount;

    @C09CT("aggregation_key")
    public String aggregationKey;

    @C09CT("kol_id")
    public Integer authorId;

    @C09CT("bcm_standard_track")
    public BcmStandardTrack bcmStandardTrack;

    @C09CT("biz_type")
    public Integer bizType;

    @C09CT("bundle_id")
    public String bundleId;

    @C09CT("button")
    public List<Button> button;

    @C09CT("cart_item_id")
    public String cartItemId;

    @C09CT("chain_key")
    public String chainKey;

    @C09CT("channel_reserve_key")
    public String channelReserveKey;

    @C09CT("combo_sub_sku_expression")
    public ComboSubSkuExpression comboSubSkuExpression;

    @C09CT("compliance_labels")
    public List<Icon> complianceLabels;

    @C09CT("display_type")
    public Integer displayType;

    @C09CT("entrance_info")
    public String entranceInfo;

    @C09CT("extra")
    public Map<String, String> extra;

    @C09CT("gift_shop_from_text")
    public String giftFrom;

    @C09CT("image")
    public Image image;

    @C09CT("insurance_module")
    public InsuranceModule insuranceModule;

    @C09CT("is_addon_free_shipping")
    public Boolean isAddonFreeShipping;

    @C09CT("is_single_sku")
    public Boolean isSingleSku;

    @C09CT("link")
    public String link;

    @C09CT("low_stock_warning")
    public String lowStockWarning;

    @C09CT("master_sku_keys")
    public List<String> masterSkuKeys;

    @C09CT("minimum_buy_quantity")
    public Integer minBuyQuantity;

    @C09CT("packed_sku_sale_props")
    public List<PackedSKUSaleProp> packedSKUSaleProps;

    @C09CT("platform_link_based_item")
    public PlatformLinkInfo platformLinkInfo;

    @C09CT("price")
    public SkuPrice price;

    @C09CT("product_id")
    public String productId;

    @C09CT("product_name")
    public String productName;

    @C09CT("product_platform_level1")
    public Integer productPlatformLevel1;

    @C09CT("product_rating")
    public Float productRating;

    @C09CT("product_sale_modes")
    public List<Integer> productSaleModes;

    @C09CT("product_sales")
    public Integer productSales;

    @C09CT("promotion_limit_quantity")
    public Integer promotionLimitQuantity;

    @C09CT("promotion_logos")
    public List<PromotionLogo> promotionLogos;

    @C09CT("promotion_selling_point")
    public List<PromotionSellingPoint> promotionSellingPoint;

    @C09CT("promotion_view")
    public PromotionView promotionView;

    @C09CT("prompt_type")
    public Integer promptType;

    @C09CT("purchase_limit")
    public Integer purchaseLimit;

    @C09CT("purchase_limit_toast")
    public String purchaseLimitToast;

    @C09CT("purchase_limit_type")
    public Integer purchaseLimitType;

    @C09CT("purchase_notice")
    public PurchaseNotice purchaseNotice;

    @C09CT("quantity_control_info")
    public QuantityControlInfo quantityControlInfo;

    @C09CT("quantity_property")
    public SkuQuantityProperty quantityProperty;

    @C09CT("range_price")
    public RangePrice rangePrice;

    @C09CT("product_safety_module")
    public ProductSafetyModule safetyModule;

    @C09CT("sale_props_str")
    public String salePropsStr;

    @C09CT("product_sales_and_rating_prompt")
    public String salesAndRatingPrompt;

    @C09CT("sales_volume")
    public String salesVolume;

    @C09CT("seller_id")
    public String sellerId;

    @C09CT("single_price")
    public SinglePriceItem singlePrice;

    @C09CT("sku_amount")
    public Integer skuAmount;

    @C09CT("sku_card_extend_info")
    public SkuCardExtendInfo skuCardExtendInfo;

    @C09CT("sku_card_layout_type")
    public Integer skuCardLayoutType;

    @C09CT("sku_card_style")
    public SkuCardStyleInfo skuCardStyleInfo;

    @C09CT("sku_id")
    public String skuId;

    @C09CT("sns_display_info")
    public SnsDisplayInfo snsDisplayInfo;

    @C09CT("sns_info")
    public SnsInfo snsInfo;

    @C09CT("source_info")
    public String sourceInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("stock")
    public Integer stock;

    @C09CT("unavailable_text")
    public String unavailableText;

    @C09CT("unique_key")
    public String uniqueKey;

    @C09CT("user_right")
    public UserRight userRight;

    public PackedSku() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackedSku)) {
            return false;
        }
        PackedSku packedSku = (PackedSku) obj;
        return Intrinsics.LJFF(this.productId, packedSku.productId) && Intrinsics.LJFF(this.skuId, packedSku.skuId) && Intrinsics.LJFF(this.bizType, packedSku.bizType) && Intrinsics.LJFF(this.cartItemId, packedSku.cartItemId) && Intrinsics.LJFF(this.status, packedSku.status) && Intrinsics.LJFF(this.productName, packedSku.productName) && Intrinsics.LJFF(this.packedSKUSaleProps, packedSku.packedSKUSaleProps) && Intrinsics.LJFF(this.salePropsStr, packedSku.salePropsStr) && Intrinsics.LJFF(this.stock, packedSku.stock) && Intrinsics.LJFF(this.lowStockWarning, packedSku.lowStockWarning) && Intrinsics.LJFF(this.purchaseLimit, packedSku.purchaseLimit) && Intrinsics.LJFF(this.price, packedSku.price) && Intrinsics.LJFF(this.image, packedSku.image) && Intrinsics.LJFF(this.skuAmount, packedSku.skuAmount) && Intrinsics.LJFF(this.button, packedSku.button) && Intrinsics.LJFF(this.link, packedSku.link) && Intrinsics.LJFF(this.activityInfo, packedSku.activityInfo) && Intrinsics.LJFF(this.promotionLogos, packedSku.promotionLogos) && Intrinsics.LJFF(this.sourceInfo, packedSku.sourceInfo) && Intrinsics.LJFF(this.entranceInfo, packedSku.entranceInfo) && Intrinsics.LJFF(this.chainKey, packedSku.chainKey) && Intrinsics.LJFF(this.promotionView, packedSku.promotionView) && Intrinsics.LJFF(this.extra, packedSku.extra) && Intrinsics.LJFF(this.purchaseNotice, packedSku.purchaseNotice) && Intrinsics.LJFF(this.quantityProperty, packedSku.quantityProperty) && Intrinsics.LJFF(this.userRight, packedSku.userRight) && Intrinsics.LJFF(this.minBuyQuantity, packedSku.minBuyQuantity) && Intrinsics.LJFF(this.promotionLimitQuantity, packedSku.promotionLimitQuantity) && Intrinsics.LJFF(this.sellerId, packedSku.sellerId) && Intrinsics.LJFF(this.bundleId, packedSku.bundleId) && Intrinsics.LJFF(this.aggregationKey, packedSku.aggregationKey) && Intrinsics.LJFF(this.aggregationCount, packedSku.aggregationCount) && Intrinsics.LJFF(this.productPlatformLevel1, packedSku.productPlatformLevel1) && Intrinsics.LJFF(this.skuCardStyleInfo, packedSku.skuCardStyleInfo) && Intrinsics.LJFF(this.unavailableText, packedSku.unavailableText) && Intrinsics.LJFF(this.channelReserveKey, packedSku.channelReserveKey) && Intrinsics.LJFF(this.isSingleSku, packedSku.isSingleSku) && Intrinsics.LJFF(this.displayType, packedSku.displayType) && Intrinsics.LJFF(this.productRating, packedSku.productRating) && Intrinsics.LJFF(this.salesVolume, packedSku.salesVolume) && Intrinsics.LJFF(this.isAddonFreeShipping, packedSku.isAddonFreeShipping) && Intrinsics.LJFF(this.purchaseLimitType, packedSku.purchaseLimitType) && Intrinsics.LJFF(this.purchaseLimitToast, packedSku.purchaseLimitToast) && Intrinsics.LJFF(this.platformLinkInfo, packedSku.platformLinkInfo) && Intrinsics.LJFF(this.uniqueKey, packedSku.uniqueKey) && Intrinsics.LJFF(this.masterSkuKeys, packedSku.masterSkuKeys) && Intrinsics.LJFF(this.quantityControlInfo, packedSku.quantityControlInfo) && Intrinsics.LJFF(this.snsDisplayInfo, packedSku.snsDisplayInfo) && Intrinsics.LJFF(this.snsInfo, packedSku.snsInfo) && Intrinsics.LJFF(this.bcmStandardTrack, packedSku.bcmStandardTrack) && Intrinsics.LJFF(this.giftFrom, packedSku.giftFrom) && Intrinsics.LJFF(this.authorId, packedSku.authorId) && Intrinsics.LJFF(this.complianceLabels, packedSku.complianceLabels) && Intrinsics.LJFF(this.promotionSellingPoint, packedSku.promotionSellingPoint) && Intrinsics.LJFF(this.salesAndRatingPrompt, packedSku.salesAndRatingPrompt) && Intrinsics.LJFF(this.promptType, packedSku.promptType) && Intrinsics.LJFF(this.productSales, packedSku.productSales) && Intrinsics.LJFF(this.insuranceModule, packedSku.insuranceModule) && Intrinsics.LJFF(this.rangePrice, packedSku.rangePrice) && Intrinsics.LJFF(this.singlePrice, packedSku.singlePrice) && Intrinsics.LJFF(this.safetyModule, packedSku.safetyModule) && Intrinsics.LJFF(this.skuCardLayoutType, packedSku.skuCardLayoutType) && Intrinsics.LJFF(this.productSaleModes, packedSku.productSaleModes) && Intrinsics.LJFF(this.skuCardExtendInfo, packedSku.skuCardExtendInfo) && Intrinsics.LJFF(this.addonProductPromotionInfoList, packedSku.addonProductPromotionInfoList) && Intrinsics.LJFF(this.comboSubSkuExpression, packedSku.comboSubSkuExpression);
    }

    public final int hashCode() {
        String str = this.productId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skuId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.bizType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.cartItemId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.productName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<PackedSKUSaleProp> list = this.packedSKUSaleProps;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.salePropsStr;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.stock;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.lowStockWarning;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num4 = this.purchaseLimit;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        SkuPrice skuPrice = this.price;
        int iHashCode12 = (iHashCode11 + (skuPrice == null ? 0 : skuPrice.hashCode())) * 31;
        Image image = this.image;
        int iHashCode13 = (iHashCode12 + (image == null ? 0 : image.hashCode())) * 31;
        Integer num5 = this.skuAmount;
        int iHashCode14 = (iHashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<Button> list2 = this.button;
        int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str7 = this.link;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PickTag pickTag = this.activityInfo;
        int iHashCode17 = (iHashCode16 + (pickTag == null ? 0 : pickTag.hashCode())) * 31;
        List<PromotionLogo> list3 = this.promotionLogos;
        int iHashCode18 = (iHashCode17 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str8 = this.sourceInfo;
        int iHashCode19 = (iHashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.entranceInfo;
        int iHashCode20 = (iHashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.chainKey;
        int iHashCode21 = (iHashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        PromotionView promotionView = this.promotionView;
        int iHashCode22 = (iHashCode21 + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
        Map<String, String> map = this.extra;
        int iHashCode23 = (iHashCode22 + (map == null ? 0 : map.hashCode())) * 31;
        PurchaseNotice purchaseNotice = this.purchaseNotice;
        int iHashCode24 = (iHashCode23 + (purchaseNotice == null ? 0 : purchaseNotice.hashCode())) * 31;
        SkuQuantityProperty skuQuantityProperty = this.quantityProperty;
        int iHashCode25 = (iHashCode24 + (skuQuantityProperty == null ? 0 : skuQuantityProperty.hashCode())) * 31;
        UserRight userRight = this.userRight;
        int iHashCode26 = (iHashCode25 + (userRight == null ? 0 : userRight.hashCode())) * 31;
        Integer num6 = this.minBuyQuantity;
        int iHashCode27 = (iHashCode26 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.promotionLimitQuantity;
        int iHashCode28 = (iHashCode27 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str11 = this.sellerId;
        int iHashCode29 = (iHashCode28 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.bundleId;
        int iHashCode30 = (iHashCode29 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.aggregationKey;
        int iHashCode31 = (iHashCode30 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num8 = this.aggregationCount;
        int iHashCode32 = (iHashCode31 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.productPlatformLevel1;
        int iHashCode33 = (iHashCode32 + (num9 == null ? 0 : num9.hashCode())) * 31;
        SkuCardStyleInfo skuCardStyleInfo = this.skuCardStyleInfo;
        int iHashCode34 = (iHashCode33 + (skuCardStyleInfo == null ? 0 : skuCardStyleInfo.hashCode())) * 31;
        String str14 = this.unavailableText;
        int iHashCode35 = (iHashCode34 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.channelReserveKey;
        int iHashCode36 = (iHashCode35 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool = this.isSingleSku;
        int iHashCode37 = (iHashCode36 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num10 = this.displayType;
        int iHashCode38 = (iHashCode37 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Float f = this.productRating;
        int iHashCode39 = (iHashCode38 + (f == null ? 0 : f.hashCode())) * 31;
        String str16 = this.salesVolume;
        int iHashCode40 = (iHashCode39 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool2 = this.isAddonFreeShipping;
        int iHashCode41 = (iHashCode40 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num11 = this.purchaseLimitType;
        int iHashCode42 = (iHashCode41 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str17 = this.purchaseLimitToast;
        int iHashCode43 = (iHashCode42 + (str17 == null ? 0 : str17.hashCode())) * 31;
        PlatformLinkInfo platformLinkInfo = this.platformLinkInfo;
        int iHashCode44 = (iHashCode43 + (platformLinkInfo == null ? 0 : platformLinkInfo.hashCode())) * 31;
        String str18 = this.uniqueKey;
        int iHashCode45 = (iHashCode44 + (str18 == null ? 0 : str18.hashCode())) * 31;
        List<String> list4 = this.masterSkuKeys;
        int iHashCode46 = (iHashCode45 + (list4 == null ? 0 : list4.hashCode())) * 31;
        QuantityControlInfo quantityControlInfo = this.quantityControlInfo;
        int iHashCode47 = (iHashCode46 + (quantityControlInfo == null ? 0 : quantityControlInfo.hashCode())) * 31;
        SnsDisplayInfo snsDisplayInfo = this.snsDisplayInfo;
        int iHashCode48 = (iHashCode47 + (snsDisplayInfo == null ? 0 : snsDisplayInfo.hashCode())) * 31;
        SnsInfo snsInfo = this.snsInfo;
        int iHashCode49 = (iHashCode48 + (snsInfo == null ? 0 : snsInfo.hashCode())) * 31;
        BcmStandardTrack bcmStandardTrack = this.bcmStandardTrack;
        int iHashCode50 = (iHashCode49 + (bcmStandardTrack == null ? 0 : bcmStandardTrack.hashCode())) * 31;
        String str19 = this.giftFrom;
        int iHashCode51 = (iHashCode50 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Integer num12 = this.authorId;
        int iHashCode52 = (iHashCode51 + (num12 == null ? 0 : num12.hashCode())) * 31;
        List<Icon> list5 = this.complianceLabels;
        int iHashCode53 = (iHashCode52 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<PromotionSellingPoint> list6 = this.promotionSellingPoint;
        int iHashCode54 = (iHashCode53 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str20 = this.salesAndRatingPrompt;
        int iHashCode55 = (iHashCode54 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Integer num13 = this.promptType;
        int iHashCode56 = (iHashCode55 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.productSales;
        int iHashCode57 = (iHashCode56 + (num14 == null ? 0 : num14.hashCode())) * 31;
        InsuranceModule insuranceModule = this.insuranceModule;
        int iHashCode58 = (iHashCode57 + (insuranceModule == null ? 0 : insuranceModule.hashCode())) * 31;
        RangePrice rangePrice = this.rangePrice;
        int iHashCode59 = (iHashCode58 + (rangePrice == null ? 0 : rangePrice.hashCode())) * 31;
        SinglePriceItem singlePriceItem = this.singlePrice;
        int iHashCode60 = (iHashCode59 + (singlePriceItem == null ? 0 : singlePriceItem.hashCode())) * 31;
        ProductSafetyModule productSafetyModule = this.safetyModule;
        int iHashCode61 = (iHashCode60 + (productSafetyModule == null ? 0 : productSafetyModule.hashCode())) * 31;
        Integer num15 = this.skuCardLayoutType;
        int iHashCode62 = (iHashCode61 + (num15 == null ? 0 : num15.hashCode())) * 31;
        List<Integer> list7 = this.productSaleModes;
        int iHashCode63 = (iHashCode62 + (list7 == null ? 0 : list7.hashCode())) * 31;
        SkuCardExtendInfo skuCardExtendInfo = this.skuCardExtendInfo;
        int iHashCode64 = (iHashCode63 + (skuCardExtendInfo == null ? 0 : skuCardExtendInfo.hashCode())) * 31;
        List<AddonProductPromotionInfo> list8 = this.addonProductPromotionInfoList;
        int iHashCode65 = (iHashCode64 + (list8 == null ? 0 : list8.hashCode())) * 31;
        ComboSubSkuExpression comboSubSkuExpression = this.comboSubSkuExpression;
        return iHashCode65 + (comboSubSkuExpression != null ? comboSubSkuExpression.hashCode() : 0);
    }

    public final String toString() {
        return "PackedSku(productId=" + this.productId + ", skuId=" + this.skuId + ", bizType=" + this.bizType + ", cartItemId=" + this.cartItemId + ", status=" + this.status + ", productName=" + this.productName + ", packedSKUSaleProps=" + this.packedSKUSaleProps + ", salePropsStr=" + this.salePropsStr + ", stock=" + this.stock + ", lowStockWarning=" + this.lowStockWarning + ", purchaseLimit=" + this.purchaseLimit + ", price=" + this.price + ", image=" + this.image + ", skuAmount=" + this.skuAmount + ", button=" + this.button + ", link=" + this.link + ", activityInfo=" + this.activityInfo + ", promotionLogos=" + this.promotionLogos + ", sourceInfo=" + this.sourceInfo + ", entranceInfo=" + this.entranceInfo + ", chainKey=" + this.chainKey + ", promotionView=" + this.promotionView + ", extra=" + this.extra + ", purchaseNotice=" + this.purchaseNotice + ", quantityProperty=" + this.quantityProperty + ", userRight=" + this.userRight + ", minBuyQuantity=" + this.minBuyQuantity + ", promotionLimitQuantity=" + this.promotionLimitQuantity + ", sellerId=" + this.sellerId + ", bundleId=" + this.bundleId + ", aggregationKey=" + this.aggregationKey + ", aggregationCount=" + this.aggregationCount + ", productPlatformLevel1=" + this.productPlatformLevel1 + ", skuCardStyleInfo=" + this.skuCardStyleInfo + ", unavailableText=" + this.unavailableText + ", channelReserveKey=" + this.channelReserveKey + ", isSingleSku=" + this.isSingleSku + ", displayType=" + this.displayType + ", productRating=" + this.productRating + ", salesVolume=" + this.salesVolume + ", isAddonFreeShipping=" + this.isAddonFreeShipping + ", purchaseLimitType=" + this.purchaseLimitType + ", purchaseLimitToast=" + this.purchaseLimitToast + ", platformLinkInfo=" + this.platformLinkInfo + ", uniqueKey=" + this.uniqueKey + ", masterSkuKeys=" + this.masterSkuKeys + ", quantityControlInfo=" + this.quantityControlInfo + ", snsDisplayInfo=" + this.snsDisplayInfo + ", snsInfo=" + this.snsInfo + ", bcmStandardTrack=" + this.bcmStandardTrack + ", giftFrom=" + this.giftFrom + ", authorId=" + this.authorId + ", complianceLabels=" + this.complianceLabels + ", promotionSellingPoint=" + this.promotionSellingPoint + ", salesAndRatingPrompt=" + this.salesAndRatingPrompt + ", promptType=" + this.promptType + ", productSales=" + this.productSales + ", insuranceModule=" + this.insuranceModule + ", rangePrice=" + this.rangePrice + ", singlePrice=" + this.singlePrice + ", safetyModule=" + this.safetyModule + ", skuCardLayoutType=" + this.skuCardLayoutType + ", productSaleModes=" + this.productSaleModes + ", skuCardExtendInfo=" + this.skuCardExtendInfo + ", addonProductPromotionInfoList=" + this.addonProductPromotionInfoList + ", comboSubSkuExpression=" + this.comboSubSkuExpression + ')';
    }

    public final boolean LIZIZ() {
        Integer num;
        Integer num2;
        Integer num3;
        SkuCardStyleInfo skuCardStyleInfo = this.skuCardStyleInfo;
        if (skuCardStyleInfo != null && (num3 = skuCardStyleInfo.skuCardStyleType) != null && num3.intValue() == 1) {
            return true;
        }
        SkuCardStyleInfo skuCardStyleInfo2 = this.skuCardStyleInfo;
        if (skuCardStyleInfo2 != null && (num2 = skuCardStyleInfo2.skuCardStyleType) != null && num2.intValue() == 3) {
            return true;
        }
        SkuCardStyleInfo skuCardStyleInfo3 = this.skuCardStyleInfo;
        return (skuCardStyleInfo3 == null || (num = skuCardStyleInfo3.skuCardStyleType) == null || num.intValue() != 4) ? false : true;
    }

    @Override // X.AbstractC723102s1
    public final String getItemId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unavailable_sku_item_");
        String str = this.uniqueKey;
        if (str == null && (str = this.cartItemId) == null && (str = this.skuId) == null) {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1
    public final String getGroupId() {
        return this.LL;
    }

    public static PackedSku LIZ(PackedSku packedSku, Map map, Integer num, SkuCardExtendInfo skuCardExtendInfo, int i, int i2) {
        String str;
        String str2;
        Integer num2;
        String str3;
        Integer num3;
        String str4;
        List<PackedSKUSaleProp> list;
        String str5;
        Integer num4;
        String str6;
        Integer num5;
        SkuPrice skuPrice;
        Image image;
        Integer num6;
        List<Button> list2;
        String str7;
        PickTag pickTag;
        List<PromotionLogo> list3;
        String str8;
        String str9;
        String str10;
        PromotionView promotionView;
        PurchaseNotice purchaseNotice;
        SkuQuantityProperty skuQuantityProperty;
        UserRight userRight;
        Integer num7;
        String str11;
        String str12;
        String str13;
        Integer num8;
        Integer num9;
        SkuCardStyleInfo skuCardStyleInfo;
        String str14;
        String str15;
        Boolean bool;
        Integer num10;
        Float f;
        String str16;
        Boolean bool2;
        Integer num11;
        String str17;
        PlatformLinkInfo platformLinkInfo;
        String str18;
        List<String> list4;
        QuantityControlInfo quantityControlInfo;
        SnsDisplayInfo snsDisplayInfo;
        SnsInfo snsInfo;
        int i3;
        BcmStandardTrack bcmStandardTrack;
        int i4;
        String str19;
        int i5;
        Integer num12;
        int i6;
        List<Icon> list5;
        int i7;
        List<PromotionSellingPoint> list6;
        int i8;
        String str20;
        int i9;
        Integer num13;
        int i10;
        Integer num14;
        int i11;
        InsuranceModule insuranceModule;
        int i12;
        RangePrice rangePrice;
        SinglePriceItem singlePriceItem;
        ProductSafetyModule productSafetyModule;
        Integer num15;
        List<Integer> list7;
        SkuCardExtendInfo skuCardExtendInfo2 = skuCardExtendInfo;
        Integer num16 = num;
        Map map2 = map;
        if ((i & 1) != 0) {
            str = packedSku.productId;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = packedSku.skuId;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num2 = packedSku.bizType;
        } else {
            num2 = null;
        }
        if ((i & 8) != 0) {
            str3 = packedSku.cartItemId;
        } else {
            str3 = null;
        }
        if ((i & 16) != 0) {
            num3 = packedSku.status;
        } else {
            num3 = null;
        }
        if ((i & 32) != 0) {
            str4 = packedSku.productName;
        } else {
            str4 = null;
        }
        if ((i & 64) != 0) {
            list = packedSku.packedSKUSaleProps;
        } else {
            list = null;
        }
        if ((i & 128) != 0) {
            str5 = packedSku.salePropsStr;
        } else {
            str5 = null;
        }
        if ((i & 256) != 0) {
            num4 = packedSku.stock;
        } else {
            num4 = null;
        }
        if ((i & 512) != 0) {
            str6 = packedSku.lowStockWarning;
        } else {
            str6 = null;
        }
        if ((i & 1024) != 0) {
            num5 = packedSku.purchaseLimit;
        } else {
            num5 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            skuPrice = packedSku.price;
        } else {
            skuPrice = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            image = packedSku.image;
        } else {
            image = null;
        }
        if ((i & 8192) != 0) {
            num6 = packedSku.skuAmount;
        } else {
            num6 = null;
        }
        if ((i & 16384) != 0) {
            list2 = packedSku.button;
        } else {
            list2 = null;
        }
        if ((i & 32768) != 0) {
            str7 = packedSku.link;
        } else {
            str7 = null;
        }
        if ((65536 & i) != 0) {
            pickTag = packedSku.activityInfo;
        } else {
            pickTag = null;
        }
        if ((i & 131072) != 0) {
            list3 = packedSku.promotionLogos;
        } else {
            list3 = null;
        }
        if ((262144 & i) != 0) {
            str8 = packedSku.sourceInfo;
        } else {
            str8 = null;
        }
        if ((524288 & i) != 0) {
            str9 = packedSku.entranceInfo;
        } else {
            str9 = null;
        }
        if ((1048576 & i) != 0) {
            str10 = packedSku.chainKey;
        } else {
            str10 = null;
        }
        if ((2097152 & i) != 0) {
            promotionView = packedSku.promotionView;
        } else {
            promotionView = null;
        }
        if ((4194304 & i) != 0) {
            map2 = packedSku.extra;
        }
        if ((8388608 & i) != 0) {
            purchaseNotice = packedSku.purchaseNotice;
        } else {
            purchaseNotice = null;
        }
        if ((16777216 & i) != 0) {
            skuQuantityProperty = packedSku.quantityProperty;
        } else {
            skuQuantityProperty = null;
        }
        if ((33554432 & i) != 0) {
            userRight = packedSku.userRight;
        } else {
            userRight = null;
        }
        if ((67108864 & i) != 0) {
            num7 = packedSku.minBuyQuantity;
        } else {
            num7 = null;
        }
        if ((134217728 & i) != 0) {
            num16 = packedSku.promotionLimitQuantity;
        }
        if ((268435456 & i) != 0) {
            str11 = packedSku.sellerId;
        } else {
            str11 = null;
        }
        if ((536870912 & i) != 0) {
            str12 = packedSku.bundleId;
        } else {
            str12 = null;
        }
        if ((1073741824 & i) != 0) {
            str13 = packedSku.aggregationKey;
        } else {
            str13 = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            num8 = packedSku.aggregationCount;
        } else {
            num8 = null;
        }
        if ((i2 & 1) != 0) {
            num9 = packedSku.productPlatformLevel1;
        } else {
            num9 = null;
        }
        if ((i2 & 2) != 0) {
            skuCardStyleInfo = packedSku.skuCardStyleInfo;
        } else {
            skuCardStyleInfo = null;
        }
        if ((i2 & 4) != 0) {
            str14 = packedSku.unavailableText;
        } else {
            str14 = null;
        }
        if ((i2 & 8) != 0) {
            str15 = packedSku.channelReserveKey;
        } else {
            str15 = null;
        }
        if ((i2 & 16) != 0) {
            bool = packedSku.isSingleSku;
        } else {
            bool = null;
        }
        if ((i2 & 32) != 0) {
            num10 = packedSku.displayType;
        } else {
            num10 = null;
        }
        if ((i2 & 64) != 0) {
            f = packedSku.productRating;
        } else {
            f = null;
        }
        if ((i2 & 128) != 0) {
            str16 = packedSku.salesVolume;
        } else {
            str16 = null;
        }
        if ((i2 & 256) != 0) {
            bool2 = packedSku.isAddonFreeShipping;
        } else {
            bool2 = null;
        }
        if ((i2 & 512) != 0) {
            num11 = packedSku.purchaseLimitType;
        } else {
            num11 = null;
        }
        if ((i2 & 1024) != 0) {
            str17 = packedSku.purchaseLimitToast;
        } else {
            str17 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            platformLinkInfo = packedSku.platformLinkInfo;
        } else {
            platformLinkInfo = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str18 = packedSku.uniqueKey;
        } else {
            str18 = null;
        }
        if ((i2 & 8192) != 0) {
            list4 = packedSku.masterSkuKeys;
        } else {
            list4 = null;
        }
        if ((i2 & 16384) != 0) {
            quantityControlInfo = packedSku.quantityControlInfo;
        } else {
            quantityControlInfo = null;
        }
        if ((32768 & i2) != 0) {
            snsDisplayInfo = packedSku.snsDisplayInfo;
        } else {
            snsDisplayInfo = null;
        }
        if ((65536 & i2) != 0) {
            snsInfo = packedSku.snsInfo;
        } else {
            snsInfo = null;
        }
        if ((i2 & 131072) != 0) {
            bcmStandardTrack = packedSku.bcmStandardTrack;
            i3 = 262144;
        } else {
            i3 = 262144;
            bcmStandardTrack = null;
        }
        if ((i3 & i2) != 0) {
            str19 = packedSku.giftFrom;
            i4 = 524288;
        } else {
            i4 = 524288;
            str19 = null;
        }
        if ((i4 & i2) != 0) {
            num12 = packedSku.authorId;
            i5 = 1048576;
        } else {
            i5 = 1048576;
            num12 = null;
        }
        if ((i5 & i2) != 0) {
            list5 = packedSku.complianceLabels;
            i6 = 2097152;
        } else {
            i6 = 2097152;
            list5 = null;
        }
        if ((i6 & i2) != 0) {
            list6 = packedSku.promotionSellingPoint;
            i7 = 4194304;
        } else {
            i7 = 4194304;
            list6 = null;
        }
        if ((i7 & i2) != 0) {
            str20 = packedSku.salesAndRatingPrompt;
            i8 = 8388608;
        } else {
            i8 = 8388608;
            str20 = null;
        }
        if ((i8 & i2) != 0) {
            num13 = packedSku.promptType;
            i9 = 16777216;
        } else {
            i9 = 16777216;
            num13 = null;
        }
        if ((i9 & i2) != 0) {
            num14 = packedSku.productSales;
            i10 = 33554432;
        } else {
            i10 = 33554432;
            num14 = null;
        }
        if ((i10 & i2) != 0) {
            insuranceModule = packedSku.insuranceModule;
            i11 = 67108864;
        } else {
            i11 = 67108864;
            insuranceModule = null;
        }
        if ((i11 & i2) != 0) {
            rangePrice = packedSku.rangePrice;
            i12 = 134217728;
        } else {
            i12 = 134217728;
            rangePrice = null;
        }
        if ((i12 & i2) != 0) {
            singlePriceItem = packedSku.singlePrice;
        } else {
            singlePriceItem = null;
        }
        if ((268435456 & i2) != 0) {
            productSafetyModule = packedSku.safetyModule;
        } else {
            productSafetyModule = null;
        }
        if ((536870912 & i2) != 0) {
            num15 = packedSku.skuCardLayoutType;
        } else {
            num15 = null;
        }
        if ((1073741824 & i2) != 0) {
            list7 = packedSku.productSaleModes;
        } else {
            list7 = null;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            skuCardExtendInfo2 = packedSku.skuCardExtendInfo;
        }
        List<AddonProductPromotionInfo> list8 = packedSku.addonProductPromotionInfoList;
        ComboSubSkuExpression comboSubSkuExpression = packedSku.comboSubSkuExpression;
        packedSku.getClass();
        SkuCardExtendInfo skuCardExtendInfo3 = skuCardExtendInfo2;
        return new PackedSku(str, str2, num2, str3, num3, str4, list, str5, num4, str6, num5, skuPrice, image, num6, list2, str7, pickTag, list3, str8, str9, str10, promotionView, map2, purchaseNotice, skuQuantityProperty, userRight, num7, num16, str11, str12, str13, num8, num9, skuCardStyleInfo, str14, str15, bool, num10, f, str16, bool2, num11, str17, platformLinkInfo, str18, list4, quantityControlInfo, snsDisplayInfo, snsInfo, bcmStandardTrack, str19, num12, list5, list6, str20, num13, num14, insuranceModule, rangePrice, singlePriceItem, productSafetyModule, num15, list7, skuCardExtendInfo3, list8, comboSubSkuExpression);
    }

    public PackedSku(String str, String str2, Integer num, String str3, Integer num2, String str4, List<PackedSKUSaleProp> list, String str5, Integer num3, String str6, Integer num4, SkuPrice skuPrice, Image image, Integer num5, List<Button> list2, String str7, PickTag pickTag, List<PromotionLogo> list3, String str8, String str9, String str10, PromotionView promotionView, Map<String, String> map, PurchaseNotice purchaseNotice, SkuQuantityProperty skuQuantityProperty, UserRight userRight, Integer num6, Integer num7, String str11, String str12, String str13, Integer num8, Integer num9, SkuCardStyleInfo skuCardStyleInfo, String str14, String str15, Boolean bool, Integer num10, Float f, String str16, Boolean bool2, Integer num11, String str17, PlatformLinkInfo platformLinkInfo, String str18, List<String> list4, QuantityControlInfo quantityControlInfo, SnsDisplayInfo snsDisplayInfo, SnsInfo snsInfo, BcmStandardTrack bcmStandardTrack, String str19, Integer num12, List<Icon> list5, List<PromotionSellingPoint> list6, String str20, Integer num13, Integer num14, InsuranceModule insuranceModule, RangePrice rangePrice, SinglePriceItem singlePriceItem, ProductSafetyModule productSafetyModule, Integer num15, List<Integer> list7, SkuCardExtendInfo skuCardExtendInfo, List<AddonProductPromotionInfo> list8, ComboSubSkuExpression comboSubSkuExpression) {
        this.productId = str;
        this.skuId = str2;
        this.bizType = num;
        this.cartItemId = str3;
        this.status = num2;
        this.productName = str4;
        this.packedSKUSaleProps = list;
        this.salePropsStr = str5;
        this.stock = num3;
        this.lowStockWarning = str6;
        this.purchaseLimit = num4;
        this.price = skuPrice;
        this.image = image;
        this.skuAmount = num5;
        this.button = list2;
        this.link = str7;
        this.activityInfo = pickTag;
        this.promotionLogos = list3;
        this.sourceInfo = str8;
        this.entranceInfo = str9;
        this.chainKey = str10;
        this.promotionView = promotionView;
        this.extra = map;
        this.purchaseNotice = purchaseNotice;
        this.quantityProperty = skuQuantityProperty;
        this.userRight = userRight;
        this.minBuyQuantity = num6;
        this.promotionLimitQuantity = num7;
        this.sellerId = str11;
        this.bundleId = str12;
        this.aggregationKey = str13;
        this.aggregationCount = num8;
        this.productPlatformLevel1 = num9;
        this.skuCardStyleInfo = skuCardStyleInfo;
        this.unavailableText = str14;
        this.channelReserveKey = str15;
        this.isSingleSku = bool;
        this.displayType = num10;
        this.productRating = f;
        this.salesVolume = str16;
        this.isAddonFreeShipping = bool2;
        this.purchaseLimitType = num11;
        this.purchaseLimitToast = str17;
        this.platformLinkInfo = platformLinkInfo;
        this.uniqueKey = str18;
        this.masterSkuKeys = list4;
        this.quantityControlInfo = quantityControlInfo;
        this.snsDisplayInfo = snsDisplayInfo;
        this.snsInfo = snsInfo;
        this.bcmStandardTrack = bcmStandardTrack;
        this.giftFrom = str19;
        this.authorId = num12;
        this.complianceLabels = list5;
        this.promotionSellingPoint = list6;
        this.salesAndRatingPrompt = str20;
        this.promptType = num13;
        this.productSales = num14;
        this.insuranceModule = insuranceModule;
        this.rangePrice = rangePrice;
        this.singlePrice = singlePriceItem;
        this.safetyModule = productSafetyModule;
        this.skuCardLayoutType = num15;
        this.productSaleModes = list7;
        this.skuCardExtendInfo = skuCardExtendInfo;
        this.addonProductPromotionInfoList = list8;
        this.comboSubSkuExpression = comboSubSkuExpression;
        this.LL = "shop_orders_new";
        if (str8 == null || str8.length() == 0) {
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR28;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sourceInfo get null init, PackedSku: ");
            sbLIZ.append(this);
            RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            C03O0.LIZ.getClass();
            C1019103yf.LIZ(enumC1014603xw, runtimeException, C03O0.LIZIZ);
        }
        String str21 = this.chainKey;
        if (str21 == null || str21.length() == 0) {
            C03O0 c03o0 = C03O0.LIZ;
            c03o0.getClass();
            ConcurrentHashMap<String, Object> concurrentHashMap = C03O0.LIZIZ;
            if (!Intrinsics.LJFF(concurrentHashMap.get("source_page_type"), "mall")) {
                EnumC1014603xw enumC1014603xw2 = EnumC1014603xw.ERR29;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("chainKey get null init, PackedSku: ");
                sbLIZ2.append(this);
                RuntimeException runtimeException2 = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
                c03o0.getClass();
                C1019103yf.LIZ(enumC1014603xw2, runtimeException2, concurrentHashMap);
            }
        }
    }
}
