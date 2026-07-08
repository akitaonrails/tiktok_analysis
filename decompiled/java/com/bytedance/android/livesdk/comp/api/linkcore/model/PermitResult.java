package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import java.util.Map;
import webcast.data.multilive_biz.BizPermitResponse;

/* JADX INFO: loaded from: classes.dex */
public final class PermitResult {
    public final OnLineMicInfo applicantFixedMicInfo;
    public final Map<String, byte[]> extraItems;
    public final String logId;
    public final BizPermitResponse multiGuestRespExtra;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PermitResult(applicantFixedMicInfo=");
        sbLIZ.append(this.applicantFixedMicInfo);
        sbLIZ.append(", extraItems=");
        sbLIZ.append(this.extraItems);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(", multiGuestRespExtra=");
        sbLIZ.append(this.multiGuestRespExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PermitResult(OnLineMicInfo onLineMicInfo, Map<String, byte[]> map, String str, BizPermitResponse bizPermitResponse) {
        this.applicantFixedMicInfo = onLineMicInfo;
        this.extraItems = map;
        this.logId = str;
        this.multiGuestRespExtra = bizPermitResponse;
    }
}
