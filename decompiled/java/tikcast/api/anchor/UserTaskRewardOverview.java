package tikcast.api.anchor;

import X.C09CT;
import webcast.data.glip.RewardAmount;

/* JADX INFO: loaded from: classes29.dex */
public final class UserTaskRewardOverview {

    @C09CT("approved_videos_num")
    public long approvedVideosNum;

    @C09CT("coupons_num")
    public long couponsNum;

    @C09CT("fixed_revenue")
    public RewardAmount fixedRevenue;

    @C09CT("has_posted_ls_video")
    public boolean hasPostedLsVideo;

    @C09CT("has_posted_video")
    public boolean hasPostedVideo;

    @C09CT("next_payout_time")
    public long nextPayoutTime;

    @C09CT("total_calculating_revenue")
    public RewardAmount totalCalculatingRevenue;

    @C09CT("total_confirm_revenue")
    public RewardAmount totalConfirmRevenue;

    @C09CT("total_payout_revenue")
    public RewardAmount totalPayoutRevenue;

    @C09CT("total_settle_revenue")
    public RewardAmount totalSettleRevenue;

    @C09CT("total_valid_click_vv")
    public long totalValidClickVv;

    @C09CT("total_valid_view_vv")
    public long totalValidViewVv;

    @C09CT("total_wait_payout_revenue")
    public RewardAmount totalWaitPayoutRevenue;

    @C09CT("update_time")
    public long updateTime;

    @C09CT("wait_settle_revenue")
    public RewardAmount waitSettleRevenue;
}
