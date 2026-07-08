package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class BroadcastProduct {

    @C09CT("cover")
    public final ECImage cover;

    @C09CT("elastic_img")
    public final List<ECImage> elasticImg;

    @C09CT("format_available_price")
    public final String formatAvailablePrice;

    @C09CT("format_market_price")
    public final String formatMarketPrice;

    @C09CT("format_origin_price")
    public final String formatOriginPrice;

    @C09CT("format_price")
    public final String formatPrice;

    @C09CT("platform")
    public final int platform;

    @C09CT("product_id")
    public final String productId;

    @C09CT("promotion_logos")
    public final List<BroadcastPromotionLogo> promotionLogos;

    @C09CT("title")
    public final String title;

    public BroadcastProduct(String str, String str2, ECImage eCImage, List<ECImage> list, int i, String str3, String str4, String str5, String str6, List<BroadcastPromotionLogo> list2) {
        this.productId = str;
        this.title = str2;
        this.cover = eCImage;
        this.elasticImg = list;
        this.platform = i;
        this.formatPrice = str3;
        this.formatMarketPrice = str4;
        this.formatOriginPrice = str5;
        this.formatAvailablePrice = str6;
        this.promotionLogos = list2;
    }
}
