package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class _MultiGuestLayoutExtra_ProtoDecoder implements C0IMD<MultiGuestLayoutExtra> {
    public static MultiGuestLayoutExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestLayoutExtra multiGuestLayoutExtra = new MultiGuestLayoutExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        multiGuestLayoutExtra.originLayoutStyle = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        multiGuestLayoutExtra.currentLayoutStyle = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        multiGuestLayoutExtra.originMaxPosition = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        multiGuestLayoutExtra.currentMaxPosition = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        multiGuestLayoutExtra.enlargeStatus = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        multiGuestLayoutExtra.currentPanelLayoutType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        multiGuestLayoutExtra.socialGame = _SocialGameLayoutExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestLayoutExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiGuestLayoutExtra multiGuestLayoutExtra) {
    }

    @Override // X.C0IMD
    public final MultiGuestLayoutExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestLayoutExtra multiGuestLayoutExtra, List list) {
    }
}
