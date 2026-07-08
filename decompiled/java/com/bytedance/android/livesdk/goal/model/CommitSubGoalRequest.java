package com.bytedance.android.livesdk.goal.model;

import X.C09CT;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CommitSubGoalRequest {

    @C09CT("goal_id")
    public long goalId;

    @C09CT("room_id")
    public long roomId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("type")
    public int type;

    @C09CT("subgoals")
    public List<LiveStreamSubGoal> subgoals = new ArrayList();

    @C09CT("description")
    public String description = "";

    @C09CT("room_id_str")
    public String roomIdStr = "";

    @C09CT("goal_id_str")
    public String goalIdStr = "";

    @C09CT("goal_extra_info")
    public String goalExtraInfo = "";
}
