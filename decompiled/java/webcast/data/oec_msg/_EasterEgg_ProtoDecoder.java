package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EasterEgg_ProtoDecoder implements C0IMD<EasterEgg> {
    public static EasterEgg LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EasterEgg easterEgg = new EasterEgg();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        easterEgg.winnerRank = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        easterEgg.winnerRankTextType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        easterEgg.winnerRoomWinCnt = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        easterEgg.winnerRoomWinCntTextType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        easterEgg.winnerRankTextTypeTail = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        easterEgg.winnerRoomWinCntTextTypeTail = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return easterEgg;
            }
        }
    }

    @Override // X.C0IMD
    public final EasterEgg LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EasterEgg easterEgg) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EasterEgg easterEgg, List list) {
    }
}
