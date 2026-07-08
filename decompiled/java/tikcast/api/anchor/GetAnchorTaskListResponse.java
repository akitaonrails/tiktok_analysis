package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorGrowTaskListItem;

/* JADX INFO: loaded from: classes.dex */
public final class GetAnchorTaskListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("no_receive_reward_task")
        public AnchorExpireAndNoReceiveRewardTask noReceiveRewardTask;

        @C09CT("unused_rewards")
        public AnchorUnusedRewardsInfo unusedRewards;

        @C09CT("daily_task")
        public List<AnchorGrowTaskListItem> dailyTask = new ArrayList();

        @C09CT("weekly_task")
        public List<AnchorGrowTaskListItem> weeklyTask = new ArrayList();
    }
}
