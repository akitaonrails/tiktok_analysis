package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class _CohostTypeLayoutExtra_ProtoDecoder implements C0IMD<CohostTypeLayoutExtra> {
    public static CohostTypeLayoutExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostTypeLayoutExtra cohostTypeLayoutExtra = new CohostTypeLayoutExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        cohostTypeLayoutExtra.isZoomLayout = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        cohostTypeLayoutExtra.offsetY = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        cohostTypeLayoutExtra.scene = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        cohostTypeLayoutExtra.localLayoutOnly = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        cohostTypeLayoutExtra.isEnlargeMode = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        cohostTypeLayoutExtra.disableMatchComponent = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        cohostTypeLayoutExtra.rematchSpotId = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostTypeLayoutExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final CohostTypeLayoutExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CohostTypeLayoutExtra cohostTypeLayoutExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostTypeLayoutExtra cohostTypeLayoutExtra, List list) {
    }
}
