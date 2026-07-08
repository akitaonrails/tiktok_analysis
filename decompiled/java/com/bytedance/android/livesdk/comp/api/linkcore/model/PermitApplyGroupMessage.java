package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import tikcast.linkmic.common.GroupPlayer;

/* JADX INFO: loaded from: classes16.dex */
public final class PermitApplyGroupMessage {
    public final int agreeStatus;
    public final GroupPlayer approver;
    public final BusinessContent businessContent;
    public final LinkLayerMessage linkLayerMessage;

    public int hashCode() {
        int iHashCode = ((this.linkLayerMessage.hashCode() * 31) + this.agreeStatus) * 31;
        GroupPlayer groupPlayer = this.approver;
        int iHashCode2 = (iHashCode + (groupPlayer == null ? 0 : groupPlayer.hashCode())) * 31;
        BusinessContent businessContent = this.businessContent;
        return iHashCode2 + (businessContent != null ? businessContent.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PermitApplyGroupMessage(linkLayerMessage=");
        sbLIZ.append(this.linkLayerMessage);
        sbLIZ.append(", agreeStatus=");
        sbLIZ.append(this.agreeStatus);
        sbLIZ.append(", approver=");
        sbLIZ.append(this.approver);
        sbLIZ.append(", businessContent=");
        sbLIZ.append(this.businessContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PermitApplyGroupMessage(LinkLayerMessage linkLayerMessage, int i, GroupPlayer groupPlayer, BusinessContent businessContent) {
        this.linkLayerMessage = linkLayerMessage;
        this.agreeStatus = i;
        this.approver = groupPlayer;
        this.businessContent = businessContent;
    }
}
