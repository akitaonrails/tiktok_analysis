package com.bytedance.android.livesdk.subscribe.model.invite;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class SubInvitationListData {

    @C09CT("invitation_codes")
    public List<SubInvitationCode> invitationCodeList;

    @C09CT("inviter_infos")
    public Map<String, User> invitersInfo;

    @C09CT("self_info")
    public User selfInfo;

    @C09CT("switcher")
    public SubInvitationFunctionSwitcher switcher;

    @C09CT("total_count")
    public long totalCount;
}
