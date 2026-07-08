package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class RegularAuctionData {

    @C09CT("auction_img")
    public final ECImage auctionImg;

    @C09CT("auction_label")
    public final AuctionLabel auctionLabel;

    @C09CT("no_img_mode_optimization")
    public final boolean noImgModeOptimization;

    @C09CT("placement_labels")
    public final List<PlacementLabel> placementLabels;

    @C09CT("platform")
    public final Integer platform;

    @C09CT("product_id")
    public final Long productId;

    @C09CT("sku_id")
    public final Long skuId;

    @C09CT("source")
    public final String source;

    public RegularAuctionData() {
        this(null, null, null, null, null, null, false, null);
    }

    public RegularAuctionData(List<PlacementLabel> list, ECImage eCImage, Long l, Long l2, Integer num, String str, boolean z, AuctionLabel auctionLabel) {
        this.placementLabels = list;
        this.auctionImg = eCImage;
        this.productId = l;
        this.skuId = l2;
        this.platform = num;
        this.source = str;
        this.noImgModeOptimization = z;
        this.auctionLabel = auctionLabel;
    }
}
