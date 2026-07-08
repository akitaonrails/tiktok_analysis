package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SortStatsTags_ProtoDecoder implements C0IMD<SortStatsTags> {
    public static SortStatsTags LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SortStatsTags sortStatsTags = new SortStatsTags();
        sortStatsTags.forAppLog = new ArrayList();
        sortStatsTags.forClientFunc = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        sortStatsTags.forClientFunc.add(_SortStatsTag_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    sortStatsTags.forAppLog.add(_SortStatsTag_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sortStatsTags;
            }
        }
    }

    public static void LJ(SortStatsTags sortStatsTags) {
        List<SortStatsTag> list = sortStatsTags.forAppLog;
        if (list == null) {
            sortStatsTags.forAppLog = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<SortStatsTag> it2 = sortStatsTags.forAppLog.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<SortStatsTag> list2 = sortStatsTags.forClientFunc;
        if (list2 == null) {
            sortStatsTags.forClientFunc = new ArrayList();
        } else {
            if (list2.isEmpty()) {
                return;
            }
            Iterator<SortStatsTag> it3 = sortStatsTags.forClientFunc.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SortStatsTags sortStatsTags) {
        LJ(sortStatsTags);
    }

    @Override // X.C0IMD
    public final SortStatsTags LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SortStatsTags sortStatsTags, List list) {
    }
}
