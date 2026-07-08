package webcast.api.bag;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BagItemConsumeRequestParams {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("count")
    public long count;

    @C09CT("item_id")
    public long itemId;

    @C09CT("item_type")
    public int itemType;

    @C09CT("min_expire_at")
    public long minExpireAt;

    @C09CT("room_id")
    public long roomId;

    @C09CT("to_user_ids")
    public String toUserIds = "";

    @C09CT("user_id")
    public long userId;
}
