package kotlin.reflect;

import X.C09RO;
import X.C13JW;
import X.C13JX;
import X.C1954807lC;
import X.C19989313Jb;
import X.C2188811AlT;
import X.EnumC19989213Ja;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class KTypeProjection {
    public static final C13JX LIZJ = new C13JX(null);
    public final EnumC19989213Ja LIZ;
    public final C09RO LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.LIZ == kTypeProjection.LIZ && Intrinsics.LJFF(this.LIZIZ, kTypeProjection.LIZIZ);
    }

    public final int hashCode() {
        EnumC19989213Ja enumC19989213Ja = this.LIZ;
        int iHashCode = (enumC19989213Ja == null ? 0 : enumC19989213Ja.hashCode()) * 31;
        C09RO c09ro = this.LIZIZ;
        return iHashCode + (c09ro != null ? c09ro.hashCode() : 0);
    }

    static {
        new KTypeProjection(null, null);
    }

    public final String toString() {
        int i;
        EnumC19989213Ja enumC19989213Ja = this.LIZ;
        if (enumC19989213Ja == null || (i = C19989313Jb.LIZ[enumC19989213Ja.ordinal()]) == -1) {
            return "*";
        }
        if (i == 1) {
            return String.valueOf(this.LIZIZ);
        }
        if (i == 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("in ");
            sbLIZ.append(this.LIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("out ");
        sbLIZ2.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public KTypeProjection(EnumC19989213Ja enumC19989213Ja, C13JW c13jw) {
        boolean z;
        boolean z2;
        String strLIZIZ;
        this.LIZ = enumC19989213Ja;
        this.LIZIZ = c13jw;
        if (enumC19989213Ja == null) {
            z = true;
        } else {
            z = false;
        }
        if (c13jw == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            return;
        }
        if (enumC19989213Ja == null) {
            strLIZIZ = "Star projection must have no type specified.";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The projection variance ");
            sbLIZ.append(enumC19989213Ja);
            sbLIZ.append(" requires type to be specified.");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
