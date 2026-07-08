package kotlin.text;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes17.dex */
public final class MatchGroup {
    public final String LIZ;
    public final IntRange LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.LJFF(this.LIZ, matchGroup.LIZ) && Intrinsics.LJFF(this.LIZIZ, matchGroup.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchGroup(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", range=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MatchGroup(String str, IntRange intRange) {
        this.LIZ = str;
        this.LIZIZ = intRange;
    }
}
