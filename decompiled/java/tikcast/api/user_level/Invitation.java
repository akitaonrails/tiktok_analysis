package tikcast.api.user_level;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class Invitation {

    @C09CT("invitation_id")
    public String invitationId = "";

    @C09CT("is_open")
    public boolean isOpen;

    @C09CT("issue_source")
    public int issueSource;

    @C09CT("shared_user_info")
    public User sharedUserInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
