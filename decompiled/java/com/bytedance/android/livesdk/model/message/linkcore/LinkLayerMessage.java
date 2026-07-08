package com.bytedance.android.livesdk.model.message.linkcore;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.scene.Scene;
import webcast.im.CancelJoinGroupContent;
import webcast.im.GroupChangeContent;
import webcast.im.JoinGroupContent;
import webcast.im.JoinGroupDirectContent;
import webcast.im.JoinRoomDirectContent;
import webcast.im.LeaveJoinGroupContent;
import webcast.im.LinkEnvelopeContent;
import webcast.im.P2PGroupChangeContent;
import webcast.im.PermitJoinGroupContent;

/* JADX INFO: loaded from: classes.dex */
public final class LinkLayerMessage extends AbstractC1136060ffY {

    @C09CT("apply_content")
    public ApplyContent applyContent;

    @C09CT("business_content")
    public BusinessContent bizContent;

    @C09CT("cancel_apply_content")
    public CancelApplyContent cancelApplyContent;

    @C09CT("cancel_group_content")
    public CancelJoinGroupContent cancelGroupContent;

    @C09CT("cancel_invite_content")
    public CancelInviteContent cancelInviteContent;

    @C09CT("centerized_idc")
    public String centerizedIdc;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("create_channel_content")
    public CreateChannelContent createChannelContent;

    @C09CT("finish_content")
    public FinishChannelContent finishContent;

    @C09CT("group_change_content")
    public GroupChangeContent groupChangeContent;

    @C09CT("invite_content")
    public InviteContent inviteContent;

    @C09CT("join_direct_content")
    public JoinDirectContent joinDirectContent;

    @C09CT("join_group_content")
    public JoinGroupContent joinGroupContent;

    @C09CT("join_group_direct_content")
    public JoinGroupDirectContent joinGroupDirectContent;

    @C09CT("join_room_direct_content")
    public JoinRoomDirectContent joinRoomDirectContent;

    @C09CT("kick_out_content")
    public KickOutContent kickOutContent;

    @C09CT("leave_content")
    public LeaveContent leaveContent;

    @C09CT("leave_group_content")
    public LeaveJoinGroupContent leaveGroupContent;

    @C09CT("link_envelope_content")
    public LinkEnvelopeContent linkEnvelopeContent;

    @C09CT("linker_mode")
    public int linkerMode;

    @C09CT("list_change_content")
    public LinkListChangeContent listContent;

    @C09CT("message_type")
    public int messageType;

    @C09CT("p2p_group_change_content")
    public P2PGroupChangeContent p2pGroupChangeContent;

    @C09CT("permit_apply_content")
    public PermitApplyContent permitApplyContent;

    @C09CT("permit_group_content")
    public PermitJoinGroupContent permitGroupContent;

    @C09CT("reply_invite_content")
    public ReplyInviteContent replyInviteContent;

    @C09CT("rtc_room_id")
    public long rtcRoomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("source")
    public String source;

    @C09CT("version")
    public long version;

    @C09CT("wait_cross_data")
    public boolean waitCrossData;

    public LinkLayerMessage() {
        this(0, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public LinkLayerMessage(int i, long j, int i2, CreateChannelContent createChannelContent, LinkListChangeContent linkListChangeContent, InviteContent inviteContent, ApplyContent applyContent, PermitApplyContent permitApplyContent, ReplyInviteContent replyInviteContent, KickOutContent kickOutContent, CancelApplyContent cancelApplyContent, CancelInviteContent cancelInviteContent, LeaveContent leaveContent, FinishChannelContent finishChannelContent, BusinessContent businessContent, JoinDirectContent joinDirectContent) {
        this.messageType = i;
        this.channelId = j;
        this.scene = i2;
        this.createChannelContent = createChannelContent;
        this.listContent = linkListChangeContent;
        this.inviteContent = inviteContent;
        this.applyContent = applyContent;
        this.permitApplyContent = permitApplyContent;
        this.replyInviteContent = replyInviteContent;
        this.kickOutContent = kickOutContent;
        this.cancelApplyContent = cancelApplyContent;
        this.cancelInviteContent = cancelInviteContent;
        this.leaveContent = leaveContent;
        this.finishContent = finishChannelContent;
        this.bizContent = businessContent;
        this.joinDirectContent = joinDirectContent;
        this.type = C001A.BASE_LINK_LAYER_MESSAGE;
        this.source = "";
        this.centerizedIdc = "";
    }
}
