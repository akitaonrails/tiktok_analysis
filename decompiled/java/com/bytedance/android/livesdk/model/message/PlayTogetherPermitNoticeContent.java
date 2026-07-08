package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class PlayTogetherPermitNoticeContent {

    @C09CT("permit_type")
    public int permitType;

    @C09CT("pick_time")
    public long pickTime;

    @C09CT("service_time")
    public long serviceTime;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pickTime: ");
        sbLIZ.append(this.pickTime);
        sbLIZ.append(", serviceTime: ");
        sbLIZ.append(this.serviceTime);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
