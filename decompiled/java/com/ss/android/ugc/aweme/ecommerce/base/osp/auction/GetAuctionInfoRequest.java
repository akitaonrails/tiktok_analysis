package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class GetAuctionInfoRequest {

    @C09CT("auction_config_id")
    public final String auctionConfigId;

    @C09CT("product_id")
    public final String productId;

    @C09CT("room_id")
    public final String roomId;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("term_version")
    public final String termVersion;

    @C09CT("use_prefill")
    public final Boolean usePrefill;

    public GetAuctionInfoRequest() {
        this("", "", "", "", null, "");
    }

    public GetAuctionInfoRequest(String str, String str2, String str3, String str4, Boolean bool, String str5) {
        this.roomId = str;
        this.productId = str2;
        this.skuId = str3;
        this.termVersion = str4;
        this.usePrefill = bool;
        this.auctionConfigId = str5;
    }
}
