package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes2.dex */
public final class CommuteInfo {

    @C09CT("supported_commute_type")
    public CommuteType commuteType;

    public CommuteInfo() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommuteInfo) && this.commuteType == ((CommuteInfo) obj).commuteType;
    }

    public final int hashCode() {
        CommuteType commuteType = this.commuteType;
        if (commuteType == null) {
            return 0;
        }
        return commuteType.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommuteInfo(commuteType=");
        sbLIZ.append(this.commuteType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommuteInfo(CommuteType commuteType) {
        this.commuteType = commuteType;
    }
}
