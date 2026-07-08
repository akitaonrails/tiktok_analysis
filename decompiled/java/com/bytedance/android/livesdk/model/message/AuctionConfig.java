package com.bytedance.android.livesdk.model.message;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AuctionConfig {

    @C09CT("auction_card_type")
    public int auctionCardType;

    @C09CT("auction_config_type")
    public int auctionConfigType;

    @C09CT("auction_mode")
    public int auctionMode;

    @C09CT("duration")
    public int duration;

    @C09CT("extended_auction_duration")
    public int extendedAuctionDuration;

    @C09CT("latest_auction_item")
    public LiveAuctionItem latestAuctionItem;

    @C09CT("num_failed")
    public int numFailed;

    @C09CT("num_sold")
    public int numSold;

    @C09CT("product_status")
    public int productStatus;

    @C09CT("stock_num")
    public int stockNum;

    @C09CT("auction_config_id")
    public String auctionConfigId = "";

    @C09CT("product_id")
    public String productId = "";

    @C09CT("sku_id")
    public String skuId = "";

    @C09CT("product_name")
    public String productName = "";

    @C09CT("variant_desc")
    public String variantDesc = "";

    @C09CT("formatted_starting_bid_price")
    public String formattedStartingBidPrice = "";

    @C09CT("image_url")
    public String imageUrl = "";
}
