package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GetSubGoalRequest {

    @C09CT("goal_id")
    public long goalId;

    @C09CT("goal_scene")
    public int goalScene;

    @C09CT("room_id")
    public long roomId;

    @C09CT("sec_owner_id")
    public String secOwnerId = "";
}
