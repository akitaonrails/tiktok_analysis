package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BizReplyParams {

    @C09CT("is_turn_off_invitation")
    public int isTurnOffInvitation;

    @C09CT("link_type")
    public long linkType;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizReplyParams(linkType=");
        sbLIZ.append(this.linkType);
        sbLIZ.append(", isTurnOffInvitation=");
        sbLIZ.append(this.isTurnOffInvitation);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BizReplyParams() {
        this(0L, 0);
    }

    public BizReplyParams(long j, int i) {
        this.linkType = j;
        this.isTurnOffInvitation = i;
    }
}
