package webcast.api.room;

import X.C09CT;
import com.bytedance.android.livesdk.goal.model.GetResponse;
import webcast.api.sub.GetSubGoalResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class RoomGoalsResponse {

    @C09CT("live_goal")
    public GetResponse.Data liveGoal;

    @C09CT("live_goal_status")
    public long liveGoalStatus;

    @C09CT("sub_goal")
    public GetSubGoalResponse.Data subGoal;

    @C09CT("sub_goal_status")
    public long subGoalStatus;
}
