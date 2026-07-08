package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class JoinDirectBizContent {

    @C09CT("is_full_position_pre_approved")
    public boolean isFullPositionPreApproved;

    @C09CT("mg_source_role")
    public int mgSourceRole;

    @C09CT("outside_room_invite_source")
    public int outsideRoomInviteSource;

    @C09CT("reply_im_msg_id")
    public long replyImMsgId;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JoinDirectBizContent(replyImMsgId=");
        sbLIZ.append(this.replyImMsgId);
        sbLIZ.append(", outsideRoomInviteSource=");
        sbLIZ.append(this.outsideRoomInviteSource);
        sbLIZ.append(", isFullPositionPreApproved=");
        sbLIZ.append(this.isFullPositionPreApproved);
        sbLIZ.append(", mgSourceRole=");
        sbLIZ.append(this.mgSourceRole);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JoinDirectBizContent() {
        this(0L, 0, false, 0);
    }

    public JoinDirectBizContent(long j, int i, boolean z, int i2) {
        this.replyImMsgId = j;
        this.outsideRoomInviteSource = i;
        this.isFullPositionPreApproved = z;
        this.mgSourceRole = i2;
    }
}
