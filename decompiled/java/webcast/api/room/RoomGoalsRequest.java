package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RoomGoalsRequest {

    @C09CT("goal_id")
    public long goalId;

    @C09CT("goal_scene")
    public int goalScene;

    @C09CT("room_id")
    public long roomId;

    @C09CT("source")
    public int source;

    @C09CT("type")
    public int type;

    @C09CT("sec_owner_id")
    public String secOwnerId = "";

    @C09CT("recommend_extra")
    public String recommendExtra = "";
}
