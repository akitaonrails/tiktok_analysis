package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes16.dex */
public final class CancelInviteMessage {
    public final CustomLinkMessage customMessage;
    public final Player invitee;
    public final LinkUser inviter;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelInviteMessage(inviter=");
        sbLIZ.append(this.inviter);
        sbLIZ.append(", customMessage=");
        sbLIZ.append(this.customMessage);
        sbLIZ.append(", invitee=");
        sbLIZ.append(this.invitee);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CancelInviteMessage(LinkUser linkUser, CustomLinkMessage customLinkMessage, Player player) {
        this.inviter = linkUser;
        this.customMessage = customLinkMessage;
        this.invitee = player;
    }
}
