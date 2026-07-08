package defpackage;

import X.C1360650lVn;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b8 implements InterfaceC0148002o {
    public final C1360650lVn LL;
    public final a8 LLILLJJLI;
    public final boolean LLILLL;

    public b8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        return Intrinsics.LJFF(this.LL, b8Var.LL) && this.LLILLJJLI == b8Var.LLILLJJLI && this.LLILLL == b8Var.LLILLL;
    }

    public final int hashCode() {
        C1360650lVn c1360650lVn = this.LL;
        return ((((c1360650lVn == null ? 0 : c1360650lVn.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostFeedEntranceState(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", listAppearAnimation=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ b8(int i) {
        this(null, a8.NONE, false);
    }

    public b8(C1360650lVn c1360650lVn, a8 a8Var, boolean z) {
        this.LL = c1360650lVn;
        this.LLILLJJLI = a8Var;
        this.LLILLL = z;
    }

    public static b8 LIZ(b8 b8Var, C1360650lVn c1360650lVn, a8 a8Var, boolean z, int i) {
        if ((i & 1) != 0) {
            c1360650lVn = b8Var.LL;
        }
        if ((i & 2) != 0) {
            a8Var = b8Var.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = b8Var.LLILLL;
        }
        b8Var.getClass();
        return new b8(c1360650lVn, a8Var, z);
    }
}
