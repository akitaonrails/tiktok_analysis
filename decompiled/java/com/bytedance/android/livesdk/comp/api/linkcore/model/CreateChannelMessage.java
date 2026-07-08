package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes16.dex */
public final class CreateChannelMessage {
    public final CustomLinkMessage customMessage;
    public final LinkUser owner;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateChannelMessage(owner=");
        sbLIZ.append(this.owner);
        sbLIZ.append(", customMessage=");
        sbLIZ.append(this.customMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreateChannelMessage(LinkUser linkUser, CustomLinkMessage customLinkMessage) {
        this.owner = linkUser;
        this.customMessage = customLinkMessage;
    }
}
