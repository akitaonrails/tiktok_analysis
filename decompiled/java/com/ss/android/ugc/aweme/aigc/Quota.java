package com.ss.android.ugc.aweme.aigc;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class Quota extends AbstractC2126608Uu {

    @C09CT("quota_remain")
    public final Integer quotaRemain;

    @C09CT("job_type")
    public final String quotaType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Quota)) {
            return false;
        }
        Quota quota = (Quota) obj;
        return Intrinsics.LJFF(this.quotaType, quota.quotaType) && Intrinsics.LJFF(this.quotaRemain, quota.quotaRemain);
    }

    public final int hashCode() {
        String str = this.quotaType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.quotaRemain;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Quota(quotaType=");
        sbLIZ.append(this.quotaType);
        sbLIZ.append(", quotaRemain=");
        sbLIZ.append(this.quotaRemain);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Quota(String str, Integer num) {
        this.quotaType = str;
        this.quotaRemain = num;
    }
}
