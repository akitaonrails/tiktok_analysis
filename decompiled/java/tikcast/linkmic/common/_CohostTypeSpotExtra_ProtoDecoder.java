package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostTypeSpotExtra_ProtoDecoder implements C0IMD<CohostTypeSpotExtra> {
    public static CohostTypeSpotExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostTypeSpotExtra cohostTypeSpotExtra = new CohostTypeSpotExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            cohostTypeSpotExtra.preEnlargeSpotId = c1516680pZS.LJIIJ();
                        }
                    } else {
                        cohostTypeSpotExtra.contentType = c1516680pZS.LJIIJ();
                    }
                } else {
                    cohostTypeSpotExtra.isEnlarged = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostTypeSpotExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final CohostTypeSpotExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CohostTypeSpotExtra cohostTypeSpotExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostTypeSpotExtra cohostTypeSpotExtra, List list) {
    }
}
