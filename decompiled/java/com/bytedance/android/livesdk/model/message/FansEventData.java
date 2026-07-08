package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FansEventData {

    @C09CT("entrance_guidance_data")
    public EntranceGuidanceData entranceGuidanceData;

    @C09CT("exp_change_data")
    public ExpChangeData expChangeData;

    @C09CT("get_unclaimed_points")
    public GetUnclaimedPoints getUnclaimedPoints;

    @C09CT("new_fans_data")
    public NewFansData newFansData;

    @C09CT("personalized_gift_data")
    public PersonalisedGift personalizedGiftData;

    @C09CT("task_complete_data")
    public TaskCompleteData taskCompleteData;

    @C09CT("team_rank_update")
    public TeamRankUpdate teamRankUpdate;

    @C09CT("trigger_new_task_types")
    public List<String> triggerNewTaskTypes;

    @C09CT("trigger_task_types")
    public List<Integer> triggerTaskTypes;

    public static final class EntranceGuidanceData {

        @C09CT("entrance_guidance_container")
        public EntranceGuidanceContainer entranceGuidanceContainer;

        @C09CT("fragment_id")
        public long fragmentId;

        @C09CT("freq_control_duration")
        public long freqControlDuration;

        @C09CT("freq_control_key")
        public String freqControlKey = "";

        @C09CT("freq_control_value")
        public int freqControlValue;

        @C09CT("guidance_type")
        public int guidanceType;

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("text")
        public Text text;
    }

    public static final class ExpChangeData {

        @C09CT("claimed_all_points")
        public boolean claimedAllPoints;

        @C09CT("total_unclaimed_score")
        public long totalUnclaimedScore;
    }

    public static final class GetUnclaimedPoints {

        @C09CT("after_daily_tasks_finished")
        public Text afterDailyTasksFinished;

        @C09CT("daily_tasks_finished")
        public boolean dailyTasksFinished;

        @C09CT("expire_timestamp")
        public long expireTimestamp;

        @C09CT("member_join_time")
        public long memberJoinTime;

        @C09CT("total_unclaimed_score")
        public long totalUnclaimedScore;

        @C09CT("unclaimed_points")
        public long unclaimedPoints;
    }

    public static final class NewFansData {

        @C09CT("fans_count")
        public long fansCount;
    }

    public static final class PersonalisedGift {

        @C09CT("gift_id")
        public long giftId;

        @C09CT("version_id")
        public String versionId = "";
    }

    public static final class TaskCompleteData {

        @C09CT("is_clear_today")
        public boolean isClearToday;

        @C09CT("task_type")
        public int taskType;
    }

    public static final class TeamRankUpdate {

        @C09CT("updated_rank")
        public long updatedRank;

        @C09CT("updated_score")
        public long updatedScore;
    }
}
