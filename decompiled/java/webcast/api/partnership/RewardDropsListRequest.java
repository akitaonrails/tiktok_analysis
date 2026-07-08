package webcast.api.partnership;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RewardDropsListRequest {

    @C09CT("drop_mode")
    public int dropMode;

    @C09CT("limit")
    public long limit;

    @C09CT("offset")
    public long offset;

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("start_history")
    public boolean startHistory;

    @C09CT("user_type")
    public int userType;
}
