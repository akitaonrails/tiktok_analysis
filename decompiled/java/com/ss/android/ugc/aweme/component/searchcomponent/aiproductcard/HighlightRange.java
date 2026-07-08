package com.ss.android.ugc.aweme.component.searchcomponent.aiproductcard;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HighlightRange implements Serializable {
    public static final int $stable = 0;

    @C09CT("begin")
    public final Integer begin;

    @C09CT("end")
    public final Integer end;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightRange)) {
            return false;
        }
        HighlightRange highlightRange = (HighlightRange) obj;
        return Intrinsics.LJFF(this.begin, highlightRange.begin) && Intrinsics.LJFF(this.end, highlightRange.end);
    }

    public int hashCode() {
        Integer num = this.begin;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.end;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightRange(begin=");
        sbLIZ.append(this.begin);
        sbLIZ.append(", end=");
        sbLIZ.append(this.end);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HighlightRange(Integer num, Integer num2) {
        this.begin = num;
        this.end = num2;
    }
}
