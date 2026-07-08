package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes16.dex */
public final class ReplyInviteGroupResult {
    public final String logId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyInviteGroupResult(logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ReplyInviteGroupResult(String str) {
        this.logId = str;
    }
}
