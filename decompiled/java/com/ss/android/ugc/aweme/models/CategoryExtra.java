package com.ss.android.ugc.aweme.models;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class CategoryExtra {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("end_date")
    public final Long endDate;

    @C09CT("start_date")
    public final Long startDate;

    public CategoryExtra() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryExtra)) {
            return false;
        }
        CategoryExtra categoryExtra = (CategoryExtra) obj;
        return Intrinsics.LJFF(this.startDate, categoryExtra.startDate) && Intrinsics.LJFF(this.endDate, categoryExtra.endDate);
    }

    public final int hashCode() {
        Long l = this.startDate;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.endDate;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CategoryExtra(startDate=");
        sbLIZ.append(this.startDate);
        sbLIZ.append(", endDate=");
        sbLIZ.append(this.endDate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CategoryExtra(Long l, Long l2) {
        this.startDate = l;
        this.endDate = l2;
    }
}
