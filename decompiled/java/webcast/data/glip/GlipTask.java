package webcast.data.glip;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GlipTask {

    @C09CT("anchor_info")
    public AnchorInfo anchorInfo;

    @C09CT("billing_source")
    public int billingSource;

    @C09CT("capping_price")
    public RewardAmount cappingPrice;

    @C09CT("cost_per_mille")
    public RewardAmount costPerMille;

    @C09CT("end_time")
    public long endTime;

    @C09CT("fixed_price")
    public RewardAmount fixedPrice;

    @C09CT("flip_large_task_image")
    public ImageModel flipLargeTaskImage;

    @C09CT("glip_biz_scene")
    public int glipBizScene;

    @C09CT("have_reward_for_ranking")
    public boolean haveRewardForRanking;

    @C09CT("large_task_image")
    public ImageModel largeTaskImage;

    @C09CT("remaining_reward")
    public RewardAmount remainingReward;

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

    @C09CT("top1_reward_amount")
    public RewardAmount top1RewardAmount;

    @C09CT("total_ranking_count")
    public long totalRankingCount;

    @C09CT("total_reward_pool")
    public RewardAmount totalRewardPool;

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("title")
    public String title = "";

    @C09CT("sub_title")
    public String subTitle = "";

    @C09CT("hash_tag_list")
    public List<String> hashTagList = new ArrayList();
}
