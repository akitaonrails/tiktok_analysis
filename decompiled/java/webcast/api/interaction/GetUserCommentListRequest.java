package webcast.api.interaction;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GetUserCommentListRequest {

    @C09CT("limit")
    public long limit;

    @C09CT("offset")
    public long offset;

    @C09CT("room_id")
    public long roomId;

    @C09CT("target_user_id")
    public long targetUserId;
}
