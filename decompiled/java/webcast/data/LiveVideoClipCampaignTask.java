package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveVideoClipCampaignTask {

    @C09CT("contribute_ended")
    public boolean contributeEnded;

    @C09CT("create_time")
    public long createTime;

    @C09CT("min_video_duration")
    public long minVideoDuration;

    @C09CT("sign_in_ended")
    public boolean signInEnded;

    @C09CT("sign_up_end_time")
    public long signUpEndTime;

    @C09CT("sign_up_start_time")
    public long signUpStartTime;

    @C09CT("task_has_settlement")
    public boolean taskHasSettlement;

    @C09CT("task_id")
    public long taskId;

    @C09CT("task_settlement_time")
    public long taskSettlementTime;

    @C09CT("video_contribute_end_time")
    public long videoContributeEndTime;

    @C09CT("video_contribute_start_time")
    public long videoContributeStartTime;

    @C09CT("task_name")
    public String taskName = "";

    @C09CT("creator")
    public String creator = "";

    @C09CT("currency")
    public String currency = "";

    @C09CT("reference_videos")
    public List<ReferenceVideo> referenceVideos = new ArrayList();

    @C09CT("reward_detail")
    public List<RewardConfig> rewardDetail = new ArrayList();

    public static final class ReferenceVideo {

        @C09CT("duration")
        public long duration;

        @C09CT("item_id")
        public long itemId;

        @C09CT("cover_url")
        public String coverUrl = "";

        @C09CT("play_url")
        public String playUrl = "";

        @C09CT("title")
        public String title = "";
    }

    public static final class RewardConfig {

        @C09CT("max_rank")
        public long maxRank;

        @C09CT("min_rank")
        public long minRank;

        @C09CT("reward_amount")
        public long rewardAmount;
    }
}
