package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class ReplyInviteMessage {
    public final CustomLinkMessage customMessage;
    public final LinkUser inviteOperator;
    public final LinkUser invitee;
    public final OnLineMicInfo inviteeFixedMicInfo;
    public final List<String> linkedUserUiPosition;
    public final int replyStatus;
    public final User replyUserInfo;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyInviteMessage(invitee=");
        sbLIZ.append(this.invitee);
        sbLIZ.append(", replyStatus=");
        sbLIZ.append(this.replyStatus);
        sbLIZ.append(", inviteeFixedMicInfo=");
        sbLIZ.append(this.inviteeFixedMicInfo);
        sbLIZ.append(", customMessage=");
        sbLIZ.append(this.customMessage);
        sbLIZ.append(", replyUserInfo=");
        sbLIZ.append(this.replyUserInfo);
        sbLIZ.append(", inviteOperator=");
        sbLIZ.append(this.inviteOperator);
        sbLIZ.append(", linkedUserUiPosition=");
        sbLIZ.append(this.linkedUserUiPosition);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final UnifiedReplyInviteMessage toUnifiedReplyInviteMessage() {
        return new UnifiedReplyInviteMessage(this.invitee, this.replyStatus, this.inviteeFixedMicInfo, this.customMessage, this.replyUserInfo, this.inviteOperator);
    }

    public ReplyInviteMessage(LinkUser linkUser, int i, OnLineMicInfo onLineMicInfo, CustomLinkMessage customLinkMessage, User user, LinkUser linkUser2, List<String> list) {
        this.invitee = linkUser;
        this.replyStatus = i;
        this.inviteeFixedMicInfo = onLineMicInfo;
        this.customMessage = customLinkMessage;
        this.replyUserInfo = user;
        this.inviteOperator = linkUser2;
        this.linkedUserUiPosition = list;
    }
}
