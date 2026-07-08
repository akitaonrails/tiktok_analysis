package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import tikcast.linkmic.common.GroupPlayer;

/* JADX INFO: loaded from: classes16.dex */
public final class LeaveGroupMessage {
    public final LinkLayerMessage linkLayerMessage;
    public final GroupPlayer operator;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LeaveGroupMessage(linkLayerMessage=");
        sbLIZ.append(this.linkLayerMessage);
        sbLIZ.append(", operator=");
        sbLIZ.append(this.operator);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LeaveGroupMessage(LinkLayerMessage linkLayerMessage, GroupPlayer groupPlayer) {
        this.linkLayerMessage = linkLayerMessage;
        this.operator = groupPlayer;
    }
}
