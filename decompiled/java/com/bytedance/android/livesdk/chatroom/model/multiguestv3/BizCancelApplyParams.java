package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BizCancelApplyParams {

    @C09CT("anchor_id")
    public long anchorId;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizCancelApplyParams(anchorId=");
        sbLIZ.append(this.anchorId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BizCancelApplyParams() {
        this(0L);
    }

    public BizCancelApplyParams(long j) {
        this.anchorId = j;
    }
}
