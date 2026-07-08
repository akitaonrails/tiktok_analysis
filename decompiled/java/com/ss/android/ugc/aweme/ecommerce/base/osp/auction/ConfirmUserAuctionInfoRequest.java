package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfirmUserAuctionInfoRequest {

    @C09CT("address_item_id")
    public final String addressItemId;

    @C09CT("auction_config_id")
    public final String auctionConfigId;

    @C09CT("product_id")
    public final String productId;

    @C09CT("room_id")
    public final String roomId;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("tax_code")
    public final String taxCode;

    @C09CT("term_version")
    public final String termVersion;

    @C09CT("use_prefill")
    public final Boolean usePrefill;

    public ConfirmUserAuctionInfoRequest() {
        this(null, null, null, null, null, null, null, null);
    }

    public ConfirmUserAuctionInfoRequest(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7) {
        this.addressItemId = str;
        this.roomId = str2;
        this.productId = str3;
        this.skuId = str4;
        this.termVersion = str5;
        this.usePrefill = bool;
        this.auctionConfigId = str6;
        this.taxCode = str7;
    }
}
