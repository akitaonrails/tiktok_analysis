package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class InviteContent {

    @C09CT("dsl")
    public DSLConfig dsl;

    @C09CT("invitee")
    public Player invitee;

    @C09CT("invitee_link_mic_id")
    public String inviteeLinkMicId;

    @C09CT("invitee_linker_session_id")
    public String inviteeLinkerSessionId;

    @C09CT("invitee_rtc_ext_info")
    public RTCExtraInfo inviteeRTCInfo;

    @C09CT("invitor")
    public Player inviter;

    @C09CT("invitor_link_mic_id")
    public String inviterLinkMicId;

    @C09CT("is_owner")
    public boolean isOwner;

    @C09CT("operator")
    public Player operator;

    @C09CT("pos")
    public MicPositionData positionData;

    public InviteContent() {
        this(null, null, null, null, null, false, null, null, null, null);
    }

    public InviteContent(Player player, MicPositionData micPositionData, RTCExtraInfo rTCExtraInfo, String str, String str2, boolean z, DSLConfig dSLConfig, Player player2, Player player3, String str3) {
        this.inviter = player;
        this.positionData = micPositionData;
        this.inviteeRTCInfo = rTCExtraInfo;
        this.inviterLinkMicId = str;
        this.inviteeLinkMicId = str2;
        this.isOwner = z;
        this.dsl = dSLConfig;
        this.invitee = player2;
        this.operator = player3;
        this.inviteeLinkerSessionId = str3;
    }
}
