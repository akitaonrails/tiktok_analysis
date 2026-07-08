package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class SubQueue {

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("create_time_sec")
    public long createTimeSec;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("total_count")
    public long totalCount;

    @C09CT("type")
    public int type;

    @C09CT("waiting_count")
    public long waitingCount;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("anchor_id")
    public String anchorId = "";

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("title")
    public String title = "";
}
