package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ShareRequest {

    @C09CT("room_id")
    public long roomId;

    @C09CT("share_type")
    public long shareType;

    @C09CT("target_id")
    public long targetId;

    @C09CT("to_user_ids")
    public String toUserIds = "";

    @C09CT("enter_from")
    public String enterFrom = "";
}
