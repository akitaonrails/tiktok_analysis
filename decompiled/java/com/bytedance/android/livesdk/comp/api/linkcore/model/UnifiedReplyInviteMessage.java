package com.bytedance.android.livesdk.comp.api.linkcore.model;

import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes16.dex */
public final class UnifiedReplyInviteMessage {
    public final CustomLinkMessage customMessage;
    public final LinkUser inviteOperator;
    public final LinkUser invitee;
    public final OnLineMicInfo inviteeFixedMicInfo;
    public final int replyStatus;
    public final User replyUserInfo;

    public UnifiedReplyInviteMessage(LinkUser linkUser, int i, OnLineMicInfo onLineMicInfo, CustomLinkMessage customLinkMessage, User user, LinkUser linkUser2) {
        this.invitee = linkUser;
        this.replyStatus = i;
        this.inviteeFixedMicInfo = onLineMicInfo;
        this.customMessage = customLinkMessage;
        this.replyUserInfo = user;
        this.inviteOperator = linkUser2;
    }
}
