package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SpecialCard_ProtoDecoder implements C0IMD<SpecialCard> {
    public static SpecialCard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SpecialCard specialCard = new SpecialCard();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            specialCard.payload = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        specialCard.id = c1516680pZS.LJIIJJI();
                    }
                } else {
                    specialCard.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return specialCard;
            }
        }
    }

    @Override // X.C0IMD
    public final SpecialCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SpecialCard specialCard) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SpecialCard specialCard, List list) {
    }
}
