package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import tikcast.linkmic.common.GroupPlayer;

/* JADX INFO: loaded from: classes16.dex */
public final class InviteGroupMessage {
    public final long arrivalTime;
    public final BusinessContent businessContent;
    public final boolean isFromQueueReorder;
    public final GroupPlayer joinUser;
    public final LinkLayerMessage linkLayerMessage;

    public final InviteGroupMessage copy(LinkLayerMessage linkLayerMessage, GroupPlayer groupPlayer, BusinessContent businessContent, long j, boolean z) {
        return new InviteGroupMessage(linkLayerMessage, groupPlayer, businessContent, j, z);
    }

    public int hashCode() {
        int iHashCode = this.linkLayerMessage.hashCode() * 31;
        GroupPlayer groupPlayer = this.joinUser;
        int iHashCode2 = (iHashCode + (groupPlayer == null ? 0 : groupPlayer.hashCode())) * 31;
        BusinessContent businessContent = this.businessContent;
        return ((((iHashCode2 + (businessContent != null ? businessContent.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.arrivalTime)) * 31) + C786410Ut5.Z2(this.isFromQueueReorder);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteGroupMessage(linkLayerMessage=");
        sbLIZ.append(this.linkLayerMessage);
        sbLIZ.append(", joinUser=");
        sbLIZ.append(this.joinUser);
        sbLIZ.append(", businessContent=");
        sbLIZ.append(this.businessContent);
        sbLIZ.append(", arrivalTime=");
        sbLIZ.append(this.arrivalTime);
        sbLIZ.append(", isFromQueueReorder=");
        sbLIZ.append(this.isFromQueueReorder);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isFromQueueReorder() {
        return this.isFromQueueReorder;
    }

    public InviteGroupMessage(LinkLayerMessage linkLayerMessage, GroupPlayer groupPlayer, BusinessContent businessContent, long j, boolean z) {
        this.linkLayerMessage = linkLayerMessage;
        this.joinUser = groupPlayer;
        this.businessContent = businessContent;
        this.arrivalTime = j;
        this.isFromQueueReorder = z;
    }
}
