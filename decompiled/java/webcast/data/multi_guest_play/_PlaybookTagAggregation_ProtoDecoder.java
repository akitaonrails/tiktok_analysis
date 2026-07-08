package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PlaybookTagAggregation_ProtoDecoder implements C0IMD<PlaybookTagAggregation> {
    public static PlaybookTagAggregation LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PlaybookTagAggregation playbookTagAggregation = new PlaybookTagAggregation();
        playbookTagAggregation.tags = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            playbookTagAggregation.tags.add(_PlaybookTagInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        playbookTagAggregation.firstLevelTagTranslatedName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    playbookTagAggregation.playbookFirstLevelTagType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playbookTagAggregation;
            }
        }
    }

    public static void LJ(PlaybookTagAggregation playbookTagAggregation) {
        List<PlaybookTagInfo> list = playbookTagAggregation.tags;
        if (list == null) {
            playbookTagAggregation.tags = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<PlaybookTagInfo> it2 = playbookTagAggregation.tags.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PlaybookTagAggregation playbookTagAggregation) {
        LJ(playbookTagAggregation);
    }

    @Override // X.C0IMD
    public final PlaybookTagAggregation LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookTagAggregation playbookTagAggregation, List list) {
    }
}
