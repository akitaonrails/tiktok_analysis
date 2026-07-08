package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.FlashSaleEnhancementConfig;

/* JADX INFO: loaded from: classes33.dex */
public final class FlashSaleAtmosphereInfo {
    public transient FlashSaleEnhancementConfig LIZ;

    @C09CT("activity_id")
    public final long activityId;

    @C09CT("creator_limit_type")
    public final int creatorLimitType;

    @C09CT("flash_sale_atmosphere")
    public FlashSaleAtmosphere flashSaleAtmosphere;

    @C09CT("flash_sale_atmosphere_resource")
    public final FlashSaleAtmosphereResource flashSaleAtmosphereResource;

    @C09CT("flash_sale_stock")
    public FlashSaleAtmosphereStock flashSaleAtmosphereStock;

    @C09CT("hot_tag_activity_type")
    public final int hotTagActivityType;

    @C09CT("live_only_channel")
    public final boolean liveOnlyChannel;

    @C09CT("pinned_product")
    public final boolean pinnedProduct;

    @C09CT("product_id")
    public final String productId;

    public FlashSaleAtmosphereInfo(String str, long j, FlashSaleAtmosphere flashSaleAtmosphere, FlashSaleAtmosphereResource flashSaleAtmosphereResource, FlashSaleAtmosphereStock flashSaleAtmosphereStock, boolean z, boolean z2, int i, int i2) {
        this.productId = str;
        this.activityId = j;
        this.flashSaleAtmosphere = flashSaleAtmosphere;
        this.flashSaleAtmosphereResource = flashSaleAtmosphereResource;
        this.flashSaleAtmosphereStock = flashSaleAtmosphereStock;
        this.pinnedProduct = z;
        this.liveOnlyChannel = z2;
        this.creatorLimitType = i;
        this.hotTagActivityType = i2;
    }
}
