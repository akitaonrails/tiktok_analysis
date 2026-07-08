package tikcast.api.anchor;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GetGrowthCenterResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("no_receive_reward_task")
        public AnchorGrowCenterTaskInfo noReceiveRewardTask;

        @C09CT("stage_info")
        public AnchorGrowthStage stageInfo;

        @C09CT("task_info")
        public AnchorGrowCenterTaskInfo taskInfo;
    }
}
