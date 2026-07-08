package com.ss.android.ugc.aweme.pns.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PNSUserDetailsInfoBean {

    @C09CT("is_minor")
    public final Boolean isMinor;

    @C09CT("time_usage_today")
    public final int todayUsageTime;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSUserDetailsInfoBean)) {
            return false;
        }
        PNSUserDetailsInfoBean pNSUserDetailsInfoBean = (PNSUserDetailsInfoBean) obj;
        return Intrinsics.LJFF(this.isMinor, pNSUserDetailsInfoBean.isMinor) && this.todayUsageTime == pNSUserDetailsInfoBean.todayUsageTime;
    }

    public final int hashCode() {
        Boolean bool = this.isMinor;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + this.todayUsageTime;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSUserDetailsInfoBean(isMinor=");
        sbLIZ.append(this.isMinor);
        sbLIZ.append(", todayUsageTime=");
        sbLIZ.append(this.todayUsageTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PNSUserDetailsInfoBean() {
        this(Boolean.FALSE, 0);
    }

    public PNSUserDetailsInfoBean(Boolean bool, int i) {
        this.isMinor = bool;
        this.todayUsageTime = i;
    }
}
