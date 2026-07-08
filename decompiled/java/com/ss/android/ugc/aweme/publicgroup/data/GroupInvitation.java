package com.ss.android.ugc.aweme.publicgroup.data;

import X.C09CT;
import X.EnumC992570bw7;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupInvitation {

    @C09CT("invite_channel")
    public final int inviteChannel;

    @C09CT("invite_id")
    public final String inviteId;

    @C09CT("inviter_id")
    public final long inviterId;

    @C09CT("inviter_name")
    public final String inviterName;

    @C09CT("inviter_role")
    public final int inviterRole;

    public GroupInvitation() {
        this("", EnumC992570bw7.GROUP_INVITE_CHANNEL_DEFAULT.getValue(), 0L, 0, "");
    }

    public GroupInvitation(String str, int i, long j, int i2, String str2) {
        this.inviteId = str;
        this.inviteChannel = i;
        this.inviterId = j;
        this.inviterRole = i2;
        this.inviterName = str2;
    }
}
