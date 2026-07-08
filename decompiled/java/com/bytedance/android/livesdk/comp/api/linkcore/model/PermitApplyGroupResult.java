package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public final class PermitApplyGroupResult {
    public final String logId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PermitApplyGroupResult(logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PermitApplyGroupResult(String str) {
        this.logId = str;
    }
}
