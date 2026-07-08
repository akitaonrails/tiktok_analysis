package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import com.bytedance.android.livesdk.model.message.linkcore.ApplyRequestResponse;

/* JADX INFO: loaded from: classes16.dex */
public final class ApplyResult {
    public final String logId;
    public final BizApplyResponse multiGuestRespExtra;
    public final ApplyRequestResponse rawApplyResp;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyResult(multiGuestRespExtra=");
        sbLIZ.append(this.multiGuestRespExtra);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(", rawApplyResp=");
        sbLIZ.append(this.rawApplyResp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ApplyResult(BizApplyResponse bizApplyResponse, String str, ApplyRequestResponse applyRequestResponse) {
        this.multiGuestRespExtra = bizApplyResponse;
        this.logId = str;
        this.rawApplyResp = applyRequestResponse;
    }
}
