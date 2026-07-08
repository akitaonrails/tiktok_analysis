package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestShowdownConfigChange_ProtoDecoder implements C0IMD<GuestShowdownConfigChange> {
    public static GuestShowdownConfigChange LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestShowdownConfigChange guestShowdownConfigChange = new GuestShowdownConfigChange();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guestShowdownConfigChange.updateLoserNum = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        guestShowdownConfigChange.loserNum = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        guestShowdownConfigChange.updateAddDuration = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        guestShowdownConfigChange.addDuration = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        guestShowdownConfigChange.updateWinnerNum = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        guestShowdownConfigChange.winnerNum = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestShowdownConfigChange;
            }
        }
    }

    @Override // X.C0IMD
    public final GuestShowdownConfigChange LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuestShowdownConfigChange guestShowdownConfigChange) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestShowdownConfigChange guestShowdownConfigChange, List list) {
    }
}
