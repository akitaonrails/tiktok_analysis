package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class _SocialGameLayoutExtra_ProtoDecoder implements C0IMD<SocialGameLayoutExtra> {
    public static SocialGameLayoutExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SocialGameLayoutExtra socialGameLayoutExtra = new SocialGameLayoutExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        socialGameLayoutExtra.gameId = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        socialGameLayoutExtra.gameJustDanceStatus = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        socialGameLayoutExtra.gameSessionId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        socialGameLayoutExtra.gameStartPlayMs = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        socialGameLayoutExtra.gameOptionId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        socialGameLayoutExtra.lokiPanelName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        socialGameLayoutExtra.requiredLokiResourceId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        socialGameLayoutExtra.optionalLokiResourceId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return socialGameLayoutExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final SocialGameLayoutExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SocialGameLayoutExtra socialGameLayoutExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SocialGameLayoutExtra socialGameLayoutExtra, List list) {
    }
}
