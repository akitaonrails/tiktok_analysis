package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SortStatsTag_ProtoDecoder implements C0IMD<SortStatsTag> {
    public static SortStatsTag LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SortStatsTag sortStatsTag = new SortStatsTag();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        sortStatsTag.value = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    sortStatsTag.key = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sortStatsTag;
            }
        }
    }

    @Override // X.C0IMD
    public final SortStatsTag LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SortStatsTag sortStatsTag) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SortStatsTag sortStatsTag, List list) {
    }
}
