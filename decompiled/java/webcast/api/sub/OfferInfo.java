package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.FreeTrialInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class OfferInfo {

    @C09CT("campaign_type")
    public long campaignType;

    @C09CT("discount_amount")
    public long discountAmount;

    @C09CT("discount_rate")
    public float discountRate;

    @C09CT("discount_usd_price_amount_micros")
    public long discountUsdPriceAmountMicros;

    @C09CT("free_trial_info")
    public FreeTrialInfo freeTrialInfo;

    @C09CT("offer_end_timestamp")
    public long offerEndTimestamp;

    @C09CT("offer_start_timestamp")
    public long offerStartTimestamp;

    @C09CT("offer_type")
    public long offerType;

    @C09CT("original_amount")
    public long originalAmount;

    @C09CT("promotion_id")
    public long promotionId;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("original_money_display")
    public String originalMoneyDisplay = "";

    @C09CT("discount_money_display")
    public String discountMoneyDisplay = "";

    @C09CT("offer_token")
    public String offerToken = "";
}
