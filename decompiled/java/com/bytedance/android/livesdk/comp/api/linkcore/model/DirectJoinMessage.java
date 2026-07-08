package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes16.dex */
public final class DirectJoinMessage {
    public final CustomLinkMessage customMessage;
    public final LinkUser joiner;
    public final OnLineMicInfo joinerFixedMicInfo;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DirectJoinMessage(joiner=");
        sbLIZ.append(this.joiner);
        sbLIZ.append(", joinerFixedMicInfo=");
        sbLIZ.append(this.joinerFixedMicInfo);
        sbLIZ.append(", customMessage=");
        sbLIZ.append(this.customMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final UnifiedReplyInviteMessage toUnifiedReplyInviteMessage() {
        return new UnifiedReplyInviteMessage(this.joiner, 1, this.joinerFixedMicInfo, this.customMessage, null, null);
    }

    public DirectJoinMessage(LinkUser linkUser, OnLineMicInfo onLineMicInfo, CustomLinkMessage customLinkMessage) {
        this.joiner = linkUser;
        this.joinerFixedMicInfo = onLineMicInfo;
        this.customMessage = customLinkMessage;
    }
}
