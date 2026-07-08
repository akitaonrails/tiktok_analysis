package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes2.dex */
public final class LabelCountDown {

    @C09CT("end_time")
    public String endTime;

    @C09CT("start_time")
    public String startTime;

    public LabelCountDown() {
    }

    public final int hashCode() {
        String str = this.startTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endTime;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LabelCountDown(startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LabelCountDown(String str, String str2) {
        this.startTime = str;
        this.endTime = str2;
    }
}
