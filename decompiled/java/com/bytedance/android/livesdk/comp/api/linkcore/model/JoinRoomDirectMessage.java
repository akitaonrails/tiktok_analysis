package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class JoinRoomDirectMessage {
    public final CustomLinkMessage customMessage;
    public final LinkUser joiner;
    public final LayoutState layout;
    public final List<SpotInfo> spotList;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JoinRoomDirectMessage(joiner=");
        sbLIZ.append(this.joiner);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(", customMessage=");
        sbLIZ.append(this.customMessage);
        sbLIZ.append(", spotList=");
        sbLIZ.append(this.spotList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public JoinRoomDirectMessage(LinkUser linkUser, LayoutState layoutState, CustomLinkMessage customLinkMessage, List<SpotInfo> list) {
        this.joiner = linkUser;
        this.layout = layoutState;
        this.customMessage = customLinkMessage;
        this.spotList = list;
    }
}
