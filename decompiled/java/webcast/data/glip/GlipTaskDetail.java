package webcast.data.glip;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GlipTaskDetail {

    @C09CT("anchor_info")
    public AnchorInfo anchorInfo;

    @C09CT("ban_create_videos")
    public boolean banCreateVideos;

    @C09CT("billing_period")
    public long billingPeriod;

    @C09CT("billing_source")
    public int billingSource;

    @C09CT("budget_control_threshold")
    public long budgetControlThreshold;

    @C09CT("capping_price")
    public RewardAmount cappingPrice;

    @C09CT("cost_per_mille")
    public RewardAmount costPerMille;

    @C09CT("end_time")
    public long endTime;

    @C09CT("fixed_price_unit")
    public RewardAmount fixedPriceUnit;

    @C09CT("glip_biz_scene")
    public int glipBizScene;

    @C09CT("glip_task_guide")
    public GlipTaskGuide glipTaskGuide;

    @C09CT("guideline_intro")
    public GuidelineIntro guidelineIntro;

    @C09CT("have_reward_for_ranking")
    public boolean haveRewardForRanking;

    @C09CT("leaderboard_conf")
    public LeaderboardDisplayConf leaderboardConf;

    @C09CT("manual_intervention_time")
    public long manualInterventionTime;

    @C09CT("remaining_reward")
    public RewardAmount remainingReward;

    @C09CT("remaining_reward_proportion")
    public long remainingRewardProportion;

    @C09CT("show_ranking")
    public boolean showRanking;

    @C09CT("start_time")
    public long startTime;

    @C09CT("task_image")
    public ImageModel taskImage;

    @C09CT("task_mode")
    public int taskMode;

    @C09CT("task_status")
    public int taskStatus;

    @C09CT("task_type")
    public int taskType;

    @C09CT("total_approved_video_count")
    public long totalApprovedVideoCount;

    @C09CT("total_ranking_count")
    public long totalRankingCount;

    @C09CT("total_reward_pool")
    public RewardAmount totalRewardPool;

    @C09CT("total_videos_count")
    public long totalVideosCount;

    @C09CT("user_qualified_link_clicks")
    public long userQualifiedLinkClicks;

    @C09CT("user_reward_amount")
    public RewardAmount userRewardAmount;

    @C09CT("user_reward_amount_update_time")
    public long userRewardAmountUpdateTime;

    @C09CT("video_show_type")
    public int videoShowType;

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("title")
    public String title = "";

    @C09CT("sub_title")
    public String subTitle = "";

    @C09CT("intro")
    public String intro = "";

    @C09CT("store_region")
    public String storeRegion = "";

    @C09CT("trending_videos")
    public List<GlipAwemeStruct> trendingVideos = new ArrayList();

    @C09CT("hash_tag_list")
    public List<String> hashTagList = new ArrayList();

    @C09CT("country_name")
    public String countryName = "";

    @C09CT("requirement_list")
    public List<String> requirementList = new ArrayList();

    @C09CT("guide_lines")
    public List<TaskGuideLine> guideLines = new ArrayList();

    @C09CT("reference_videos")
    public List<ReferenceVideoItem> referenceVideos = new ArrayList();

    @C09CT("script_plan_list")
    public List<TaskScriptPlan> scriptPlanList = new ArrayList();

    @C09CT("allow_language_list")
    public List<String> allowLanguageList = new ArrayList();
}
