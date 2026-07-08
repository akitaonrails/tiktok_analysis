package webcast.api.game;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TnsLidLanguage_ProtoDecoder implements C0IMD<TnsLidLanguage> {
    public static TnsLidLanguage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TnsLidLanguage tnsLidLanguage = new TnsLidLanguage();
        tnsLidLanguage.predictLanguage = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        tnsLidLanguage.predictLanguage.add(C1516700pZU.LIZLLL(c1516680pZS));
                    }
                } else {
                    tnsLidLanguage.useTnsLidLanguage = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tnsLidLanguage;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TnsLidLanguage tnsLidLanguage) {
        TnsLidLanguage tnsLidLanguage2 = tnsLidLanguage;
        if (tnsLidLanguage2.predictLanguage == null) {
            tnsLidLanguage2.predictLanguage = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final TnsLidLanguage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TnsLidLanguage tnsLidLanguage, List list) {
    }
}
