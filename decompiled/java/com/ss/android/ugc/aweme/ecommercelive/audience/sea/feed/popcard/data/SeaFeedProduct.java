package com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.popcard.data;

import X.C09CT;
import android.os.SystemClock;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ComponentData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PriceInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingView;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class SeaFeedProduct {

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

    public SeaFeedProduct() {
        this("", "", null, null, 0, null, null, null, 0, null, null, null, null, null, SystemClock.elapsedRealtime(), null, null);
    }

    public SeaFeedProduct(String str, String str2, ECImage eCImage, PriceInfo priceInfo, int i, PromotionView promotionView, SellingView sellingView, List<PlacementLabel> list, int i2, String str3, String str4, String str5, Integer num, BcmStandardTrack bcmStandardTrack, long j, ComponentData componentData, AuctionData auctionData) {
        this.productId = str;
        this.title = str2;
        this.cover = eCImage;
        this.priceInfo = priceInfo;
        this.productType = i;
        this.promotionView = promotionView;
        this.sellingView = sellingView;
        this.placementLabels = list;
        this.bagIndex = i2;
        this.daInfo = str3;
        this.schema = str4;
        this.source = str5;
        this.platform = num;
        this.bcmStandardTrack = bcmStandardTrack;
        this.componentData = componentData;
        this.auctionData = auctionData;
    }
}
