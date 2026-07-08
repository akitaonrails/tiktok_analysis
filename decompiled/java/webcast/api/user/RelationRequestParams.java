package webcast.api.user;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class RelationRequestParams {

    @C09CT("current_room_id")
    public long currentRoomId;

    @C09CT("follow_type")
    public int followType;

    @C09CT("from_preview")
    public boolean fromPreview;

    @C09CT("need_block_check")
    public boolean needBlockCheck;

    @C09CT("to_user_id")
    public long toUserId;

    @C09CT("sec_user_id")
    public String secUserId = "";

    @C09CT("sec_to_user_id")
    public String secToUserId = "";
}
