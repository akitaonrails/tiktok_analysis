package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api;

import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AuctionBidRequest;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AuctionBidResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AuctionCheckResp;

/* JADX INFO: loaded from: classes33.dex */
public interface AuctionApi {
    @InterfaceC1501160pAQ("/aweme/v1/oec/live/auction/check")
    C0X9S<BaseResponse<AuctionCheckResp>> getAuctionCheck(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("product_id") Long l, @InterfaceC1501070pAH("auction_id") Long l2, @InterfaceC1501070pAH("target_auction_config_id") Long l3, @InterfaceC1501070pAH("target_surprise_set_id") Long l4, @InterfaceC1501070pAH("target_sku_id") Long l5);

    @InterfaceC1501170pAR("/aweme/v1/oec/live/auction/bid")
    C0X9S<BaseResponse<AuctionBidResp>> postBid(@InterfaceC1485405rg AuctionBidRequest auctionBidRequest);
}
