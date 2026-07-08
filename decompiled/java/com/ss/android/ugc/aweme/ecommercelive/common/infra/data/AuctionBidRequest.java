package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class AuctionBidRequest {

    @C09CT("auction_config_id")
    public final Long auctionConfigId;

    @C09CT("auction_id")
    public final Long auctionId;

    @C09CT("author_id")
    public final Long authorId;

    @C09CT("bcm_chain")
    public final String bcmChain;

    @C09CT("currency_name")
    public final String currencyName;

    @C09CT("currency_symbol")
    public final String currencySymbol;

    @C09CT("entrance_info")
    public final String entranceInfo;

    @C09CT("price")
    public final String price;

    @C09CT("action_type")
    public final int priceType;

    @C09CT("product_id")
    public final Long productId;

    @C09CT("room_id")
    public final Long roomId;

    @C09CT("surprise_set_id")
    public final Long surpriseSetId;

    @C09CT("target_sku_id")
    public final Long targetSkuId;

    public AuctionBidRequest() {
        this(null, null, 0L, 0, null, null, null, "", null, null, null, null, null);
    }

    public AuctionBidRequest(Long l, Long l2, Long l3, int i, String str, String str2, String str3, String str4, String str5, Long l4, Long l5, Long l6, Long l7) {
        this.roomId = l;
        this.authorId = l2;
        this.productId = l3;
        this.priceType = i;
        this.currencySymbol = str;
        this.currencyName = str2;
        this.price = str3;
        this.bcmChain = str4;
        this.entranceInfo = str5;
        this.auctionConfigId = l4;
        this.surpriseSetId = l5;
        this.targetSkuId = l6;
        this.auctionId = l7;
    }
}
