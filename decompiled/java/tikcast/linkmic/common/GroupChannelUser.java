package tikcast.linkmic.common;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class GroupChannelUser {

    @C09CT("all_user")
    public AllListUser allUser;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("group_linkmic_id")
    public String groupLinkmicId = "";

    @C09CT("join_time")
    public long joinTime;

    @C09CT("linked_time")
    public long linkedTime;

    @C09CT("owner_user")
    public GroupPlayer ownerUser;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("type")
    public int type;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupChannelUser: status: ");
        sbLIZ.append(this.status);
        sbLIZ.append(" linkedTime: ");
        sbLIZ.append(this.linkedTime);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
