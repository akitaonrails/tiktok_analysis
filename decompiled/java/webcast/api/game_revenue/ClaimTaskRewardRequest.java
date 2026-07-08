package webcast.api.game_revenue;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ClaimTaskRewardRequest {

    @C09CT("data")
    public RequestData data;

    public static final class RequestData {

        @C09CT("type")
        public int type;

        @C09CT("task_id")
        public String taskId = "";

        @C09CT("reward_id")
        public String rewardId = "";

        @C09CT("room_id")
        public String roomId = "";
    }
}
