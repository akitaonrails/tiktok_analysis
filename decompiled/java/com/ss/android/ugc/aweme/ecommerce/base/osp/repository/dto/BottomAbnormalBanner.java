package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BottomAbnormalBanner {

    @C09CT("abnormal_type")
    public Integer abnormalType;

    @C09CT("desc")
    public String desc;

    public BottomAbnormalBanner() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomAbnormalBanner)) {
            return false;
        }
        BottomAbnormalBanner bottomAbnormalBanner = (BottomAbnormalBanner) obj;
        return Intrinsics.LJFF(this.desc, bottomAbnormalBanner.desc) && Intrinsics.LJFF(this.abnormalType, bottomAbnormalBanner.abnormalType);
    }

    public final int hashCode() {
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.abnormalType;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomAbnormalBanner(desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", abnormalType=");
        sbLIZ.append(this.abnormalType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BottomAbnormalBanner(String str, Integer num) {
        this.desc = str;
        this.abnormalType = num;
    }
}
