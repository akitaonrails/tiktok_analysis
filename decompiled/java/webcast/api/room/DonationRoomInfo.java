package webcast.api.room;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class DonationRoomInfo {

    @C09CT("enter_pv")
    public long enterPv;

    @C09CT("enter_uv")
    public long enterUv;

    @C09CT("room_id")
    public String roomId = "";

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public long status;
}
