package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import webcast.data.cohost_biz.BizLeaveJoinGroupResponse;

/* JADX INFO: loaded from: classes16.dex */
public final class LeaveGroupResult {
    public final BizLeaveJoinGroupResponse cohostRespExtra;
    public final String logId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LeaveGroupResult(cohostRespExtra=");
        sbLIZ.append(this.cohostRespExtra);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LeaveGroupResult(BizLeaveJoinGroupResponse bizLeaveJoinGroupResponse, String str) {
        this.cohostRespExtra = bizLeaveJoinGroupResponse;
        this.logId = str;
    }
}
