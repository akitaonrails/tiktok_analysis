package com.bytedance.android.livesdk.goal.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GetSubGoalContributorsRequest {

    @C09CT("goal_id")
    public long goalId;

    @C09CT("limit")
    public long limit;

    @C09CT("offset")
    public long offset;

    @C09CT("room_id")
    public long roomId;

    @C09CT("sec_owner_id")
    public String secOwnerId = "";

    @C09CT("type")
    public int type;
}
