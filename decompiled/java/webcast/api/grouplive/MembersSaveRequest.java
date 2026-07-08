package webcast.api.grouplive;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MembersSaveRequest {

    @C09CT("fetch_backstage")
    public boolean fetchBackstage;

    @C09CT("host_uid")
    public String hostUid = "";

    @C09CT("staged_member_uids")
    public List<String> stagedMemberUids = new ArrayList();

    @C09CT("room_id")
    public String roomId = "";
}
