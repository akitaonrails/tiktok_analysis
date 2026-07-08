package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes16.dex */
public final class KickOutMessage {
    public final CustomLinkMessage customMessage;
    public final int kickOutReason;
    public final LinkUser owner;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KickOutMessage(owner=");
        sbLIZ.append(this.owner);
        sbLIZ.append(", kickOutReason=");
        sbLIZ.append(this.kickOutReason);
        sbLIZ.append(", customMessage=");
        sbLIZ.append(this.customMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public KickOutMessage(LinkUser linkUser, int i, CustomLinkMessage customLinkMessage) {
        this.owner = linkUser;
        this.kickOutReason = i;
        this.customMessage = customLinkMessage;
    }
}
