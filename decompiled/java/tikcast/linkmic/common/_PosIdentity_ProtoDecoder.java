package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PosIdentity_ProtoDecoder implements C0IMD<PosIdentity> {
    public static PosIdentity LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PosIdentity posIdentity = new PosIdentity();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        posIdentity.value = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    posIdentity.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return posIdentity;
            }
        }
    }

    @Override // X.C0IMD
    public final PosIdentity LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PosIdentity posIdentity) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PosIdentity posIdentity, List list) {
    }
}
