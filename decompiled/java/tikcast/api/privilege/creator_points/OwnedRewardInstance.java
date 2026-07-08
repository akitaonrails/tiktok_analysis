package tikcast.api.privilege.creator_points;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class OwnedRewardInstance {

    @C09CT("address")
    public CreatorTilesAddress address;

    @C09CT("base_reward")
    public RewardDefinition baseReward;

    @C09CT("erp_sales_order_status")
    public int erpSalesOrderStatus;

    @C09CT("expires_at")
    public long expiresAt;

    @C09CT("redeemed_at")
    public long redeemedAt;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("used")
    public boolean used;

    @C09CT("used_at")
    public long usedAt;

    @C09CT("redeemed_reward_id")
    public String redeemedRewardId = "";

    @C09CT("use_reward_uri")
    public String useRewardUri = "";
}
