package tikcast.api.anchor;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class KaraokeUpdateStatusRequest {

    @C09CT("host_id")
    public String hostId = "";

    @C09CT("op_type")
    public int opType;

    @C09CT("room_id")
    public long roomId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
