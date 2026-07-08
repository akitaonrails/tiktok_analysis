package tikcast.api.anchor_tool;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes17.dex */
public final class InviteeDetail {

    @C09CT("bind_date")
    public long bindDate;

    @C09CT("button_status")
    public int buttonStatus;

    @C09CT("promote")
    public long promote;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("user_id")
    public String userId = "";

    @C09CT("handle")
    public String handle = "";

    @C09CT("extra")
    public String extra = "";

    @C09CT("failed_reason")
    public String failedReason = "";

    @C09CT("avatar_url")
    public String avatarUrl = "";
}
