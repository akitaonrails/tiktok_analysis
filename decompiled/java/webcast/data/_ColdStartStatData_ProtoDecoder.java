package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ColdStartStatData_ProtoDecoder implements C0IMD<ColdStartStatData> {
    public static ColdStartStatData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ColdStartStatData coldStartStatData = new ColdStartStatData();
        coldStartStatData.stats = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            coldStartStatData.stats.add(_ColdStartStat_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        coldStartStatData.status = c1516680pZS.LJIIJ();
                    }
                } else {
                    coldStartStatData.viewerCount = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return coldStartStatData;
            }
        }
    }

    public static void LJ(ColdStartStatData coldStartStatData) {
        List<ColdStartStat> list = coldStartStatData.stats;
        if (list == null) {
            coldStartStatData.stats = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<ColdStartStat> it2 = coldStartStatData.stats.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ColdStartStatData coldStartStatData) {
        LJ(coldStartStatData);
    }

    @Override // X.C0IMD
    public final ColdStartStatData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ColdStartStatData coldStartStatData, List list) {
    }
}
