package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import webcast.data.cohost_biz.BizJoinGroupResponse;

/* JADX INFO: loaded from: classes16.dex */
public final class InviteGroupResult {
    public final BizJoinGroupResponse cohostRespExtra;
    public final String logId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteGroupResult(cohostRespExtra=");
        sbLIZ.append(this.cohostRespExtra);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InviteGroupResult(BizJoinGroupResponse bizJoinGroupResponse, String str) {
        this.cohostRespExtra = bizJoinGroupResponse;
        this.logId = str;
    }
}
