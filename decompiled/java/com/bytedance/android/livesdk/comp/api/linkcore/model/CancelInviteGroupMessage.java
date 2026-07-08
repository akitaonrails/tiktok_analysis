package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import java.util.List;
import tikcast.linkmic.common.GroupPlayer;

/* JADX INFO: loaded from: classes16.dex */
public final class CancelInviteGroupMessage {
    public final List<GroupPlayer> leaver;
    public final LinkLayerMessage linkLayerMessage;
    public final GroupPlayer operator;

    public int hashCode() {
        int iHashCode = this.linkLayerMessage.hashCode() * 31;
        List<GroupPlayer> list = this.leaver;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        GroupPlayer groupPlayer = this.operator;
        return iHashCode2 + (groupPlayer != null ? groupPlayer.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelInviteGroupMessage(linkLayerMessage=");
        sbLIZ.append(this.linkLayerMessage);
        sbLIZ.append(", leaver=");
        sbLIZ.append(this.leaver);
        sbLIZ.append(", operator=");
        sbLIZ.append(this.operator);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CancelInviteGroupMessage(LinkLayerMessage linkLayerMessage, List<GroupPlayer> list, GroupPlayer groupPlayer) {
        this.linkLayerMessage = linkLayerMessage;
        this.leaver = list;
        this.operator = groupPlayer;
    }
}
