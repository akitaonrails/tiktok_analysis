package com.bytedance.android.livesdk.subscribe.model.invite;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes8.dex */
public final class GetInvitationStatusResponse {

    @C09CT("code_data")
    public SubInvitationCode inviteCodeData;

    @C09CT("invitation_status")
    public SubInvitationInviteeStatus inviteeStatus;

    @C09CT("inviter_info")
    public User inviterInfo;

    @C09CT("self_info")
    public User selfInfo;

    @C09CT("switcher")
    public SubInvitationFunctionSwitcher switcher;
}
