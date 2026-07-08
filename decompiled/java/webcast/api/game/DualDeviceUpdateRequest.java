package webcast.api.game;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes4.dex */
public final class DualDeviceUpdateRequest {

    @C09CT("room_id")
    public long roomId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("update_reason")
    public String updateReason = "";
}
