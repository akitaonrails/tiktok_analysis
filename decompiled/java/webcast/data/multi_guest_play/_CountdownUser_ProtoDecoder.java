package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownUser_ProtoDecoder implements C0IMD<CountdownUser> {
    public static CountdownUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CountdownUser countdownUser = new CountdownUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        countdownUser.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        countdownUser.linkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        countdownUser.score = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        countdownUser.completionProgressPercent = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        countdownUser.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        countdownUser.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownUser;
            }
        }
    }

    @Override // X.C0IMD
    public final CountdownUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CountdownUser countdownUser) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownUser countdownUser, List list) {
    }
}
