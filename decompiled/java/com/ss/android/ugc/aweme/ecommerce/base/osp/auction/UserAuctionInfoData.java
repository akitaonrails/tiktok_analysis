package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class UserAuctionInfoData {

    @C09CT("address_info_item")
    public final AddressInfoItem addressInfo;

    @C09CT("page_data")
    public final AuctionInfoPageData pageData;

    @C09CT("payment_info_item")
    public final PaymentInfoItem paymentInfo;

    @C09CT("schema")
    public final AuctionInfoSchema schema;

    @C09CT("tax_info_item")
    public final TaxInfoItem taxInfoItem;

    public UserAuctionInfoData(AddressInfoItem addressInfoItem, PaymentInfoItem paymentInfoItem, TaxInfoItem taxInfoItem, AuctionInfoSchema auctionInfoSchema, AuctionInfoPageData auctionInfoPageData) {
        this.addressInfo = addressInfoItem;
        this.paymentInfo = paymentInfoItem;
        this.taxInfoItem = taxInfoItem;
        this.schema = auctionInfoSchema;
        this.pageData = auctionInfoPageData;
    }
}
