package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CancelInviteContent {

    @C09CT("invite_seq_id")
    public long inviteSeqId;

    @C09CT("invitee")
    public Player invitee;

    @C09CT("invitee_link_mic_id")
    public String inviteeLinkMicId;

    @C09CT("invitee_linker_session_id")
    public String inviteeLinkerSessionId;

    @C09CT("invitor")
    public Player inviter;

    @C09CT("invitor_link_mic_id")
    public String inviterLinkMicId;

    public CancelInviteContent() {
        this(null, null, null, 0L, null, null);
    }

    public CancelInviteContent(Player player, String str, String str2, long j, Player player2, String str3) {
        this.inviter = player;
        this.inviterLinkMicId = str;
        this.inviteeLinkMicId = str2;
        this.inviteSeqId = j;
        this.invitee = player2;
        this.inviteeLinkerSessionId = str3;
    }
}
