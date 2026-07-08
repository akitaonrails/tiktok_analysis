package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes16.dex */
public final class LeaveMessage {
    public final CustomLinkMessage customMessage;
    public final LinkUser leftUser;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LeaveMessage(leftUser=");
        sbLIZ.append(this.leftUser);
        sbLIZ.append(", customMessage=");
        sbLIZ.append(this.customMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LeaveMessage(LinkUser linkUser, CustomLinkMessage customLinkMessage) {
        this.leftUser = linkUser;
        this.customMessage = customLinkMessage;
    }
}
