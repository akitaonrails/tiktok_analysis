package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;
import webcast.im.JoinRoomDirectBizContent;
import webcast.im.KickOutBizContent;

/* JADX INFO: loaded from: classes.dex */
public final class MultiLiveContent {

    @C09CT("apply_biz_content")
    public ApplyBizContent applyIMContent;

    @C09CT("invite_biz_content")
    public InviteBizContent inviteIMContent;

    @C09CT("join_direct_biz_content")
    public JoinDirectBizContent joinDirectIMContent;

    @C09CT("join_room_direct_biz_content")
    public JoinRoomDirectBizContent joinRoomDirectBizContent;

    @C09CT("kick_out_biz_content")
    public KickOutBizContent kickOutBizContent;

    @C09CT("permit_biz_content")
    public PermitBizContent permitIMContent;

    @C09CT("reply_biz_content")
    public ReplyBizContent replyIMContent;

    public MultiLiveContent() {
        this(null, null, null, null, null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiLiveContent(applyIMContent=");
        sbLIZ.append(this.applyIMContent);
        sbLIZ.append(", inviteIMContent=");
        sbLIZ.append(this.inviteIMContent);
        sbLIZ.append(", replyIMContent=");
        sbLIZ.append(this.replyIMContent);
        sbLIZ.append(", permitIMContent=");
        sbLIZ.append(this.permitIMContent);
        sbLIZ.append(", joinDirectIMContent=");
        sbLIZ.append(this.joinDirectIMContent);
        sbLIZ.append(", kickOutBizContent=");
        sbLIZ.append(this.kickOutBizContent);
        sbLIZ.append(", joinRoomDirectBizContent=");
        sbLIZ.append(this.joinRoomDirectBizContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MultiLiveContent(ApplyBizContent applyBizContent, InviteBizContent inviteBizContent, ReplyBizContent replyBizContent, PermitBizContent permitBizContent, JoinDirectBizContent joinDirectBizContent, KickOutBizContent kickOutBizContent, JoinRoomDirectBizContent joinRoomDirectBizContent) {
        this.applyIMContent = applyBizContent;
        this.inviteIMContent = inviteBizContent;
        this.replyIMContent = replyBizContent;
        this.permitIMContent = permitBizContent;
        this.joinDirectIMContent = joinDirectBizContent;
        this.kickOutBizContent = kickOutBizContent;
        this.joinRoomDirectBizContent = joinRoomDirectBizContent;
    }
}
