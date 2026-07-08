package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class LiveAuctionItem {

    @C09CT("actual_end_time")
    public int actualEndTime;

    @C09CT("actual_start_time")
    public int actualStartTime;

    @C09CT("num_of_bids")
    public int numOfBids;

    @C09CT("payment_status")
    public int paymentStatus;

    @C09CT("payment_time")
    public long paymentTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("auction_config_id")
    public String auctionConfigId = "";

    @C09CT("auction_item_id")
    public String auctionItemId = "";

    @C09CT("actual_formatted_starting_bid_price")
    public String actualFormattedStartingBidPrice = "";

    @C09CT("win_username")
    public String winUsername = "";

    @C09CT("max_bidding_price")
    public String maxBiddingPrice = "";

    @C09CT("win_user_profile_image_url")
    public String winUserProfileImageUrl = "";
}
