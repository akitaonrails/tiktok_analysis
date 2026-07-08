package com.bytedance.android.livesdk.goal.model;

import X.C09CT;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalContributor;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GoalV2 {

    @C09CT("audit_info")
    public AuditInfo auditInfo;

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("contributors_length")
    public int contributorsLength;

    @C09CT("create_source")
    public int createSource;

    @C09CT("cycle_type")
    public int cycleType;

    @C09CT("description_type")
    public int descriptionType;

    @C09CT("expire_time")
    public long expireTime;

    @C09CT("goal_reward")
    public GoalReward goalReward;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("is_uneditable")
    public boolean isUneditable;

    @C09CT("mode")
    public int mode;

    @C09CT("real_finish_time")
    public long realFinishTime;

    @C09CT("start_time")
    public long startTime;

    @C09CT("stats")
    public GoalStats stats;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("type")
    public int type;

    @C09CT("sub_goals")
    public List<SubGoalV2> subGoals = new ArrayList();

    @C09CT("description")
    public String description = "";

    @C09CT("contributors")
    public List<LiveStreamGoalContributor> contributors = new ArrayList();

    @C09CT("id_str")
    public String idStr = "";

    @C09CT("audit_description")
    public String auditDescription = "";

    @C09CT("goal_extra_info")
    public String goalExtraInfo = "";

    @C09CT("challenge_type")
    public String challengeType = "";

    public static final class AuditInfo {

        @C09CT("task_type")
        public int taskType;

        @C09CT("violation_id")
        public long violationId;
    }
}
