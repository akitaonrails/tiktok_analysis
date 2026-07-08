package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class OecLiveManagerMessage extends AbstractC1136060ffY {

    @C09CT("ask_demo_info")
    public AskDemoInfo askDemoInfo;

    @C09CT("auction_activity_data")
    public AuctionActivityData auctionActivityData;

    @C09CT("auction_result")
    public AuctionResult auctionResult;

    @C09CT("giveaway_info")
    public GiveawayInfo giveawayInfo;

    @C09CT("message_type")
    public int messageType;

    @C09CT("purchase_product_info")
    public PurchaseProductInfo purchaseProductInfo;

    @C09CT("subscription_info")
    public SubscriptionInfo subscriptionInfo;

    @C09CT("violation_info")
    public ViolationInfo violationInfo;

    public OecLiveManagerMessage() {
        this.type = C001A.OEC_LIVE_MANAGER_MESSAGE;
    }
}
