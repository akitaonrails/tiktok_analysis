package pyl;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes26.dex */
public class q {
    public final boolean LIZ;
    public boolean LIZIZ = true;
    public Boolean LIZJ = Boolean.FALSE;

    public static q LIZ() {
        return new q(true);
    }

    public static q LIZIZ() {
        return new q(false);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrontRearChangeEvent{toFront=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public q(boolean z) {
        this.LIZ = z;
    }
}
