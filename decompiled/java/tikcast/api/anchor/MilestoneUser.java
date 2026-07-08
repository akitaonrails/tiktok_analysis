package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class MilestoneUser {

    @C09CT("can_send_dm")
    public boolean canSendDm;

    @C09CT("sent_dm_in_session")
    public boolean sentDmInSession;

    @C09CT("stat_value")
    public String statValue = "";

    @C09CT("user")
    public User user;
}
