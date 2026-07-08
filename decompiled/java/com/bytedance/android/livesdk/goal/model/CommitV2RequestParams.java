package com.bytedance.android.livesdk.goal.model;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class CommitV2RequestParams {

    @C09CT("commit_source")
    public int commitSource;

    @C09CT("live_room_mode")
    public int liveRoomMode;

    @C09CT("pin_params")
    public CommitPinParams pinParams;

    @C09CT("room_id")
    public long roomId;

    @C09CT("room_id_str")
    public String roomIdStr = "";

    @C09CT("tab_status")
    public Map<Long, Integer> tabStatus = C2097608Jq.LJ();

    @C09CT("goals")
    public List<CommitV2GoalParams> goals = C13BV.INSTANCE;

    /* JADX INFO: loaded from: classes.dex */
    public static final class CommitV2GoalParams {

        @C09CT("auto_create")
        public int autoCreate;

        @C09CT("description")
        public String description;

        @C09CT("description_type")
        public int descriptionType;

        @C09CT("goal_extra_info")
        public String goalExtraInfo;

        @C09CT("goal_id")
        public long goalId;

        @C09CT("goal_id_str")
        public String goalIdStr;

        @C09CT("goal_reward")
        public GoalReward goalReward;

        @C09CT("recommended_gift_ids")
        public List<Long> recommendedGiftIds;

        @C09CT("recommended_gift_targets")
        public List<Long> recommendedGiftTargets;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("subgoals")
        public List<LiveStreamSubGoal> subgoals;

        @C09CT("type")
        public int type;

        public CommitV2GoalParams() {
            C13BV c13bv = C13BV.INSTANCE;
            this.subgoals = c13bv;
            this.description = "";
            this.goalIdStr = "";
            this.recommendedGiftIds = c13bv;
            this.recommendedGiftTargets = c13bv;
            this.goalExtraInfo = "";
        }
    }
}
