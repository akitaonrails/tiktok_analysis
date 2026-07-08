package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationCode;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationInviteeStatus;

/* JADX INFO: loaded from: classes8.dex */
public final class SubInvitationTaskProgress {

    @C09CT("code")
    public SubInvitationCode code;

    @C09CT("invitation_status")
    public SubInvitationInviteeStatus invitationStatus;

    @C09CT("subscriber_count")
    public int subscriberCount;
}
