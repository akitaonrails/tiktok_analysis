package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes2.dex */
public final class PollResultTime {

    @C09CT("pmid")
    public final String pmId;

    @C09CT("time_ms")
    public final Long timeMs;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollResultTime(timeMs=");
        sbLIZ.append(this.timeMs);
        sbLIZ.append(", pmId=");
        sbLIZ.append(this.pmId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PollResultTime(Long l, String str) {
        this.timeMs = l;
        this.pmId = str;
    }
}
