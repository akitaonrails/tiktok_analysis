package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommercebase.model.EnhancedBrandLogo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelSingleConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import com.ss.android.ugc.aweme.feed.model.AdAnchorsExtras;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorProductInfo implements Serializable {

    @C09CT("ads_anchors_extras")
    public AdAnchorsExtras adAnchorsExtras;

    @C09CT("add_to_cart_button")
    public AddToCartButton addToCartButton;

    @C09CT("anchor_prefix_info")
    public AnchorPrefixInfo anchorPrefixInfo;

    @C09CT("anchor_privilege")
    public AnchorPrivilege anchorPrivilege;

    @C09CT("anchor_suffix_info")
    public AnchorSuffixInfo anchorSuffixInfo;

    @C09CT("anchor_title_da_info")
    public String anchorTitleDaInfo;

    @C09CT("bcm_standard_track")
    public BcmStandardTrack bcmStandardTrack;

    @C09CT("biz_type")
    public Integer bizType;

    @C09CT("buy_button")
    public AnchorBuyButton buyButton;

    @C09CT("client_payload_map")
    public String clientPayloadMap;

    @C09CT("common_da_info")
    public VideoProductDaInfo commonDaInfo;

    @C09CT("cover_url")
    public String coverUrl;

    @C09CT("da_info")
    public String daInfo;
    public transient HashMap<String, String> daInfoInMap;

    @C09CT("detail_url")
    public String detailUrl;

    @C09CT("elastic_title")
    public String elasticTitle;

    @C09CT("elastic_url")
    public String elasticUrl;

    @C09CT("enhanced_brand_logo")
    public EnhancedBrandLogo enhancedBrandLogo;

    @C09CT("final_url")
    public String finalUrl;

    @C09CT("format_price")
    public String formatPrice;

    @C09CT("im_schema")
    public String imSchema;

    @C09CT("is_platform_product")
    public Boolean isPlatformProduct;

    @C09CT("load_method_type")
    public Integer loadMethodType;

    @C09CT("min_pfand_deposit")
    public SimplePrice minPfandDeposit;

    @C09CT("need_preload")
    public Boolean need_preload;

    @C09CT("platform")
    public Integer platform;

    @C09CT("price_need_delete")
    public int price;

    @C09CT("product_base")
    public ProductBase productBase;

    @C09CT("product_id")
    public Long productId;

    @C09CT("product_status")
    public Integer productStatus;

    @C09CT("product_type")
    public String productType;

    @C09CT("product_unavailable_text")
    public String productUnavailableText;

    @C09CT("promotion_info")
    public PromotionInfo promotionInfo;

    @C09CT("promotionLogExtraInfo")
    public Map<String, ? extends Object> promotionLogExtraInfo;

    @C09CT("promotion_logos")
    public List<PromotionLogo> promotionLogos;

    @C09CT("promotion_view")
    public PromotionView promotionView;

    @C09CT("review_num")
    public Integer reviewNum;

    @C09CT("review_overall_score")
    public Float reviewOverallScore;

    @C09CT("sale_modes")
    public List<Integer> saleModes;

    @C09CT("schema")
    public String schema;

    @C09CT("seller_id")
    public String sellerId;

    @C09CT("seller")
    public SellerInfo sellerInfo;

    @C09CT("shop_link_schema")
    public String shopLinkSchema;

    @C09CT("skus")
    public List<SkuItem> skus;

    @C09CT("sold_count")
    public Integer soldCount;

    @C09CT("source")
    public String source;

    @C09CT("source_from")
    public String sourceFrom;

    @C09CT("title")
    public String title;

    @C09CT("unavailable_schema")
    public String unavailableSchema;

    @C09CT("unavailable_text")
    public String unavailableText;

    @C09CT("video_anchor_title")
    public String videoAnchorTitle;

    public AnchorProductInfo() {
        this(null, null, null, null, 0, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final Boolean isPlatformProduct() {
        return this.isPlatformProduct;
    }

    public final void fillStyleForPromotionTag(PromotionStyleConfig promotionStyleConfig) {
        PromotionLabelConfig promotionLabelConfig;
        HashMap<String, PromotionLabelSingleConfig> map;
        List<PromotionLabel> list;
        int iIntValue;
        Integer num;
        if (promotionStyleConfig != null && (promotionLabelConfig = promotionStyleConfig.promotionLabelConfig) != null && (map = promotionLabelConfig.configs) != null) {
            PromotionLabelSingleConfig promotionLabelSingleConfig = map.get("-1");
            PromotionInfo promotionInfo = this.promotionInfo;
            if (promotionInfo != null && (list = promotionInfo.promotionLabels) != null) {
                for (PromotionLabel promotionLabel : list) {
                    PromotionLabelSingleConfig promotionLabelSingleConfig2 = map.get(String.valueOf(promotionLabel.type));
                    if (promotionLabelSingleConfig2 == null) {
                        promotionLabelSingleConfig2 = promotionLabelSingleConfig;
                        if (promotionLabelSingleConfig != null) {
                        }
                    }
                    PromotionLabelConfig promotionLabelConfig2 = promotionStyleConfig.promotionLabelConfig;
                    if (promotionLabelConfig2 != null && (num = promotionLabelConfig2.height) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    promotionLabelSingleConfig2.LIZ = iIntValue;
                    promotionLabel.setPromotionLabelSingleConfig(promotionLabelSingleConfig2);
                }
            }
        }
    }

    public final void setAddToCartButton(AddToCartButton addToCartButton) {
        this.addToCartButton = addToCartButton;
    }

    public final void setCommonDaInfo(VideoProductDaInfo videoProductDaInfo) {
        this.commonDaInfo = videoProductDaInfo;
    }

    public final void setDaInfoInMap(HashMap<String, String> map) {
        this.daInfoInMap = map;
    }

    public final void setEnhancedBrandLogo(EnhancedBrandLogo enhancedBrandLogo) {
        this.enhancedBrandLogo = enhancedBrandLogo;
    }

    public final void setFormatPrice(String str) {
        this.formatPrice = str;
    }

    public final void setProductBase(ProductBase productBase) {
        this.productBase = productBase;
    }

    public final void setPromotionInfo(PromotionInfo promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public final void setPromotionLogExtraInfo(Map<String, ? extends Object> map) {
        this.promotionLogExtraInfo = map;
    }

    public final void setPromotionView(PromotionView promotionView) {
        this.promotionView = promotionView;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setSellerId(String str) {
        this.sellerId = str;
    }

    public final void setSkus(List<SkuItem> list) {
        this.skus = list;
    }

    public AnchorProductInfo(String str, Long l, String str2, String str3, int i, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, Boolean bool, Integer num2, ProductBase productBase, Integer num3, String str11, String str12, String str13, PromotionView promotionView, AddToCartButton addToCartButton, List<SkuItem> list, String str14, List<PromotionLogo> list2, Map<String, ? extends Object> map, AnchorPrivilege anchorPrivilege, String str15, Float f, String str16, String str17, Integer num4, Integer num5, String str18, EnhancedBrandLogo enhancedBrandLogo, VideoProductDaInfo videoProductDaInfo, PromotionInfo promotionInfo, SellerInfo sellerInfo, Boolean bool2, List<Integer> list3, BcmStandardTrack bcmStandardTrack, Integer num6, String str19, SimplePrice simplePrice, String str20, String str21, AdAnchorsExtras adAnchorsExtras, AnchorSuffixInfo anchorSuffixInfo, AnchorPrefixInfo anchorPrefixInfo, AnchorBuyButton anchorBuyButton) {
        this.productType = str;
        this.productId = l;
        this.title = str2;
        this.elasticTitle = str3;
        this.price = i;
        this.formatPrice = str4;
        this.coverUrl = str5;
        this.elasticUrl = str6;
        this.platform = num;
        this.schema = str7;
        this.sourceFrom = str8;
        this.source = str9;
        this.detailUrl = str10;
        this.need_preload = bool;
        this.loadMethodType = num2;
        this.productBase = productBase;
        this.productStatus = num3;
        this.productUnavailableText = str11;
        this.unavailableText = str12;
        this.unavailableSchema = str13;
        this.promotionView = promotionView;
        this.addToCartButton = addToCartButton;
        this.skus = list;
        this.sellerId = str14;
        this.promotionLogos = list2;
        this.promotionLogExtraInfo = map;
        this.anchorPrivilege = anchorPrivilege;
        this.finalUrl = str15;
        this.reviewOverallScore = f;
        this.shopLinkSchema = str16;
        this.imSchema = str17;
        this.soldCount = num4;
        this.bizType = num5;
        this.daInfo = str18;
        this.enhancedBrandLogo = enhancedBrandLogo;
        this.commonDaInfo = videoProductDaInfo;
        this.promotionInfo = promotionInfo;
        this.sellerInfo = sellerInfo;
        this.isPlatformProduct = bool2;
        this.saleModes = list3;
        this.bcmStandardTrack = bcmStandardTrack;
        this.reviewNum = num6;
        this.clientPayloadMap = str19;
        this.minPfandDeposit = simplePrice;
        this.videoAnchorTitle = str20;
        this.anchorTitleDaInfo = str21;
        this.adAnchorsExtras = adAnchorsExtras;
        this.anchorSuffixInfo = anchorSuffixInfo;
        this.anchorPrefixInfo = anchorPrefixInfo;
        this.buyButton = anchorBuyButton;
    }
}
