package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class ReplyBizContent {

    @C09CT("is_full_position_pre_approved")
    public boolean isFullPositionPreApproved;

    @C09CT("is_turn_off_invitation")
    public int isTurnOffInvitation;

    @C09CT("link_type")
    public int linkType;

    @C09CT("reply_user_info")
    public User replyUserInfo;

    public ReplyBizContent() {
        this(0, 0, null, false);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyBizContent(linkType=");
        sbLIZ.append(this.linkType);
        sbLIZ.append(", isTurnOffInvitation=");
        sbLIZ.append(this.isTurnOffInvitation);
        sbLIZ.append(", replyUserInfo=");
        sbLIZ.append(this.replyUserInfo);
        sbLIZ.append(", isFullPositionPreApproved=");
        sbLIZ.append(this.isFullPositionPreApproved);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ReplyBizContent(int i, int i2, User user, boolean z) {
        this.linkType = i;
        this.isTurnOffInvitation = i2;
        this.replyUserInfo = user;
        this.isFullPositionPreApproved = z;
    }
}
