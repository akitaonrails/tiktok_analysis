package defpackage;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Extra;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x2 {
    public final Message LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final Extra LIZLLL;
    public final k9 LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return Intrinsics.LJFF(this.LIZ, x2Var.LIZ) && this.LIZIZ == x2Var.LIZIZ && Intrinsics.LJFF(this.LIZJ, x2Var.LIZJ) && Intrinsics.LJFF(this.LIZLLL, x2Var.LIZLLL) && Intrinsics.LJFF(this.LJ, x2Var.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        Extra extra = this.LIZLLL;
        return ((iHashCode + (extra == null ? 0 : extra.hashCode())) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageStatusUpdate(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", responseExtra=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", commonInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public x2(Message message, int i, String str, Extra extra, k9 k9Var) {
        this.LIZ = message;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = extra;
        this.LJ = k9Var;
    }
}
