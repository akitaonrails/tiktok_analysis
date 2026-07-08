package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.glip.LeaderboardMetricProgress;
import webcast.data.glip.RewardAmount;

/* JADX INFO: loaded from: classes29.dex */
public final class SingleTaskRewardOverview {

    @C09CT("coupons_num")
    public long couponsNum;

    @C09CT("fixed_revenue")
    public RewardAmount fixedRevenue;

    @C09CT("task_vv_overview")
    public TaskVVOverview taskVvOverview;

    @C09CT("total_approved_videos_count")
    public long totalApprovedVideosCount;

    @C09CT("total_confirm_revenue")
    public RewardAmount totalConfirmRevenue;

    @C09CT("total_score")
    public long totalScore;

    @C09CT("total_valid_vv")
    public long totalValidVv;

    @C09CT("updated_time")
    public long updatedTime;

    @C09CT("vv_confirm_revenue")
    public RewardAmount vvConfirmRevenue;

    @C09CT("ranking_display")
    public String rankingDisplay = "";

    @C09CT("metric_progress_list")
    public List<LeaderboardMetricProgress> metricProgressList = new ArrayList();
}
