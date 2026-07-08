package webcast.api.user;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class UserRequestParams {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("can_recognize_enigma_role")
    public boolean canRecognizeEnigmaRole;

    @C09CT("current_room_id")
    public long currentRoomId;

    @C09CT("is_anonymous")
    public boolean isAnonymous;

    @C09CT("need_block_status")
    public boolean needBlockStatus;

    @C09CT("need_preload_room")
    public boolean needPreloadRoom;

    @C09CT("packed_level")
    public long packedLevel;

    @C09CT("request_from_scene")
    public int requestFromScene;

    @C09CT("target_uid")
    public long targetUid;

    @C09CT("request_from")
    public String requestFrom = "";

    @C09CT("sec_target_uid")
    public String secTargetUid = "";

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("user_role")
    public String userRole = "";
}
