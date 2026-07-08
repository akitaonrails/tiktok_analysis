package tikcast.api.privilege;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class QueryUserPrivilegesRequest {

    @C09CT("need_privilege_detail")
    public boolean needPrivilegeDetail;

    @C09CT("privilege_type")
    public int privilegeType;

    @C09CT("request_from")
    public int requestFrom;

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("anchor_id")
    public String anchorId = "";

    @C09CT("request_scene")
    public String requestScene = "";
}
