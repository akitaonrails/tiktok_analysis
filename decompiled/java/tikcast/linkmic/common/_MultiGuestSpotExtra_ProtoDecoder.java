package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class _MultiGuestSpotExtra_ProtoDecoder implements C0IMD<MultiGuestSpotExtra> {
    public static MultiGuestSpotExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestSpotExtra multiGuestSpotExtra = new MultiGuestSpotExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        multiGuestSpotExtra.isEnlarged = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        multiGuestSpotExtra.isSingleZoomEnabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        multiGuestSpotExtra.isDoubleZoomEnabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        multiGuestSpotExtra.isSwitchSpotEnabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        multiGuestSpotExtra.spotRank = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        multiGuestSpotExtra.contentPositionType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        multiGuestSpotExtra.socialGameUser = _SocialGameUserSpotExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestSpotExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiGuestSpotExtra multiGuestSpotExtra) {
    }

    @Override // X.C0IMD
    public final MultiGuestSpotExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestSpotExtra multiGuestSpotExtra, List list) {
    }
}
