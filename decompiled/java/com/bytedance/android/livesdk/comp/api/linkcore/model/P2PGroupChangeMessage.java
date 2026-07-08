package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;

/* JADX INFO: loaded from: classes16.dex */
public final class P2PGroupChangeMessage {
    public final BusinessContent businessContent;
    public final LinkLayerMessage linkLayerMessage;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("P2PGroupChangeMessage(linkLayerMessage=");
        sbLIZ.append(this.linkLayerMessage);
        sbLIZ.append(", businessContent=");
        sbLIZ.append(this.businessContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public P2PGroupChangeMessage(LinkLayerMessage linkLayerMessage, BusinessContent businessContent) {
        this.linkLayerMessage = linkLayerMessage;
        this.businessContent = businessContent;
    }
}
