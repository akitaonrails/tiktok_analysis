package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ReplyInviteContent {

    @C09CT("invite_operator_user")
    public Player inviteOperatorUser;

    @C09CT("invitee")
    public Player invitee;

    @C09CT("invitee_link_mic_id")
    public String inviteeLinkMicId;

    @C09CT("invitee_linker_session_id")
    public String inviteeLinkerSessionId;

    @C09CT("layout")
    public LayoutState layout;

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions;

    @C09CT("invitee_pos")
    public MicPositionData positionData;

    @C09CT("reply_status")
    public int replyStatus;

    @C09CT("spot_list")
    public List<SpotInfo> spotList;

    @C09CT("ui_pos")
    public List<PosIdentity> uiPos;

    public ReplyInviteContent() {
        this(null, 0, null, null, null, new ArrayList(), new ArrayList(), null, new ArrayList(), null);
    }

    public ReplyInviteContent(Player player, int i, MicPositionData micPositionData, String str, Player player2, List<String> list, List<PosIdentity> list2, LayoutState layoutState, List<SpotInfo> list3, String str2) {
        this.invitee = player;
        this.replyStatus = i;
        this.positionData = micPositionData;
        this.inviteeLinkMicId = str;
        this.inviteOperatorUser = player2;
        this.linkedUserUiPositions = list;
        this.uiPos = list2;
        this.layout = layoutState;
        this.spotList = list3;
        this.inviteeLinkerSessionId = str2;
    }
}
