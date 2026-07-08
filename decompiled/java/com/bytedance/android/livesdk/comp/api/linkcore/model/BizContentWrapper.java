package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import webcast.im.P2PGroupChangeContent;

/* JADX INFO: loaded from: classes16.dex */
public final class BizContentWrapper {
    public final BusinessContent bizContent;
    public final P2PGroupChangeContent p2PGroupChangeContent;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizContentWrapper(bizContent=");
        sbLIZ.append(this.bizContent);
        sbLIZ.append(", p2PGroupChangeContent=");
        sbLIZ.append(this.p2PGroupChangeContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BizContentWrapper(BusinessContent businessContent, P2PGroupChangeContent p2PGroupChangeContent) {
        this.bizContent = businessContent;
        this.p2PGroupChangeContent = p2PGroupChangeContent;
    }
}
