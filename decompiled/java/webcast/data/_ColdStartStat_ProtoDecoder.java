package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ColdStartStat_ProtoDecoder implements C0IMD<ColdStartStat> {
    public static ColdStartStat LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ColdStartStat coldStartStat = new ColdStartStat();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            coldStartStat.viewerCount = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        coldStartStat.totalCount = c1516680pZS.LJIIJJI();
                    }
                } else {
                    coldStartStat.seconds = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return coldStartStat;
            }
        }
    }

    @Override // X.C0IMD
    public final ColdStartStat LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ColdStartStat coldStartStat) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ColdStartStat coldStartStat, List list) {
    }
}
