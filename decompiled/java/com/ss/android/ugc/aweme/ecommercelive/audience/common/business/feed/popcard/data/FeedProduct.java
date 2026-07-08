package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.data;

import X.C09CT;
import android.os.SystemClock;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommercebase.model.EnhancedBrandLogo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelSingleConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ComponentData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PriceInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingView;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class FeedProduct {
    public final long LIZ;

    @C09CT("auction_data")
    public final AuctionData auctionData;

    @C09CT("bag_index")
    public final int bagIndex;

    @C09CT("bcm_standard_track")
    public final BcmStandardTrack bcmStandardTrack;

    @C09CT("component_data")
    public final ComponentData componentData;

    @C09CT("cover")
    public final ECImage cover;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("enhanced_brand_logo")
    public final EnhancedBrandLogo enhancedBrandLogo;

    @C09CT("placement_labels")
    public final List<PlacementLabel> placementLabels;

    @C09CT("platform")
    public final Integer platform;

    @C09CT("price")
    public final PriceInfo priceInfo;

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_type")
    public final int productType;

    @C09CT("promotion_info")
    public final PromotionInfo promotionInfo;

    @C09CT("promotion_view")
    public final PromotionView promotionView;

    @C09CT("schema")
    public final String schema;

    @C09CT("selling_view")
    public final SellingView sellingView;

    @C09CT("source")
    public final String source;

    @C09CT("title")
    public final String title;

    public FeedProduct() {
        this("", "", null, null, 0, null, null, null, null, 0, null, null, null, null, null, SystemClock.elapsedRealtime(), null, null, null);
    }

    public final void LIZ(PromotionStyleConfig promotionStyleConfig) {
        HashMap<String, PromotionLabelSingleConfig> map;
        List<PromotionLabel> list;
        int iIntValue;
        Integer num;
        List<PromotionLabel> list2;
        int iIntValue2;
        Integer num2;
        PromotionLabelConfig promotionLabelConfig = promotionStyleConfig.promotionLabelConfig;
        if (promotionLabelConfig != null && (map = promotionLabelConfig.configs) != null) {
            PromotionLabelSingleConfig promotionLabelSingleConfig = map.get("-1");
            PromotionInfo promotionInfo = this.promotionInfo;
            if (promotionInfo != null && (list2 = promotionInfo.promotionLabels) != null) {
                for (PromotionLabel promotionLabel : list2) {
                    PromotionLabelSingleConfig promotionLabelSingleConfig2 = map.get(String.valueOf(promotionLabel.type));
                    if (promotionLabelSingleConfig2 == null) {
                        promotionLabelSingleConfig2 = promotionLabelSingleConfig;
                        if (promotionLabelSingleConfig != null) {
                        }
                    }
                    PromotionLabelConfig promotionLabelConfig2 = promotionStyleConfig.promotionLabelConfig;
                    if (promotionLabelConfig2 != null && (num2 = promotionLabelConfig2.height) != null) {
                        iIntValue2 = num2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    promotionLabelSingleConfig2.LIZ = iIntValue2;
                    promotionLabel.setPromotionLabelSingleConfig(promotionLabelSingleConfig2);
                }
            }
            PromotionInfo promotionInfo2 = this.promotionInfo;
            if (promotionInfo2 != null && (list = promotionInfo2.secondPromotionLabels) != null) {
                for (PromotionLabel promotionLabel2 : list) {
                    PromotionLabelSingleConfig promotionLabelSingleConfig3 = map.get(String.valueOf(promotionLabel2.type));
                    if (promotionLabelSingleConfig3 == null) {
                        promotionLabelSingleConfig3 = promotionLabelSingleConfig;
                        if (promotionLabelSingleConfig != null) {
                        }
                    }
                    PromotionLabelConfig promotionLabelConfig3 = promotionStyleConfig.promotionLabelConfig;
                    if (promotionLabelConfig3 != null && (num = promotionLabelConfig3.height) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    promotionLabelSingleConfig3.LIZ = iIntValue;
                    promotionLabel2.setPromotionLabelSingleConfig(promotionLabelSingleConfig3);
                }
            }
        }
    }

    public FeedProduct(String str, String str2, ECImage eCImage, PriceInfo priceInfo, int i, PromotionView promotionView, PromotionInfo promotionInfo, SellingView sellingView, List<PlacementLabel> list, int i2, String str3, String str4, String str5, Integer num, BcmStandardTrack bcmStandardTrack, long j, ComponentData componentData, AuctionData auctionData, EnhancedBrandLogo enhancedBrandLogo) {
        this.productId = str;
        this.title = str2;
        this.cover = eCImage;
        this.priceInfo = priceInfo;
        this.productType = i;
        this.promotionView = promotionView;
        this.promotionInfo = promotionInfo;
        this.sellingView = sellingView;
        this.placementLabels = list;
        this.bagIndex = i2;
        this.daInfo = str3;
        this.schema = str4;
        this.source = str5;
        this.platform = num;
        this.bcmStandardTrack = bcmStandardTrack;
        this.LIZ = j;
        this.componentData = componentData;
        this.auctionData = auctionData;
        this.enhancedBrandLogo = enhancedBrandLogo;
    }
}
